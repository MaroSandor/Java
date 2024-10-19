# Radix rendezés (Radix Sort)

A **Radix Sort** egy nem-összehasonlításos rendezési algoritmus, amely a számok számjegyeit felhasználva rendezi a tömböt. Az algoritmus a számokat az egyes helyiértékek szerint csoportosítja, és egy stabil számjegy-alapú rendezést alkalmaz minden helyiértékre, a legkevésbé jelentőstől (LSB) a legjelentősebbig (MSB).

## Működés leírása

1. Az algoritmus megkeresi a legnagyobb értéket a tömbben, és meghatározza, hány számjegy szükséges annak ábrázolásához.
2. Az algoritmus helyiértékenként rendezi a számokat, kezdve az egyes helyiértékekkel (tízesek, százasok stb.).
3. Ehhez a Counting Sort algoritmus egy módosított változatát használja, amely figyelembe veszi a számjegyeket a megfelelő helyiértéken.
4. A folyamatot mindaddig folytatja, amíg minden helyiértéket figyelembe nem vesz, és így a tömb rendezetté válik.

## Példa

Vegyük az alábbi tömböt: `[170, 45, 75, 90, 802, 24, 2, 66]`.

- **Első lépés (egyes helyiérték szerint)**: Az algoritmus rendez a legkevésbé jelentős számjegy szerint (1-esek helyiértéke):
    - `[170, 90, 802, 2, 24, 45, 75, 66]`

- **Második lépés (tízesek helyiértéke szerint)**: A tízesek helyiértéke szerint rendez:
    - `[802, 2, 24, 45, 66, 170, 75, 90]`

- **Harmadik lépés (százasok helyiértéke szerint)**: A százasok helyiértéke szerint rendezi a tömböt:
    - `[2, 24, 45, 66, 75, 90, 170, 802]`

Most a tömb rendezett: `[2, 24, 45, 66, 75, 90, 170, 802]`.

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Hatékony nagy mennyiségű, de fix hosszúságú egész számok rendezésére.
    - Időkomplexitása **O(nk)**, ahol `n` az elemek száma, `k` pedig a legnagyobb elem hosszúsága.
    - Stabil algoritmus, tehát az azonos értékű elemek sorrendje nem változik meg a rendezés során.

- **Hátrányok**:
    - Csak akkor hatékony, ha az elemek számjegy szerinti eloszlása viszonylag egyenletes.
    - Nem általánosan alkalmazható minden adattípusra, például lebegőpontos számok vagy negatív számok esetén bonyolultabb.

## Használat

A radix rendezést gyakran használják nagy mennyiségű egész szám rendezésére, különösen akkor, ha az elemek hossza nem túl változó. Szintén alkalmazható számlálás alapú problémák esetén, ahol a stabil rendezés követelménye.

## Pseudo-kód

KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ

```
RadixSort(array):
    max = getMax(array)
    exp = 1
    while max / exp > 0:
        CountingSort(array, exp)
        exp *= 10
```

A pseudo-kódban az `exp` a helyiértéket jelöli, amely alapján a Counting Sort rendezést végzi el. Az algoritmus minden iteráció során a következő helyiértékre lép tovább, amíg a legnagyobb helyiértéket is fel nem dolgozza.
