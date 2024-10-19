# Buborék rendezés (Bubble Sort)

A **Bubble Sort** egy egyszerű, de hatékony algoritmus kisebb méretű tömbök rendezésére. Az algoritmus úgy működik, hogy ismételten végigmegy az adatsoron, és összehasonlítja a szomszédos elemeket. Ha egy elem nagyobb, mint a mellette lévő, akkor felcseréli őket. Ezt a folyamatot addig folytatja, amíg a teljes tömb növekvő sorrendbe nem kerül.

## Működés leírása
1. Az algoritmus első lépésként végigmegy az adatsoron, és minden egyes elemet összehasonlít a következővel.
2. Ha az aktuális elem nagyobb, mint a következő elem, akkor felcseréli őket.
3. Az algoritmus folyamatosan "buborékoltatja" a legnagyobb elemeket a tömb végére, mint ahogy a buborékok is a víz felszínére emelkednek.
4. A folyamat addig folytatódik, amíg egy teljes bejárás során nem történik csere, ami azt jelenti, hogy a tömb rendezett.

## Példa

Vegyük az alábbi tömböt: `[64, 25, 12, 22, 11]`.

- **Első iteráció**: Az algoritmus végigmegy a tömbön, és összehasonlítja az elemeket:
    - 64 és 25: mivel 64 > 25, felcseréljük őket → `[25, 64, 12, 22, 11]`
    - 64 és 12: mivel 64 > 12, felcseréljük őket → `[25, 12, 64, 22, 11]`
    - 64 és 22: mivel 64 > 22, felcseréljük őket → `[25, 12, 22, 64, 11]`
    - 64 és 11: mivel 64 > 11, felcseréljük őket → `[25, 12, 22, 11, 64]`

- **Második iteráció**: A következő bejárásban:
    - 25 és 12: mivel 25 > 12, felcseréljük őket → `[12, 25, 22, 11, 64]`
    - 25 és 22: mivel 25 > 22, felcseréljük őket → `[12, 22, 25, 11, 64]`
    - 25 és 11: mivel 25 > 11, felcseréljük őket → `[12, 22, 11, 25, 64]`

- **Harmadik iteráció**: Folytatva a rendezést:
    - 12 és 22: nem kell csere
    - 22 és 11: mivel 22 > 11, felcseréljük őket → `[12, 11, 22, 25, 64]`

- **Negyedik iteráció**: Az utolsó lépések során:
    - 12 és 11: mivel 12 > 11, felcseréljük őket → `[11, 12, 22, 25, 64]`

Most a tömb rendezett: `[11, 12, 22, 25, 64]`.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - Egyszerű és könnyen megérthető algoritmus, amely jól működik kis méretű tömbök esetén.
    - Stabil rendezési algoritmus, azaz két egyenértékű elem sorrendje nem változik meg a rendezés során.

- **Hátrányok**:
    - Nagy időkomplexitású: legrosszabb, legjobb és átlagos esetben is **O(n²)**, ami miatt nagy adathalmazokra nem praktikus.
    - Nem hatékony, mivel sok szükségtelen összehasonlítást és cserét végez.

## Használat
A buborék rendezést általában oktatási célokra használják, hogy bemutassák a rendezési algoritmusok alapjait, és hogyan lehet egyszerű összehasonlításokkal és cserékkel rendezést végezni.

## Pseudo-kód
KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ
`BubbleSort(array): n = length(array) for i from 0 to n-1: for j from 0 to n-i-2: if array[j] > array[j+1]: swap(array[j], array[j+1])`

A pseudo-kódban az `i` az aktuális iterációt jelöli, míg a `j` a tömb aktuális elemét. Az algoritmus minden lépésben összehasonlítja a szomszédos elemeket, és szükség esetén felcseréli őket, amíg a tömb teljesen rendezett nem lesz.
