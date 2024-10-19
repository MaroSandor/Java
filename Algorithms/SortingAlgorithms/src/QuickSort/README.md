# Gyors rendezés (Quick Sort)

A **Quick Sort** egy hatékony oszd meg és uralkodj alapú rendezési algoritmus, amely széles körben használt a számítástechnikában. Az algoritmus úgy működik, hogy egy úgynevezett pivot elemet választ a tömbből, majd a tömböt két részre osztja: azokra az elemekre, amelyek kisebbek vagy egyenlők a pivotnál, és azokra, amelyek nagyobbak. A folyamat rekurzívan folytatódik a részhalmazokon, amíg az összes elem rendezett nem lesz.

## Működés leírása

1. Az algoritmus első lépésként kiválaszt egy pivot elemet. Ez az elem lehet az utolsó elem, az első elem, vagy akár véletlenszerűen kiválasztott elem is.
2. Az elemeket úgy rendezi, hogy minden elem, amely kisebb vagy egyenlő a pivotnál, a bal oldalra kerül, míg a nagyobb elemek a jobb oldalra.
3. A pivot elem a megfelelő helyére kerül, majd az algoritmus rekurzívan alkalmazza ugyanezt a logikát a bal és a jobb oldali részhalmazokra.

## Példa

Vegyük az alábbi tömböt: `[10, 7, 8, 9, 1, 5]`.

- **Első iteráció**: Az algoritmus kiválasztja az utolsó elemet, azaz a `5`-öt pivotként. Ezután az elemeket átrendezi úgy, hogy a kisebb elemek a bal oldalon legyenek, és a pivot a megfelelő helyre kerüljön → `[1, 5, 8, 9, 10, 7]`.
- **Rekurzió**: Az algoritmus rekurzívan alkalmazza ugyanezt a bal és jobb oldali részhalmazokra, amíg az összes elem növekvő sorrendbe nem kerül.

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Általában gyors és hatékony, átlagos időkomplexitása **O(n log n)**.
    - Az oszd meg és uralkodj elv révén hatékonyan működik nagyobb adathalmazok esetén.

- **Hátrányok**:
    - Legrosszabb esetben **O(n²)** a teljesítménye, ha a pivot rosszul van megválasztva (pl. már rendezett tömb esetén).
    - Nem stabil rendezési algoritmus, azaz két egyenértékű elem sorrendje megváltozhat.

## Használat

A Quick Sort széles körben használt nagy adathalmazok gyors rendezésére. Gyakran alkalmazzák rendszerek belső rendezésében és más területeken, ahol a hatékonyság és a sebesség fontos szempont.

## Pseudo-kód

KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ

```
QuickSort(array, low, high):
    if low < high:
        pivotIndex = Partition(array, low, high)
        QuickSort(array, low, pivotIndex - 1)
        QuickSort(array, pivotIndex + 1, high)

Partition(array, low, high):
    pivot = array[high]
    i = low - 1
    for j from low to high - 1:
        if array[j] <= pivot:
            i = i + 1
            swap(array[i], array[j])
    swap(array[i + 1], array[high])
    return i + 1
```

A pseudo-kódban az `i` az aktuális pozíciót jelöli, amely folyamatosan követi, hogy hol kell elhelyezni a kisebb elemeket. A `Partition` függvény felelős az elemek átrendezéséért, hogy a pivot a megfelelő helyre kerüljön, és az algoritmus rekurzívan folytatja a rendezést a részhalmazokon, amíg az egész tömb rendezett nem lesz.
