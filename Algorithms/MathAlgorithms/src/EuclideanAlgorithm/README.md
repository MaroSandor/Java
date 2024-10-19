# Euklideszi Algoritmus (Euclidean Algorithm)

Az **Euklideszi algoritmus** egy hatékony módszer két szám legnagyobb közös osztójának (GCD) meghatározására. Az algoritmus az osztási maradékok segítségével iteratívan csökkenti a számokat addig, amíg az egyik szám nullává nem válik. Ekkor a másik szám lesz a legnagyobb közös osztó.

## Működés leírása

1. Kezdésként két számot adunk meg: `a` és `b`.
2. Ha `b` egyenlő nullával, akkor `a` a legnagyobb közös osztó.
3. Ellenkező esetben az algoritmus újra meghívja magát, ahol `a` értéke lesz `b`, és `b` értéke lesz `a % b` (az `a` és `b` közötti maradék).
4. Az eljárás addig folytatódik, amíg `b` értéke nulla nem lesz, ekkor az `a` lesz a GCD.

## Példa

Vegyük az alábbi két számot: `56` és `98`.

- **Első lépés**: `a = 56`, `b = 98`. Az algoritmus meghívja magát: `gcd(98, 56 % 98) = gcd(98, 56)`.
- **Második lépés**: `a = 98`, `b = 56`. Újabb meghívás: `gcd(56, 98 % 56) = gcd(56, 42)`.
- **Harmadik lépés**: `a = 56`, `b = 42`. Újabb meghívás: `gcd(42, 56 % 42) = gcd(42, 14)`.
- **Negyedik lépés**: `a = 42`, `b = 14`. Újabb meghívás: `gcd(14, 42 % 14) = gcd(14, 0)`.
- **Végső lépés**: `b = 0`, így a GCD `14`.

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Hatékony és gyors módszer két szám legnagyobb közös osztójának megtalálására.
    - Egyszerű és könnyen implementálható, rekurzív vagy iteratív formában is használható.

- **Hátrányok**:
    - Csak egész számok esetén használható, nem alkalmazható törtek legnagyobb közös osztójának közvetlen meghatározására.

## Használat

Az Euklideszi algoritmust széles körben használják matematikai problémák megoldásában, mint például törtek egyszerűsítése vagy kriptográfiai eljárásokban, ahol fontos a legnagyobb közös osztó gyors meghatározása.

## Pseudo-kód

```
EuclideanAlgorithm(a, b):
    if b == 0:
        return a
    else:
        return EuclideanAlgorithm(b, a % b)
```

A pseudo-kódban az `a` és `b` értékeit addig csökkenti az algoritmus, amíg `b` nullává nem válik, ekkor `a` lesz a legnagyobb közös osztó.
