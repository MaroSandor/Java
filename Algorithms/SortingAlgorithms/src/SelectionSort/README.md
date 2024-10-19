# Selection Sort (Kiválasztásos rendezés)

A **Selection Sort** egy egyszerű rendezési algoritmus, amely tömbök rendezésére szolgál. Az algoritmus úgy működik, hogy sorban kiválasztja a legkisebb elemet az adatsor hátralévő részeiből, majd a jelenlegi helyére cseréli. Az algoritmus ismétli ezt a folyamatot, amíg az összes elem helyére nem kerül.

## Működés leírása
1. Az algoritmus először végigmegy az adatsoron, és megkeresi a legkisebb elemet.
2. Az első elemet kicseréli a megtalált legkisebb elemmel.
3. Ezt a folyamatot ismétli a többi elemre is, mindaddig, amíg az összes elem a helyére nem kerül, így a tömb rendezett lesz.

## Példa
Vegyük az alábbi tömböt: `[64, 25, 12, 22, 11]`.

- **Első iteráció**: Az algoritmus megkeresi a legkisebb elemet (11), majd kicseréli az első elemmel (64) → `[11, 25, 12, 22, 64]`
- **Második iteráció**: Megkeresi a következő legkisebb elemet (12), majd kicseréli a második elemmel (25) → `[11, 12, 25, 22, 64]`
- **Harmadik iteráció**: Megkeresi a legkisebb elemet a hátralévő részből (22), majd kicseréli a harmadik elemmel (25) → `[11, 12, 22, 25, 64]`
- **Negyedik iteráció**: A maradék két elem már a helyén van, így a tömb rendezett: `[11, 12, 22, 25, 64]`.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - Egyszerűen implementálható és megérthető.
    - Kevés memóriát használ, mivel helyben rendez.
- **Hátrányok**:
    - Időkomplexitása **O(n²)**, ami miatt nagy adathalmazok esetén nem hatékony.
    - Nem stabil algoritmus, mivel a hasonló értékű elemek sorrendje megváltozhat.

## Használat
A Selection Sort algoritmust általában akkor használják, ha a tömb mérete kicsi és a memóriahasználat minimalizálása fontosabb, mint a teljesítmény.

## Pseudo-kód

```
SelectionSort(array):
    n = length(array)
    for i from 0 to n-1:
        minIndex = i
        for j from i+1 to n:
            if array[j] < array[minIndex]:
                minIndex = j
        swap(array[minIndex], array[i])
```

A pseudo-kódban az `i` az aktuális iterációt jelöli, míg a `j` a tömb aktuális elemét. Az algoritmus minden lépésben megkeresi a legkisebb elemet, és kicseréli a jelenlegi helyére.
