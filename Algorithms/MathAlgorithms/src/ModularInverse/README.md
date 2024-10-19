# Moduláris Inverz (Modular Inverse)
A **Moduláris Inverz** egy matematikai fogalom, amelyet gyakran használunk kriptográfiában és számos más alkalmazási területen. Az a szám, amit `a`-nak hívunk, akkor rendelkezik moduláris inverzzel egy `m` modullal szemben, ha található olyan `x` szám, amely kielégíti az `(a * x) % m == 1` egyenletet. A moduláris inverz lényegében olyan értéket keres, amely az adott modullal osztva maradék nélkül visszaadja az 1-et.

## Működés leírása
1. Az algoritmus az euklideszi algoritmus kiterjesztett változatát használja, amely segítségével megtalálható a két szám legnagyobb közös osztója és az együtthatók, amelyekből a moduláris inverz kiszámítható.
2. Az algoritmus sorozatosan osztásokat végez, és egyenletek segítségével visszavezeti a megoldást a legnagyobb közös osztóhoz.
3. A végén, ha a legnagyobb közös osztó 1, akkor található moduláris inverz, és az `x` értéket pozitívvá tesszük a modul m0-nak való hozzáadásával.

## Példa
Vegyük az alábbi számokat: `a = 3` és `m = 11`.
- A célunk, hogy találjunk egy olyan `x` értéket, amely kielégíti a `(3 * x) % 11 == 1` egyenletet.
- Az algoritmus alkalmazásával megtalálhatjuk, hogy a moduláris inverz `x = 4`, mivel `(3 * 4) % 11 = 1`.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - Hasznos számos területen, például kriptográfiában, különösen RSA algoritmusban, és más helyeken, ahol modulo műveletek szükségesek.
    - Hatékony az euklideszi algoritmus segítségével történő számítás.
- **Hátrányok**:
    - Csak akkor létezik moduláris inverz, ha a `a` és `m` relatív prímek, vagyis legnagyobb közös osztójuk 1.

## Használat
A moduláris inverzt különösen gyakran használják kriptográfiában, például az RSA titkosítás során. Az inverz meghatározása biztosítja az adatok titkosítását és dekódolását, így kulcsfontosságú része a nyilvános kulcsú titkosításnak.

## Pseudo-kód

```pseudo
ModularInverse(a, m):
    m0 = m
    x0 = 0
    x1 = 1

    while a > 1:
        # q is quotient
        q = a // m

        t = m

        # m is remainder now, process same as Euclid's algo
        m = a % m
        a = t

        t = x0
        x0 = x1 - q * x0
        x1 = t

    if x1 < 0:
        x1 = x1 + m0

    return x1
```