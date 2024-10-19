# Interpolációs keresés (Interpolation Search)

Az **Interpolációs keresés** egy hatékony keresési algoritmus, amelyet rendezett tömbökben való keresésre használunk. Az algoritmus az elemek eloszlását figyelembe véve próbálja megjósolni a keresett elem helyét, ami hatékonyabbá teszi a keresést, mint a lineáris vagy bináris keresést bizonyos esetekben.

## Működés leírása
1. Az algoritmus a keresett elem és a tömb szélsőértékei alapján kiszámítja a feltételezett helyet (az interpolációs formula segítségével).
2. Az így meghatározott helyen ellenőrzi az elemet:
    - Ha egyezik a keresett elemmel, az algoritmus megtalálta az elemet.
    - Ha a keresett elem nagyobb, akkor a keresés a tömb felső részében folytatódik.
    - Ha a keresett elem kisebb, akkor az alsó részben folytatódik a keresés.
3. Az algoritmus addig folytatódik, amíg az elem megtalálásra kerül, vagy a keresés kimeríti a lehetőségeket.

## Példa
Vegyük az alábbi tömböt: `[10, 20, 30, 40, 50, 60, 70, 80, 90]`, és keressük meg benne a `70` értéket.

- **Első lépés**: Az algoritmus kiszámítja a feltételezett pozíciót a `70` érték alapján.
- Az interpolációs formula segítségével az algoritmus meghatározza, hogy a `70` valószínűleg a tömb felső részében található.
- **Második lépés**: Az algoritmus a kiszámított helyen ellenőrzi az elemet, és mivel `70` megtalálható, az algoritmus visszaadja annak pozícióját.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - Hatékony lehet olyan esetekben, amikor az elemek eloszlása egyenletes, és a keresési idő közel **O(log log n)** lehet.
    - Gyorsabb lehet, mint a bináris keresés, ha a keresett elemek eloszlása jól előrejelezhető.
- **Hátrányok**:
    - Nem garantált a hatékonyság, ha az elemek eloszlása egyenetlen.
    - Az algoritmus csak rendezett tömbökön működik.

## Használat
Az interpolációs keresést általában nagy, rendezett adathalmazokban való keresésre használják, ahol az elemek eloszlása nagyjából egyenletes. Például használható adatbázisokban, ahol gyakran kell bizonyos kulcsok szerint keresni.

## Pseudo-kód
KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ

```
InterpolationSearch(array, x):
    low = 0
    high = length(array) - 1

    while low <= high and x >= array[low] and x <= array[high]:
        if low == high:
            if array[low] == x:
                return low
            return -1

        pos = low + ((x - array[low]) * (high - low) / (array[high] - array[low]))

        if array[pos] == x:
            return pos

        if array[pos] < x:
            low = pos + 1
        else:
            high = pos - 1

    return -1
```

A pseudo-kódban az `x` a keresett elem, míg a `low` és `high` változók jelölik az aktuális keresési intervallumot. Az algoritmus interpolációs módszert használ a feltételezett hely meghatározására, amely segít csökkenteni a keresési időt, ha az elemek egyenletesen oszlanak el.
