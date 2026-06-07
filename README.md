# Graphen in Java – ListGraph & MatrixGraph

Dieses Projekt begleitet die Unterrichtsreihe **Graphen** im Informatik-Leistungskurs (NRW Abitur).

Graphen sind ein zentrales Thema der Abiturprüfungen ab 2018. Das NRW-Zentralabitur setzt voraus,
dass Schülerinnen und Schüler mit den bereitgestellten Klassen `Vertex`, `Edge` und `Graph` umgehen
können. In diesem Projekt implementieren wir das Interface `Graph` auf zwei verschiedene Arten –
einmal als **Adjazenzliste** (`ListGraph`) und einmal als **Adjazenzmatrix** (`MatrixGraph`) –
und vergleichen dabei die Vor- und Nachteile beider Ansätze.

---

## Projektstruktur

```
src/
  graph/           ← Interface und beide Implementierungen
    Graph.java
    ListGraph.java
    MatrixGraph.java
    Vertex.java
    Edge.java
    List.java      ← NRW-Standardklasse (bereits fertig)
  beispiele/       ← Beispielgraphen zum Testen
    DreiKnotenGraph.java
```

---

## Eure Aufgabe

Implementiert gemeinsam die folgenden Klassen im Package `graph`:

### 1. `Vertex.java` und `Edge.java`
Die einfacheren Einstiegsklassen. Lest die Hinweise in den Methodenkommentaren sorgfältig –
sie beschreiben Schritt für Schritt, was zu tun ist.

### 2. `ListGraph.java`
Implementierung des Interfaces `Graph` mithilfe von verketteten Listen (`List<Vertex>` und
`List<Edge>`). Die interne Struktur ähnelt der NRW-Originalklasse, die ihr aus dem Unterricht kennt.

### 3. `MatrixGraph.java`
Implementierung desselben Interfaces mithilfe einer **Adjazenzmatrix** (`Edge[][]`). Hier lohnt
es sich, nach der Implementierung zu diskutieren:
- Welche Methoden sind schneller als im `ListGraph`?
- Wo verbraucht die Matrix unnötig Speicher?
- Warum wächst das interne Array automatisch – und wie funktioniert das?

### 4. `beispiele/DreiKnotenGraph.java`
Sobald eure Implementierungen funktionieren, könnt ihr den Beispielgraphen ausführen und prüfen,
ob die Ausgabe korrekt ist. Erweitert die Beispiele gerne um eigene Graphen!

---

## Arbeitsweise mit Git

Um gemeinsam an diesem Projekt zu arbeiten, gelten folgende Regeln:

### Branches
- Der **`main`-Branch** enthält immer einen lauffähigen, gemeinsam abgestimmten Stand.
- **Arbeitet nie direkt auf `main`.**
- Jede Person arbeitet auf einem **eigenen Branch**, benannt nach eurem Namen oder dem Feature,
  z.B. `lisa/listgraph` oder `feature/matrixgraph-remove`.

Einen neuen Branch erstellen und wechseln:
```bash
git checkout -b mein-branch
```

### Pull Requests
- Wenn ihr eine Methode oder Klasse fertiggestellt habt, pushed ihr euren Branch und öffnet
  einen **Pull Request** auf `main`.
- Mindestens eine andere Person aus dem Kurs **reviewt den Code**, bevor der PR gemergt wird.
- Im Review könnt ihr Kommentare hinterlassen, Fragen stellen oder Verbesserungen vorschlagen.

Änderungen committen und pushen:
```bash
git add .
git commit -m "ListGraph: addVertex implementiert"
git push origin mein-branch
```

### Konflikte
Falls zwei Personen dieselbe Datei bearbeitet haben, kann es zu einem **Merge-Konflikt** kommen.
Git markiert die betroffenen Stellen – besprecht euch und löst den Konflikt gemeinsam, bevor
ihr den PR mergt.

---

## Hinweise

- Die Klasse `List.java` (NRW-Standardklasse) ist **bereits fertig** und darf nicht verändert werden.
- Das Interface `Graph.java` ist ebenfalls fertig – es definiert den Vertrag, den beide
  Implementierungen erfüllen müssen.
- Haltet euren Code sauber: sprechende Variablennamen, keine auskommentierten Codeblöcke,
  Kommentare auf Deutsch.
