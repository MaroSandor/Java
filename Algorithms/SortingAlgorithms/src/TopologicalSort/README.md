# Topológiai rendezés (Topological Sort)
A **Topological Sort** egy olyan algoritmus, amely irányított, ciklusmentes gráf (DAG) csúcsait rendezi olyan sorrendbe, hogy minden él egy csúcsból egy másik csúcsba mutat, és a forráscsúcs előbb szerepel, mint a célcsúcs. Ez különösen hasznos az olyan problémák esetén, ahol a feladatok sorrendjét kell meghatározni úgy, hogy bizonyos feladatok csak mások befejezése után kezdhetők el.

## Működés leírása
1. Az algoritmus bejárja az összes csúcsot és azok szomszédait.
2. Rekurzívan meghívja a még nem látogatott szomszédos csúcsokat, majd hozzáadja a jelenlegi csúcsot a rendezett listához.
3. Miután minden csúcs bejárásra került, a rendezett lista elemei a topológiai sorrendet adják meg.

## Példa
Legyen az alábbi irányított gráf:
- **Csúcsok**: 0, 1, 2, 3, 4, 5
- **Élek**: (5, 2), (5, 0), (4, 0), (4, 1), (2, 3), (3, 1)

Az algoritmus bejárja a gráfot és az alábbi topológiai sorrendet adja vissza: `5, 4, 2, 3, 1, 0`.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - Hatékonyan alkalmazható irányított ciklusmentes gráfokra.
    - Segít a feladatok vagy események sorrendjének meghatározásában, ahol vannak előfeltételek.
- **Hátrányok**:
    - Csak irányított ciklusmentes gráfokon használható.
    - Nem ad egyértelmű megoldást, ha több topológiai sorrend is létezik.

## Használat
A topológiai rendezést tipikusan olyan problémák megoldására használják, ahol a feladatok között előfeltételek vannak. Például egy kurzus követelményrendszerében, ahol bizonyos kurzusokat csak mások teljesítése után lehet elvégezni, vagy projektütemezésben, ahol egyes feladatok csak bizonyos más feladatok után hajthatók végre.

## Pseudo-kód
```
TopologicalSort(graph):
    n = number of vertices in graph
    visited = [False] * n
    stack = []
    
    for i from 0 to n-1:
        if not visited[i]:
            topologicalSortUtil(graph, i, visited, stack)
    
    while stack is not empty:
        print(stack.pop())

TopologicalSortUtil(graph, v, visited, stack):
    visited[v] = True
    
    for neighbor in graph.adj[v]:
        if not visited[neighbor]:
            topologicalSortUtil(graph, neighbor, visited, stack)
    
    stack.push(v)
```
A pseudo-kódban a `TopologicalSort` funkció iterál a gráf összes csúcsán, és elindít egy rekurzív hívást a még nem látogatott csúcsokra. A `TopologicalSortUtil` funkció rekurzívan bejárja a csúcsok szomszédait, és a végén hozzáadja a csúcsot a veremhez, amely a topológiai sorrendet adja.