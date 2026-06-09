# Zusatzaufgabe: Maximaler Fluss in Netzwerken

## Rahmenbedingungen

Diese Aufgabe richtet sich an Schülerinnen und Schüler eines Leistungskurses Informatik, die tiefer in die Graphentheorie
einsteigen möchten. Die Ergebnisse werden am Ende dem Kurs präsentiert.

**Ziel der Präsentation:** Der Kurs soll das Max-Flow-Problem, mindestens einen
Algorithmus und eine funktionierende Implementierung verstehen – auch ohne diese
Zusatzaufgabe selbst bearbeitet zu haben.

---

## Aufgabenübersicht

### 1. Problemstellung erarbeiten

Recherchiert das **Max-Flow-Problem** und beantwortet in eigenen Worten:

- Was ist ein **Flussnetzwerk**? Was unterscheidet es von einem ungewichteten Graphen?
- Was bedeuten **Kapazität**, **Fluss**, **Quelle** und **Senke**?
- Welche Bedingungen muss ein gültiger Fluss erfüllen?
  (Kapazitätsbedingung, Flusserhaltung)
- Wo tritt das Max-Flow-Problem in der Praxis auf?
  (Netzwerke, Verkehr, Logistik, Bildverarbeitung…)
- Formuliert das Problem präzise: *„Gegeben ein Netzwerk G mit Quelle S und Senke T –
  gesucht ist…"*

---

### 2. Algorithmen nachvollziehen und erklären

Arbeitet euch in die folgenden zwei Algorithmen ein und bereitet sie so auf,
dass ihr sie dem Kurs erklären könnt.

#### Ford-Fulkerson

- Grundidee: Suche einen **augmentierenden Pfad** von S nach T, erhöhe den Fluss,
  wiederhole bis kein Pfad mehr existiert
- Was ist ein **Residualgraph**? Warum braucht man **Rückwärtskanten**?
- Warum terminiert der Algorithmus nicht zwingend bei irrationalen Kapazitäten?
- Führt den Algorithmus **Schritt für Schritt** an einem selbst gewählten
  Beispielgraphen durch (gerne auf Papier oder als Folienanimation)

#### Edmonds-Karp

- Worin unterscheidet sich Edmonds-Karp von Ford-Fulkerson?
  (Stichwort: BFS statt beliebiger Pfadsuche)
- Warum ist das ein Vorteil? Welche Laufzeit ergibt sich?
- Führt auch diesen Algorithmus am selben Beispielgraphen durch und
  vergleicht die Schritte mit Ford-Fulkerson

**Tipp:** Stellt die Algorithmen zunächst als **Pseudocode** dar, bevor ihr
mit der Implementierung beginnt. Das hilft beim Erklären und beim Programmieren.

Beispiel für einen Pseudocode-Einstieg:
```
MaxFlow(G, S, T):
  Setze flow(e) = 0 für alle Kanten e
  Solange ein augmentierender Pfad p von S nach T im Residualgraphen existiert:
    Bestimme die minimale Restkapazität c entlang p
    Erhöhe den Fluss auf jeder Kante in p um c
    Aktualisiere den Residualgraphen
  Gib den Gesamtfluss zurück
```

---

### 3. Implementierung

Implementiert den Algorithmus in Java. Welche Datenstrukturen ihr verwendet,
bleibt euch überlassen – Standard-Java-Klassen wie `HashMap`, `ArrayList` oder
`ArrayDeque` sind ausdrücklich erlaubt.

**Anforderungen an den Code:**
- Gut lesbarer, kommentierter Java-Code
- Pseudocode als Kommentar direkt über der jeweiligen Methode
- Eine `main`-Methode, die den Algorithmus an einem konkreten Beispielgraphen
  demonstriert und den maximalen Fluss ausgibt

---

### 4. Präsentation

Bereitet eine Präsentation vor, die den **gesamten Kurs** mitnimmt.
Richtet euch dabei an Mitschülerinnen und Mitschüler, die das Thema nicht
selbst erarbeitet haben.

Mögliche Gliederung:

1. **Motivation** – Wo begegnet uns das Problem im Alltag?
2. **Grundbegriffe** – Flussnetzwerk, Kapazität, Residualgraph (mit Visualisierung)
3. **Ford-Fulkerson** – Idee, Pseudocode, Schritt-für-Schritt-Beispiel
4. **Edmonds-Karp** – Verbesserung, Laufzeit, Vergleich
5. **Live-Demo** – euer Programm am Beispielgraphen
6. **Reflexion** – Was war schwierig? Was habt ihr überraschend gefunden?

**Zeitrahmen:** ca. 20–25 Minuten Präsentation, 5–10 Minuten Fragen

---

## Hinweise und Ressourcen

- Startet mit einem **kleinen, überschaubaren Beispielgraphen** (4–6 Knoten) –
  so könnt ihr Schritt für Schritt nachvollziehen, ob eure Implementierung stimmt
- Das Buch *Algorithmen – Eine Einführung* (Cormen et al.) behandelt Max-Flow
  ausführlich, ist aber anspruchsvoll – nutzt es als Nachschlagewerk
- Wikipedia-Artikel zu Ford-Fulkerson und Edmonds-Karp sind als Einstieg gut geeignet
- Ihr dürft KI-Tools zur Recherche und zum Verständnis nutzen, aber bitte **nicht**
  zur direkten Codegenerierung – der Code soll von euch stammen und von euch
  erklärt werden können

---

## Bewertungshinweise

Die Präsentation wird nach folgenden Kriterien bewertet:

| Kriterium | Beschreibung |
|---|---|
| Fachliche Korrektheit | Sind Problemstellung und Algorithmen richtig dargestellt? |
| Verständlichkeit | Können Mitschüler die Kernideen nachvollziehen? |
| Implementierung | Ist der Code korrekt, lesbar und gut kommentiert? |
| Tiefe | Wird auch auf Laufzeit, Grenzen oder Varianten eingegangen? |
| Präsentation | Klare Struktur, anschauliche Beispiele, souveräner Vortrag |
