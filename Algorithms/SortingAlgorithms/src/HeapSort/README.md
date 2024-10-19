# Halom rendezés (Heap Sort)

A **Heap Sort** egy hatékony, összehasonlításon alapuló rendezési algoritmus, amely a maximális vagy minimális kupac adatszerkezetet használja a tömb elemeinek rendezésére. Az algoritmus egy **oszd meg és uralkodj** elvet követ, ahol a bemeneti adathalmazból először kupacot készítünk, majd egyesével kivesszük a legnagyobb vagy legkisebb elemeket, és a helyükre rendezzük őket.

## Működés leírása
1. **Kupac létrehozása**: Az algoritmus első lépésként a tömb elemeiből egy maximális (vagy minimális) kupacot hoz létre. Egy maximális kupacban minden szülőcsomópont értéke nagyobb, mint a gyermekeié.
2. **Elemek rendezése**: Miután a kupac elkészült, az algoritmus kicseréli a kupac tetején lévő legnagyobb elemet a tömb utolsó elemével. Ezután csökkenti a kupac méretét, és újra kupacot készít az aktuális elemekből.
3. **Ismétlés**: Az előző lépéseket addig ismétli, amíg az összes elem megfelelő helyre nem kerül a tömbben.

## Példa

Vegyük az alábbi tömböt: `[64, 25, 12, 22, 11]`.

- **Első lépés**: Maximális kupacot készítünk a tömbből, ahol a legnagyobb elem lesz a gyökér.
- **Második lépés**: A legnagyobb elemet (64) kicseréljük a tömb utolsó elemével (11), majd a kupac méretét csökkentjük, és újra kupacot készítünk.
- **Harmadik lépés**: Ismét kivesszük a legnagyobb elemet, és a tömb megfelelő helyére tesszük.

A folyamat addig folytatódik, amíg a teljes tömb rendezett nem lesz: `[11, 12, 22, 25, 64]`.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - A halom rendezés legrosszabb, legjobb és átlagos esetben is **O(n log n)** időkomplexitású, ami hatékonyabbá teszi a buborékrendezéshez képest.
    - Helyben végzi a rendezést, így nem igényel extra memóriát.

- **Hátrányok**:
    - Az algoritmus nem stabil, azaz két egyenértékű elem sorrendje megváltozhat a rendezés során.
    - A gyakori csere műveletek miatt nem mindig a leghatékonyabb, ha az elemek közötti különbségek kicsik.

## Használat
A Heap Sort algoritmust akkor használják, amikor nagy adathalmazokat kell rendezni, és az időkomplexitás fontos szempont. Nem stabil, de hatékony, ha az extra memóriahasználat elkerülése a cél.

## Pseudo-kód
KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ:
`HeapSort(array): BuildMaxHeap(array) for i from length(array) - 1 to 1: swap(array[0], array[i]) heapSize -= 1 MaxHeapify(array, 0)`

A pseudo-kódban a `BuildMaxHeap` függvény a maximális kupacot hozza létre a tömb elemeiből, míg a `MaxHeapify` biztosítja, hogy a kupac tulajdonság érvényes maradjon az egyes cserék után.