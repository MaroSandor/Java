# Eratoszthenész szitája (Sieve of Eratosthenes)

Az **Eratoszthenész szitája** egy hatékony algoritmus a prímszámok meghatározására egy adott határig. Az algoritmus lényege, hogy egy sorozatban jelöli az összes összetett számot, és csak a prímszámokat hagyja meg.

## Működés leírása

1. Az algoritmus létrehoz egy `prime` nevű tömböt, amely eleinte minden számot prímként (igaz értékkel) jelöl meg.
2. Ezután az algoritmus elkezdi bejárni a számokat 2-től kezdve, amíg a négyzetük kisebb vagy egyenlő `n`-nel.
3. Ha egy szám prím (még nem lett jelölve összetettként), akkor annak minden többszörösét hamis értékkel jelöli meg, jelezve, hogy azok nem prímek.
4. Az algoritmus végül kilistázza az összes prím számot az adott határig.

## Példa

Vegyük az alábbi példát, ahol `n = 30`.

- **Első lépés**: Kezdetben minden számot prímként jelölünk (kivéve 0 és 1).
- **Második lépés**: A 2-es szám prím, ezért annak minden többszörösét (4, 6, 8, ...) összetettként jelöljük.
- **Harmadik lépés**: A következő szám a 3-as, amely még mindig prímként van jelölve, így annak minden többszörösét (9, 12, 15, ...) összetettként jelöljük.
- **Negyedik lépés**: Folytatjuk ezt a folyamatot a következő számokkal (5, 7, stb.), amíg a `p * p <= n` feltétel teljesül.
- **Eredmény**: A prím számok 2-től 30-ig: `2, 3, 5, 7, 11, 13, 17, 19, 23, 29`.

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Nagyon hatékony módja a prímszámok meghatározásának, különösen nagy `n` esetén.
    - Egyszerű és könnyen implementálható algoritmus.
- **Hátrányok**:
    - Memóriaigénye O(n), mivel egy `n` méretű tömböt kell fenntartani.
    - Nagyon nagy számok esetén a memóriahasználat korlátozó tényező lehet.

## Használat

Az Eratoszthenész szitáját általában akkor használják, amikor egy adott határig szeretnénk megtalálni az összes prímszámot. Gyakran használják matematikai feladatok megoldására, például számelméleti kutatások során vagy kriptográfiában.

## Pseudo-kód

```
SieveOfEratosthenes(n):
    prime = array of true values, length n+1
    for p from 2 to sqrt(n):
        if prime[p]:
            for i from p*p to n step p:
                prime[i] = false
    for p from 2 to n:
        if prime[p]:
            print(p)
```

A pseudo-kódban a `prime` tömb minden eleme kezdetben igaz értékű, majd az algoritmus megjelöli a nem prímeket. Az algoritmus végén az összes igaz értékű elem a prímszámokat jelöli.