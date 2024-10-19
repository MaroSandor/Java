# Mélységi keresés (Depth First Search, DFS)

A **Mélységi Keresés** (DFS) egy gráf bejárási algoritmus, amely rekurzívan végigjárja a gráf összes csúcsát úgy, hogy mindig a lehető legmélyebbre megy, mielőtt visszalépne. Az algoritmus egy adott kezdő csúcsból indul, és végigjárja az összes elérhető csúcsot, mielőtt egy másik útvonalat választana.

## Működés leírása
1. Az algoritmus egy adott kezdő csúccsal indul, amelyet meglátogatottnak jelöl.
2. Minden egyes csúcs esetében rekurzívan bejárja az összes szomszédos csúcsot, amelyek még nem voltak meglátogatva.
3. Az algoritmus addig halad egy adott irányba, amíg el nem éri a gráf egy végpontját (levelet), ekkor visszalép a korábbi elágazási ponthoz.

## Példa
Az alábbi példában egy gráfot járunk be a DFS algoritmussal, amely 4 csúcsból áll.

```java
DepthFirstSearch dfs = new DepthFirstSearch(4);

// Élek hozzáadása a gráfhoz
dfs.addEdge(0, 1);
dfs.addEdge(0, 2);
dfs.addEdge(1, 2);
dfs.addEdge(2, 0);
dfs.addEdge(2, 3);
dfs.addEdge(3, 3);

// Mélységi keresés indítása a 2-es csúcsból
dfs.DFS(2);
```

A fenti példában a DFS algoritmus a 2-es csúccsal kezdődik, és a következő sorrendben járja be a csúcsokat: `2, 0, 1, 3`.

## Algoritmus előnyei és hátrányai
- **Előnyök**:
    - Egyszerű és könnyen megvalósítható algoritmus.
    - Hatékonyan használható olyan problémák megoldására, mint az összefüggő komponensek meghatározása, vagy utak keresése a gráfban.
- **Hátrányok**:
    - Mély gráfok esetén a rekurzió miatt könnyen túlcsordulhat a verem.
    - Nem garantálja a legrövidebb út megtalálását, ha nem egyenlő súlyú élek vannak a gráfban.

## Használat
A DFS algoritmust széles körben használják különféle alkalmazásokban, például:
- **Útkeresési problémák**: Gráfban való utak keresése.
- **Összefüggő komponensek meghatározása**: Az összefüggő algráfok azonosítása.
- **Topologikus rendezés**: Ciklikus irányított gráfokban.

## Pseudo-kód

```
DFS(v):
  jelöljük v-t meglátogatottnak
  írjuk ki v-t
  for minden szomszéd w, amely még nincs meglátogatva:
    DFS(w)
```

A pseudo-kódban a `v` az aktuálisan meglátogatott csúcsot jelöli, míg `w` az adott csúcs szomszédos csúcsait. Az algoritmus minden lépésben rekurzívan meghívja magát a még meg nem látogatott szomszédos csúcsokra, amíg be nem járja az összes elérhető csúcsot.
