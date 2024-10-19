# Hatványozás négyzetre emeléssel (Exponentiation by Squaring)

A **Hatványozás négyzetre emeléssel** egy hatékony algoritmus egy szám hatványozására. Az algoritmus a "oszd meg és uralkodj" módszert alkalmazza, amely lehetővé teszi az exponenciális kifejezés gyors kiszámítását, különösen nagy kitevők esetén. Az algoritmus rekurzív módon bontja le a problémát, csökkentve az összehasonlítások és szorzások számát.

## Működés leírása

1. Ha az exponens nulla, akkor az eredmény 1, mivel bármely szám nulladik hatványa 1.
2. Ha az exponens páros, akkor a `base` (alap) négyzetét vesszük, és az exponenst elfelezzük.
3. Ha az exponens páratlan, akkor megszorozzuk az alapot a négyzetével és az exponensből 1-et kivonunk, majd felezzük az exponenst.
4. A rekurzív lépések addig folytatódnak, amíg az exponens el nem éri a nullát.

## Példa

Vegyük az alábbi példát: `2^10`.

- **Első lépés**: Mivel az exponens 10 páros, négyzetre emeljük az alapot és felezzük az exponenst: `2^10` → `(2^2)^5`.
- **Második lépés**: Az exponens most páratlan (5), így az alapot megszorozzuk a négyzetével, és az exponensből 1-et kivonunk: `(2^2)^5` → `2 * (2^4)^2`.
- **Harmadik lépés**: Az exponens most páros (2), így újra négyzetre emeljük az alapot és felezzük az exponenst: `(2^4)^2` → `(2^8)^1`.
- **Negyedik lépés**: Az exponens most páratlan (1), így az alapot megszorozzuk a négyzetével: `(2^8)^1` → `2 * 2^8`.
- **Eredmény**: Az eredmény `1024` lesz.

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Nagyon hatékony, különösen nagy exponensek esetén.
    - Az időkomplexitása **O(log n)**, ahol `n` az exponens.

- **Hátrányok**:
    - Ha az alap egy tört vagy lebegőpontos szám, akkor a művelet veszteséges lehet, és pontossági problémákat okozhat.

## Használat

A hatványozás négyzetre emeléssel széles körben használatos matematikai számításokban, kriptográfiában, mint például RSA titkosítás, ahol nagy hatványok kiszámítására van szükség gyorsan és hatékonyan.

## Pseudo-kód

```pseudo
ExponentiationBySquaring(base, exponent):
    if exponent < 0:
        base = 1 / base
        exponent = -exponent
    return powerRecursive(base, exponent)

powerRecursive(base, exponent):
    if exponent == 0:
        return 1
    else if exponent % 2 == 0:
        return powerRecursive(base * base, exponent / 2)
    else:
        return base * powerRecursive(base * base, (exponent - 1) / 2)
```

A pseudo-kódban az `exponent` az aktuális kitevőt jelöli. Az algoritmus minden lépésben hatékonyan felezi az exponens értékét, ezzel jelentősen csökkentve a szükséges szorzások számát a végső eredmény eléréséhez.
