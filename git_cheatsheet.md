# Git Cheatsheet
Standardworkflow und häufige Befehle

---

## Standard-Workflow

```
git status  →  git switch -c <branch>  →  git add <datei>  →  git commit -m "..."  →  git push origin <branch>  →  Pull Request
```

| Schritt | Bedeutung |
|---|---|
| `git status` | Was hat sich geändert? |
| `git switch -c <branch>` | Neuen Branch anlegen & wechseln |
| `git add <datei>` | Änderungen stagen |
| `git commit -m "..."` | Commit erstellen |
| `git push origin <branch>` | Branch auf GitHub laden |
| Pull Request | Auf GitHub öffnen, Review anfordern |

---

## Branch & Status

| Befehl | Beschreibung |
|---|---|
| `git status` | Geänderte Dateien anzeigen |
| `git log --oneline` | Kompakte Commit-Historie |
| `git branch` | Alle lokalen Branches |
| `git switch <branch>` | Branch wechseln |
| `git switch -c <branch>` | Neuen Branch anlegen & wechseln |

---

## Stagen & Committen

| Befehl | Beschreibung |
|---|---|
| `git add <datei>` | Einzelne Datei stagen |
| `git add .` | Alle Änderungen stagen |
| `git commit -m "..."` | Commit mit Nachricht |
| `git push origin <branch>` | Branch auf GitHub laden |

---

## Rückgängig machen

| Befehl | Beschreibung |
|---|---|
| `git restore <datei>` | Änderungen verwerfen (unstaged) |
| `git restore --staged <datei>` | Datei aus Stage entfernen |
| `git stash` | Änderungen zwischenspeichern |
| `git stash pop` | Zwischengespeichertes wiederherstellen |

---

## Branch auf main rebasen

```bash
git switch main               # Zu main wechseln
git pull                      # main aktualisieren
git switch <branch>           # Zurück zum eigenen Branch
git rebase main               # Commits auf main aufsetzen
git push --force-with-lease   # Branch nach Rebase pushen
```

> **Hinweis:** Nach einem Rebase ist ein normales `git push` abgelehnt,
> da die History neu geschrieben wurde.

---

## Einzelne Datei aus main holen

```bash
git checkout main -- <datei>
```

> Die Datei wird sofort gestaged.
> Mit `git restore --staged <datei>` wieder unstagen falls nötig.
