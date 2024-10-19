# Dijkstra Algoritmus

A **Dijkstra Algoritmus** egy széles körben használt algoritmus a legrövidebb út megtalálására súlyozott, irányított vagy irányítatlan gráfokban, ahol az élhosszak nem negatívak. Az algoritmus főként olyan helyzetekben alkalmazható, ahol a kezdő csúcsból kell meghatározni a legrövidebb utakat az összes többi csúcsba.

## Működés leírása

1. Az algoritmus első lépésként beállítja a kezdő csúcsot, és minden csúcs távolságát végtelenre állítja, kivéve a kezdő csúcsot, amelynek távolsága nulla lesz.
2. Az algoritmus egy prioritási sor segítségével kiválasztja az aktuálisan legközelebbi csúcsot, amelyet még nem látogattak meg.
3. Minden szomszédos csúcsot ellenőriz, és ha egy új, rövidebb út található az aktuális csúcs felől, akkor frissíti az adott csúcs távolságát.
4. A folyamat addig folytatódik, amíg minden csúcsot meg nem látogatunk.

## Példa

Tekintsük az alábbi gráfot, amelynek élei a következő távolságokkal rendelkeznek:

```
    (0) --7-- (1) --15-- (3)
     | \       |  \       |
    9|  14    10  11     6|
     |    \   |     \    |
    (2) --2-- (5) --9-- (4)
```

A `0` csúcsból indulva a Dijkstra algoritmus az alábbi eredményeket adja:

- A `0`-ból `1`-be vezető legrövidebb út hossza: **7**
- A `0`-ból `2`-be vezető legrövidebb út hossza: **9**
- A `0`-ból `3`-ba vezető legrövidebb út hossza: **20**
- A `0`-ból `4`-be vezető legrövidebb út hossza: **20**
- A `0`-ból `5`-be vezető legrövidebb út hossza: **11**

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Hatékony a legrövidebb utak megtalálására, ha az élek súlyai nem negatívak.
    - Könnyen implementálható és jól működik kisebb gráfok esetén.
- **Hátrányok**:
    - Nagy gráfok esetén az időkomplexitása magas lehet, különösen ha a prioritási sort nem hatékonyan kezeljük.
    - Nem használható negatív élhosszok esetén, mert helytelen eredményt adhat.

## Használat

A Dijkstra algoritmus használata számos területen elterjedt, például:

- Hálózatok útvonalainak optimalizálása (pl. internetes routing protokollok).
- GPS rendszerek, ahol a leggyorsabb vagy legrövidebb út kiszámítása szükséges.
- Szállítási és logisztikai problémák, ahol különböző helyszínek közötti legoptimálisabb útvonalakra van szükség.

## Pseudo-kód

KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ

```
Dijkstra(graph, startVertex):
    nVertices = len(graph)
    shortestDistances = [infinity] * nVertices
    shortestDistances[startVertex] = 0
    added = [False] * nVertices

    for i from 1 to nVertices-1:
        nearestVertex = findNearestVertex(shortestDistances, added)
        added[nearestVertex] = True
        for each neighbor of nearestVertex:
            if not added[neighbor] and distance can be reduced:
                update shortestDistances[neighbor]
```

A pseudo-kódban a `findNearestVertex` függvény feladata, hogy megtalálja a még nem látogatott csúcsok közül a legközelebbit. Az algoritmus iteratívan halad, amíg minden csúcsot meg nem látogat, és minden lépésben a legközelebbi csúcs felől vizsgálja a szomszédokat, frissítve a legrövidebb út távolságokat.

Az algoritmus hatékonyan alkalmazható ott, ahol gyorsan kell útvonalakat meghatározni, és az élek pozitív súlyúak.
