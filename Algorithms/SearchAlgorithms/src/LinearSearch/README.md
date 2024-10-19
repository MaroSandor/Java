# Lineáris keresés (Linear Search)

A **Lineáris keresés** egy egyszerű algoritmus, amely sorban végigmegy egy tömb vagy lista elemein, amíg meg nem találja a keresett értéket. Ha megtalálja az elemet, visszaadja annak indexét, különben -1-et ad vissza, jelezve, hogy az elem nincs a tömbben.

## Működés leírása

1. Az algoritmus az adatsor első elemével kezdve lépésről lépésre összehasonlítja a keresett értéket az aktuális elemmel.
2. Ha az aktuális elem megegyezik a keresett értékkel, akkor az algoritmus visszaadja ennek az elemnek az indexét.
3. Ha a keresett elem nem található meg a tömbben, akkor az algoritmus -1-et ad vissza.

## Példa

Vegyük az alábbi tömböt: `[2, 3, 4, 10, 40]`.

- A keresett érték: **10**
    - Az algoritmus először összehasonlítja a 2-es elemmel, majd a 3-assal, utána a 4-essel.
    - A 10-es elem a negyedik pozíción található, így az algoritmus visszaadja az indexet: **3**.

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Egyszerű és könnyen érthető.
    - Nincs szükség a tömb előzetes rendezésére.
- **Hátrányok**:
    - Nagy időkomplexitású: legrosszabb és átlagos esetben is **O(n)**, ami miatt nagy adathalmazokra nem praktikus.
    - Hatékonysága alacsony, különösen akkor, ha az elem a lista végén vagy nincs benne.

## Használat

A lineáris keresést akkor érdemes használni, ha a keresett adatsor kicsi, vagy ha a lista nem rendezett, és nem szükséges a keresési hatékonyság optimalizálása.

## Pseudo-kód

```
LinearSearch(array, x):
    n = length(array)
    for i from 0 to n-1:
        if array[i] == x:
            return i
    return -1
```

A pseudo-kódban az `i` az aktuális iterációt jelöli. Az algoritmus minden lépésben összehasonlítja az aktuális elemet a keresett értékkel, és ha találat van, visszaadja az indexet. Ha a keresés végéig nincs találat, -1-et ad vissza.
