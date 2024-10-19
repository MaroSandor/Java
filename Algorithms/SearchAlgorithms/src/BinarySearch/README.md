# Bináris keresés (Binary Search)

A **Binary Search** egy hatékony keresési algoritmus rendezett tömbökben való keresésre. Az algoritmus rekurzívan osztja a keresési területet két részre, amíg meg nem találja a keresett elemet, vagy amíg a keresési terület üres nem lesz.

## Működés leírása

1. Az algoritmus a keresési terület közepén lévő elemmel kezdi a vizsgálatot.
2. Ha a középső elem megegyezik a keresett értékkel, akkor megtaláltuk az elemet, és visszatérünk az indexével.
3. Ha a keresett elem kisebb, mint a középső elem, akkor a keresést a bal oldali részre szűkítjük.
4. Ha a keresett elem nagyobb, akkor a jobb oldali részre szűkítjük a keresést.
5. A folyamat addig folytatódik, amíg a keresési terület mérete nem lesz nulla, ekkor a keresett elem nem található a tömbben.

## Példa

Vegyük az alábbi rendezett tömböt: `[2, 3, 4, 10, 40]`.

- **Első lépés**: A keresett elem legyen `10`. Az algoritmus a középső elemet vizsgálja, ami `4`.
    - Mivel `10` nagyobb, a jobb oldali részre folytatjuk a keresést.

- **Második lépés**: A következő középső elem `10`, amely megegyezik a keresett elemmel, így a keresés sikeres, és az elem indexe `3`.

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Hatékony: időkomplexitása **O(log n)**, ami sokkal gyorsabbá teszi, mint a lineáris keresést nagy adathalmazokon.
    - Kevesebb összehasonlítást végez.

- **Hátrányok**:
    - Csak rendezett tömbökön működik, ami előfeltételt jelent.
    - Ha a bemeneti adatok nincsenek rendezve, először rendezni kell őket, ami plusz idő- és erőforrásigénnyel jár.

## Használat

A bináris keresést gyakran használják olyan helyzetekben, ahol a bemeneti adatok rendezettek, például adatbázis-keresések, és egyéb nagy adathalmazok kezelése esetén.

## Pseudo-kód

```plaintext
BinarySearch(array, target):
    left = 0
    right = length(array) - 1
    while left <= right:
        mid = left + (right - left) / 2
        if array[mid] == target:
            return mid
        else if array[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1
```

A pseudo-kódban a `left` és `right` változók jelölik a keresési területet, és az algoritmus addig szűkíti ezt a területet, amíg meg nem találja a keresett elemet, vagy a terület üres nem lesz.