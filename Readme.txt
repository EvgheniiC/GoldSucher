Developer - Evghenii Costin

DE
Goldgräberspiel

In diesem Spiel habe ich Technologien wie verwendet
- SCHWING
- Design Petterns: Singelton, Fabrik
- Datenbank - SQL Lite
- Java 10

Spielbeschreibung
In diesem Spiel steuert der Benutzer einen Charakter in einem Labyrinth, das auch Monster und enthält
verborgene Schätze. Der Spieler muss so viel Schatz wie möglich in der Mindestanzahl von Zügen und sammeln
Verlasse das Labyrinth.
- Für jeden gesammelten Schatz erhält der Spieler Punkte.
- Wenn der Spieler von einem Monsterspiel gefressen wird
endet mit Punkten.
- wenn der Spieler keine Zeit hat, aus dem Labyrinth herauszukommen
eine bestimmte Anzahl von Schritten - das Spiel ist vorbei.
- Das Spiel enthält Statistiken für alle Benutzer und die besten Ergebnisse.

Grundregeln.
Das ganze Spiel findet auf einer Karte (Spielfeld) statt, die ein Quadrat mit Zellen ist
Innerhalb.
Eine Zelle kann folgende Objekte enthalten:
- Leere
- Wand
- Monster
- Schatz
- Ausgabe


Es gibt auch Wände um den Umfang der Karte, Sie können nicht nach draußen gehen. Die Karte wird von geladen
eine Textdatei mit einer bestimmten Datenstruktur.
Der Charakter startet das Spiel von der festgelegten Position und kann sich nach oben, unten,
links und rechts. Aber es kann nicht diagonal sein. Der Spieler kann auch einen Zug überspringen, d.h. stehen auf
Standort.
Wenn der Charakter in eine neue Zelle wechselt:
- Befindet sich ein Monster in der Zelle, stirbt der Charakter am Ende des Spiels.
- Schatz - Punkte hinzufügen (Schatz verschwindet)
- Beenden - Erhöhung der Punkte um 80% am Ende des Spiels.
Wenn sich mehrere Objekte in einer Zelle befinden, lautet die Anzeigereihenfolge wie folgt: Monster, Schatz,
Ausgabe.

Das Spiel enthält das Hauptmenü:
- Neues Spiel
- Lade das Spiel
- Statistiken
- Ausgabe


ENG
Gold digger game

In this game I used technologies such as
SWING
Design Petterns: Singelton, Factory
Database - SQL lite

game description
In this game, the user controls a character in a maze, which also contains monsters and
hidden treasures. The player needs to collect as much treasure as possible in the minimum number of moves and
exit the maze.
- For each collected treasure, the player receives points.
- If the player is eaten by a monster - game
ends with points scored.
- if the player does not have time to get out of the maze for
a certain number of steps - the game is over.
- The game contains statistics for all users and the best results.

Fundamental rules.
The whole game takes place on a map (playing field), which is a square with cells
inside.
A cell can contain the following objects:
- Emptiness
- Wall
- Monster
- Treasure
- Output

There are also walls around the perimeter of the map, you cannot go outside. The map is loaded from
a text file with a specific data structure.
The character starts the game from the designated position and can move up, down,
left and right. But it can't diagonally. Also, the player can skip a move, i.e. stand on
location.
When the character moves to a new cell:
- If there is a monster in the cell, the character dies, the end of the game.
- Treasure - add points (treasure disappears)
- Exit - increase in points by 80%, end of the game.
If there are several objects in one cell, the display order is as follows: monster, treasure,
output.

The game contains the main menu:
- New game
- Load the game
- Statistics
- Output



RU
Игра золотоискатель

В этой игре я использовал такие технологии как
SWING
Петтерны проектирования : Singelton, Factory
База данный  - SQL lite

описание игры
В этой игре пользователь управляет персонажем в лабиринте, в котором также находятся монстры и
сокровища. Игроку нужно собрать как можно больше сокровищ за минимальное количество ходов и
выйти из лабиринта.
- За каждое собранное сокровище игрок получает очки.
- Если игрок будет съеден монстром – игра
заканчивается с набранными очками.
- если игрок не успевает выйти из лабиринта за
определенное число шагов – игра заканчивается.
- Игра содержит статистику по всем пользователям и лучшими результатами.

Основные правила.
Вся игра проходит на карте (игровом поле), которая представляет из себя квадрат с ячейками
внутри.
Ячейка может содержать следующие объекты:
- Пустота
- Стена
- Монстр
- Сокровище
- Выход


По периметру карты также находятся стены, за пределы выйти нельзя. Карта загружается из
текстового файла с определенной структурой данных.
Персонаж начинает игру с назначенной позиции и может двигаться по направлениям вверх, вниз,
влева и вправо. Но не может по диагонали. Также игрок может пропустить ход, т.е. постоять на
месте.
Когда персонаж переходит в новую ячейку:
- Если в ячейке монстр – персонаж умирает, окончание игры.
- Сокровище – добавление очков (сокровище исчезает)
- Выход – увеличение очков на 80%, окончание игры.
Если в одной ячейке оказалось несколько объектов, порядок отображения такой: монстр, сокровище,
выход.

Игра  содержит главное меню:
- Новая игра
- Загрузить игру
- Статистика
- Выход