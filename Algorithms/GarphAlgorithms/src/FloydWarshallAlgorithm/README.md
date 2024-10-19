# Floyd-Warshall Algoritmus

A **Floyd-Warshall algoritmus** egy dinamikus programozáson alapuló módszer, amelyet irányított gráfokban lévő csúcspárok közötti legrövidebb utak megtalálására használnak. Az algoritmus hatékony, és képes kezelni negatív élhosszúságú éleket is, feltéve, hogy nincs negatív súlyú kör a gráfban.

## Működés leírása

1. Az algoritmus egy `n x n` méretű mátrixot használ, amelyben `n` a gráf csúcsainak száma. Kezdetben a távolságmátrixot az eredeti gráf éleinek súlyaival tölti fel.
2. Az algoritmus három beágyazott ciklusban dolgozik. A külső ciklus egy közbülső csúcsot (`k`) ad hozzá az útvonalakhoz.
3. A belső két ciklus minden lehetséges csúcspárt (`i`, `j`) megvizsgál, és frissíti a távolságot, ha egy rövidebb út található a közbülső csúcs (`k`) érintésével.
4. Az algoritmus végül minden csúcspárra kiszámolja a legrövidebb távolságot, és ezt a távolságmátrixban tárolja.

## Példa

Vegyük az alábbi gráfot, amelyben négy csúcs található:

- A gráf súlymátrixa:
  ```
  0  3  INF  7
  8  0  2   INF
  5  INF  0  1
  2  INF  INF  0
  ```

Az algoritmus három lépésben frissíti a távolságmátrixot, minden egyes közbülső csúcs (`k`) hozzáadásával. Végül a legrövidebb utak a következőképpen alakulnak:

- A frissített távolságmátrix:
  ```
  0  3  5  6
  8  0  2  3
  5  8  0  1
  2  5  7  0
  ```

## Algoritmus előnyei és hátrányai

- **Előnyök**:
    - Egyszerű és érthető megoldás, amely a dinamikus programozás elvén alapszik.
    - Alkalmas minden páros legrövidebb út megtalálására, még negatív élhosszúságú élek esetén is.
- **Hátrányok**:
    - Nagy időkomplexitású: **O(n³)**, ahol `n` a gráf csúcsainak száma. Emiatt nagy gráfok esetén nem praktikus.
    - Nem alkalmas olyan gráfok kezelésére, amelyek negatív súlyú kört tartalmaznak, mivel ebben az esetben nem definiálható legrövidebb út.

## Használat

A Floyd-Warshall algoritmust elsősorban akkor használják, ha minden csúcspár közötti legrövidebb utat meg kell határozni, például útvonaltervezési problémák, közlekedési hálózatok, vagy kommunikációs hálózatok elemzése esetén.

## Pseudo-kód

KÉP GENERÁLÁSA A KÖVETKEZŐHÖZ

`FloydWarshall(graph):`
```
n = length(graph)
dist = graph.copy()
for k from 0 to n-1:
    for i from 0 to n-1:
        for j from 0 to n-1:
            if dist[i][k] + dist[k][j] < dist[i][j]:
                dist[i][j] = dist[i][k] + dist[k][j]
```

A pseudo-kódban a `k` a közbülső csúcsot jelöli, míg `i` és `j` a gráf csúcspárjait. Az algoritmus minden lépésben megvizsgálja, hogy a közbülső csúcson keresztül haladva rövidebb útvonal érhető-e el. Ha igen, akkor a távolságmátrixot frissíti, amíg minden lehetséges csúcspár közötti legjobb út meg nem található.
