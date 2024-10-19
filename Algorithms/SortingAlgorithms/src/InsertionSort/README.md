# Beszúró rendezés (Insertion Sort)

A **Beszúró rendezés** egy egyszerű és hatékony algoritmus kisebb méretű tömbök rendezésére. Az algoritmus úgy működik, hogy a tömb elemeit egyenként beilleszti a megfelelő helyre, mintha egy kártyapaklit rendezne.

## Működés leírása
1. Az algoritmus az első elemet rendezettnek tekinti, majd a következő elemeket egyenként beilleszti a már rendezett részbe.
2. Minden egyes elem esetén az algoritmus visszafelé halad, és megkeresi a helyes pozíciót, majd beszúrja oda.
3. A rendezett rész egyre növekszik, amíg az egész tömb rendezett nem lesz.

## Példa

Vegyük az alábbi tömböt: `[64, 25, 12, 22, 11]`.

- **Első iteráció**: Az algoritmus az első elemet (64) rendezettnek tekinti.
- **Második iteráció**: A következő elem a 25, amit beillesztünk a megfelelő helyre:
    - 25 kisebb, mint 64, így a helyük felcserélésre kerül → `[25, 64, 12, 22, 11]`
- **Harmadik iteráció**: A következő elem a 12:
    - 12 kisebb, mint 64, így 64 helyére kerül → `[25, 12, 64, 22, 11]`
    - 12 kisebb, mint 25, így 25 helyére kerül → `[12, 25, 64, 22, 11]`
- **Negyedik iteráció**: A következő elem a 22:
    - 22 kisebb, mint 64, így 64 helyére kerül → `[12, 25, 22, 64, 11]`
    - 22 kisebb, mint 25, így 25 helyére kerül → `[12, 22, 25, 64, 11]`
- **Ötödik iteráció**: Az utolsó elem a 11:
    - 11 kisebb, mint 64, 25, 22 és 12, így mindegyiket egy pozícióval jobbra mozgatjuk → `[11, 12, 22, 25, 64]`

Most a tömb rendezett: `[11, 12, 22, 25, 64]`.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - Hatékony kisebb tömbök esetén, és stabil rendezést biztosít.
    - Az algoritmus adaptív, ami azt jelenti, hogy már majdnem rendezett tömböknél gyorsabban működik.

- **Hátrányok**:
    - Nagy időkomplexitású: legrosszabb és átlagos esetben **O(n²)**, ami miatt nagy adathalmazokra nem praktikus.

## Használat
A beszúró rendezést általában kisebb méretű tömböknél vagy olyan esetekben használják, amikor a bemeneti adatok majdnem rendezettek. Gyakran alkalmazzák oktatási célokra is, mivel egyszerűen megérthető és demonstrálja az összehasonlításon alapuló rendezés működését.

## Pseudo-kód
KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ
`InsertionSort(array): n = length(array) for i from 1 to n-1: key = array[i] j = i - 1 while j >= 0 and array[j] > key: array[j + 1] = array[j] j = j - 1 array[j + 1] = key`

A pseudo-kódban az `i` az aktuális iterációt jelöli, míg a `j` a már rendezett részben való visszalépést. Az algoritmus minden lépésben az aktuális elemet a megfelelő helyére illeszti, amíg a tömb teljesen rendezett nem lesz.
