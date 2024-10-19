# Breadth-First Keresés (Breadth-First Search, BFS)

A **Breadth-First Search (BFS)** egy gráf keresési algoritmus, amely a gráf csúcsainak szélességi bejárását valósítja meg. Az algoritmus sorban (queue) tárolja a felfedezésre váró csúcsokat, és iteratívan bejárja a gráfot szintenként, mielőtt mélyebb szintekre lépne. A BFS-t gyakran használják útvonal keresésre és kapcsolódási komponensek feltérképezésére.

## Működés leírása
1. Az algoritmus a kezdő csúccsal indul, és megjelöli azt látogatottként.
2. A kezdő csúcsot hozzáadja egy sorhoz (queue), amely az összes később bejárandó csúcsot tartalmazza.
3. Amíg a sor nem üres, az algoritmus sorban eltávolítja a sor elején lévő csúcsot, majd hozzáadja a szomszédait a sorhoz, feltéve, hogy azok még nem látogatottak.
4. A folyamat addig folytatódik, amíg a sor üres lesz, azaz a gráf összes csúcsát bejárta.

## Példa
Az alábbi példa egy egyszerű gráfot mutat be 4 csúccsal:
- Az élek: (0, 1), (0, 2), (1, 2), (2, 0), (2, 3), (3, 3).

A Breadth-First keresés a 2-es csúcsról indulva a következő sorrendben járja be a gráfot: **2, 0, 3, 1**.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - A BFS biztosítja, hogy a legkisebb számú élen keresztül érje el a célcsúcsot, ha a gráf súlyozatlan.
    - Könnyen megvalósítható, és hatékonyan használható a kapcsolódási komponensek felderítésére.
- **Hátrányok**:
    - Nagy memóriaigénnyel rendelkezik, mivel minden csúcsot és szomszédot sorban kell tárolni.
    - Nem hatékony súlyozott gráf esetén, ahol a legrövidebb út keresése más algoritmusokkal, például a Dijkstra algoritmussal hatékonyabb.

## Használat
A BFS algoritmust több területen is alkalmazzák:
- Útvonal keresésre, például térképek vagy robot mozgás esetén.
- Szociális hálózatokban a kapcsolatok feltérképezésére.
- Kapcsolódási komponensek felderítésére egy gráfban.
- AI és játékokban a lehetséges állapotok bejárására.

## Pseudo-kód

```
BFS(graph, start_vertex):
    queue = empty queue
    visited = set()

    queue.enqueue(start_vertex)
    visited.add(start_vertex)

    while queue is not empty:
        vertex = queue.dequeue()
        for neighbor in graph.adjacent_edges(vertex):
            if neighbor is not in visited:
                visited.add(neighbor)
                queue.enqueue(neighbor)
```

A pseudo-kódban a `queue` a bejárás során használt sort jelöli, míg a `visited` a már meglátogatott csúcsokat tartalmazza. Az algoritmus minden szomszédot bejár, mielőtt továbblép a következő szintre, biztosítva a szélességi bejárást.

## Kép a gráf struktúrájáról és bejárásáról

*Kérjük, hogy illessz be egy képet, amely szemlélteti a gráf bejárását a BFS algoritmus során.*
