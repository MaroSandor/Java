# Halmazrendezés (Merge Sort)

A **Halmazrendezés** egy hatékony, oszd meg és uralkodj elvű algoritmus, amely rekurzívan felosztja a tömböt kisebb részekre, majd egyesíti azokat rendezett módon. Ez az algoritmus különösen hasznos nagy méretű tömbök rendezésére, mivel időkomplexitása **O(n log n)**, ami jobb, mint az egyszerűbb rendezési algoritmusoké.

## Működés leírása
1. Az algoritmus felosztja a bemeneti tömböt két egyenlő részre, amíg az egyes részek mérete egyelemű nem lesz.
2. Ezután az algoritmus az egyes részeket párosával egyesíti úgy, hogy azok növekvő sorrendbe kerüljenek.
3. Az egyesítés során két rendezett részlistát egyesítünk egy új, rendezett listába.
4. A folyamat addig folytatódik, amíg a teljes tömb rendezetté nem válik.

## Példa

Vegyük az alábbi tömböt: `[64, 25, 12, 22, 11]`.

- **Felosztás**:
    - A tömb két részre oszlik: `[64, 25, 12]` és `[22, 11]`.
    - További felosztás: `[64, 25, 12]` → `[64]` és `[25, 12]`, majd `[25, 12]` → `[25]` és `[12]`.
    - `[22, 11]` is felosztásra kerül: `[22]` és `[11]`.
- **Egyesítés**:
    - `[25]` és `[12]` egyesítése: `[12, 25]`.
    - `[64]` és `[12, 25]` egyesítése: `[12, 25, 64]`.
    - `[22]` és `[11]` egyesítése: `[11, 22]`.
    - Végül `[12, 25, 64]` és `[11, 22]` egyesítése: `[11, 12, 22, 25, 64]`.

Most a tömb rendezett: `[11, 12, 22, 25, 64]`.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - Hatékony nagy méretű tömbök esetén, mivel az időkomplexitás **O(n log n)**.
    - Stabil rendezési algoritmus, ami azt jelenti, hogy két egyenértékű elem sorrendje nem változik meg.

- **Hátrányok**:
    - Extra memóriát igényel a tömbök felosztása és egyesítése miatt, ami nagyobb memóriafelhasználást eredményezhet.

## Használat
A halmazrendezést gyakran használják olyan helyzetekben, ahol fontos a stabil rendezés és az időhatékonyság. Szintén hasznos nagy méretű adathalmazok rendezésénél, ahol más algoritmusok már nem lennének hatékonyak.

## Pseudo-kód
KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ
`MergeSort(array): if length(array) > 1: mid = length(array) / 2 leftHalf = array[0:mid] rightHalf = array[mid:] MergeSort(leftHalf) MergeSort(rightHalf) i = j = k = 0 while i < length(leftHalf) and j < length(rightHalf): if leftHalf[i] < rightHalf[j]: array[k] = leftHalf[i] i += 1 else: array[k] = rightHalf[j] j += 1 k += 1 while i < length(leftHalf): array[k] = leftHalf[i] i += 1 k += 1 while j < length(rightHalf): array[k] = rightHalf[j] j += 1 k += 1`

A pseudo-kódban az `array` a bemeneti tömböt jelöli, amelyet rekurzívan felosztunk és egyesítünk, amíg a teljes tömb rendezett nem lesz.
