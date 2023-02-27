# Projekt-Dokumentation

Sierra

| Datum | Version | Zusammenfassung                                              |
| ----- | ------- | ------------------------------------------------------------ |
| 20.022023 | 0.0.1   | Start of Projekt, erstellen des Projektes   |
| 21.022023 | 0.0.2   | Erstellen der Login Seite  |
| 22.022023 | 0.0.3   | Erstellen der Seite für das Nameneingeben |
| 23.022023 | 0.0.4   | Erstellen der SpielSeite, Anfang des Buchstaben raten |
| 24.022023 | 0.0.5   | Bearbeitung des Buchstabenrate("-" wurde nicht mit dem Geratenen Buchstaben ersetzt)  |
| 25.022023 | 0.0.6   | Erweiterung am Spiel, Glücksrad wurde hinzugefügt, man kann jetzt um einen Betrag Spielen  |
| 26.022023 | 1.0.0   | Erweiterung am Spiel:Man kann jetzt einen Betrag setzen, um den man beim raten spielt, und es wurden Leben hinzugefügt  |
| 26.022023 | 1.0.1   | Highscore Datenbank wurde hinzugefügt  |

# 0 Ihr Projekt

Das Projekt ist eine Simple Version von Glücksrad eine TV Sendung der 90er. Dabei kann der Spieler zuerste seinen Namen eingeben, der danach in der Highscoreliste angezeigt wird. Danach kann der Spieler am Glücksrad drehen, und jenachdem einen Betrag gewinnen, danach kann der Spieler um diesen Betrag spielen beim erraten von Buchstaben beim beim ratespiel. je nachdem wie oft der Buchstabe vorkommt, und wieviel man gewettet hat, gewinnt man mehr oder weniger. hat man irgendwann genug, kann man seinen Betrag in die Highscoreliste einschreiben lassen. Diese Highscoreliste, kann man dann von der Startseite aus zugreiffen. Als Admin kann man dann noch dazu Leute aus der Highscorelsite rausstreichen und neue Phrasen und Kategorien für das Ratespiel hinzufügen. 

# 1 Analyse
* Tier 1 (Presentation): HTML
* Tier 2 (Webserver):Seuerung des Programmablaufs
* Tier 3 (Application Server):Abrufen und abspeichern der Daten
* Tier 4 (Dataserver):MAria DB Datenbanken

# 2 Technologie

* Tier 1 (Presentation): Facelets
* Tier 2 (Webserver):Backing Bean
* Tier 3 (Application Server):EJB
* Tier 4 (Dataserver):JPA EntityManager/JCBA

# 3 Datenbank

Als Datenkbank benutze ich Daos, die die Datenbanken bedienen.

# 4.1 User Stories

| US-№ | Verbindlichkeit | Typ  | Beschreibung                       |
| ---- | --------------- | ---- | ---------------------------------- |
| 1    |     Muss        |   Funktional   | Als Admin möchte ich mit meinem Benutzernamen und Passwort auf meine Eigene Adminseite kommeen, damit nicht User zugriff auf Adminrechte haben |
| 2    |     Muss        |   Funktional   | Als Admin möchte ich Phrasen anlegen, ändern und löschen können, damit ich das spiel auch im nachhinein erweitern kann |
| 3    |     Muss        |   Funktional   | Als Admin möchte ich Kategorien anlegen und die Phrasen einer Kategorie zuordnen können, damit ich auch im nachhinein die Phrasen neuen Kategorien zuorden kann |
| 4    |     Muss        |   Qualitative  | Als Admin möchte ich einzelne Einträge der Highscore-Liste löschen können, damit ich evt. unverdiente Highscores löschen kann |
| 5    |     Kann        |   Rand         | Als benutzer möchte ich dass das Spiel auf einem Webbrowser ist, damit er einfach zugreifbar ist als Benutzer |
| 6    |     Kann        |   Rand         | Als Benutzer möchte ich meinen Namen eingeben können, damit er später auf der Highscoreliste angezeigt werden kann |
| 7    |     Kann        |   Rand         | Als Benutzer möchte ich zur jeder Zeit meinen Kontostand sehen, damit ich einfacher entscheiden kann, wann ich mich in die Highscoreliste Eintragen lassen möchte |
| 8    |     Kann        |   Rand         | Als Benutzer möchte ich zu jeder Zeit meine Lebenspunkte sehen können, damit ich weiss wie oft ich noch falsch raten kann  |
| 9    |     Kann        |   Rand         | Als Benutzer möchte ich dass es mir angezeigt wird ob mein geratener Buchstabe richtig oder falsch ist, damit ich sehen kann ob ich richtig oder falsch war |
| 10   |     Kann        |   Rand         | Als Benutzer möchte ich das auf der Highscoreliste Rang, Name, Zeitpunkt des Spieles, Geldetrag und die Anzahl an spielrunden sind, damit ausführlich angezeigt wird, wie gut man wat |
| 11   |     Kann        |   Rand         | Als Benutzer möchte ich dass die Highscoreliste nach Rang aufsteigend sortiert ist, damit zu sehen ist, wer der Beste war |
| 12   |     Kann        |   Rand         | Als Benutzer möchte ich Das Phrasen nur einmal angezeigt werden, damit das Spiel nicht zu einfach wird |
| 13   |     Kann        |   Rand         | Als Benutzer möchte ich jederzeit entweder Spielen, oder aufhören und meinen Gewinn in die Highscoreliste übernehmen, damit ich die Wahl zum weiterspielen oder nicht habe |
| 14   |     Kann        |   Rand         | Als Benutzer möchte ich dass das Spiel mit einer Spielbaren anzahl an Phrasen gefüllt ist  |
| 15   |     Kann        |   Rand         | Als Benutzer möchte ich dass die Anzahl der Spielrunden gezählt werden, damit dies dann in der Hichscoreliste angezeigt wird  |
| 16   |     Kann        |   Rand         | Als Admin möchte ich das einfach Formulareingaben wie Leere Textfelder auf Client wie auf Serverseite geprüft wird, damit es ein Stück Sicherheit gibt  |
| 17   |     Kann        |   Rand         | Als Admin möchte ich dass als Datenbnank JDBC benutzt wird, damit es so Sachen wie Highscore einfach gespeichert werden können  |
| 18   |     Kann        |   Rand         | Als Admin möchte ich dass die Datenbank anbindung möglichst unabhängig vom Tatsächlichen Produkt ist  |
| 19   |     Kann        |   Rand         | Als Admin möchte ich dass Sicherheits aspekte umgesetzt werden, damit die Seite gegen Hackers geschützt ist|
<

# 4.2 Testfälle

| TC-№ | Vorbereitung | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  |  Man ist auf der Startseite | Man gibt das Admin Login ein(admin und adminpassword) |  Man kommt auf die Adminseite|
| 2.1  |  Man ist auf der Adminseite  |    Man drückt bei einer Phrase auf Phrase editieren, editiert diese und drückt dann Enter |   Die Phrase ist in editierter Version da  |
| 2.2  |  Man ist auf der Adminseite  |    Man drückt bei einer Phrase auf Phrase Löschen|   Die Phrase ist gelöscht und wird nicht mehr angezeigt|
| 2.3  |  Man ist auf der Adminseite  |    Man drückt bei einer Phrase auf Phrase hinzufügen, gibt diese ein und drückt enter |   Die Phrase wird nun angezeigt  |
| 3.1  |  Man ist auf der Adminseite   |  Man gibt bei Kategorie eine Kategorie ein und drückt Kategorie hinzufügen  |  die neue Kategorie wird nun angezeigt  |
| 3.2  |Man ist auf der Adminseite   |  Man drückt bei den Phrasen auf zu Kategorie hinzufügen | Bei der Phrase steht nun das es zu dieser Kategorie gehört  |
| 4.1  | Man ist auf der Adminseite  |    Man drückt bei einer Highscore auf Highscore Löschen|   Der Highscore ist gelöscht und wird nicht mehr angezeigt|
| 5.1  | Das Spiel ist gestarte |  Siehe vo das spiel gestartet ist | Es ist auf einem Webbrowser gestartet |
| 6.1  | Man hat sich als Benutzer eingeloggt und ist auf der Namenseingabe Seite | Man gibt einen Namen ein und drückt auf submit | Der Name wird nun beim Begrüssungtext auf der Spielseite angezeigt |
| 7.1  | Man ist auf der Spielseite | Man spiel ein paar rundenen | Der Betrag wird die ganze zeit aktualisiert und unter "Your amount is:" |
| 8.1  | Man ist auf der Spielseite | Man spiel ein paar runden, wobei man da mindestens einmal falsch beim ratespiel raten muss | Der Betrag wird die ganze zeit aktualisiert und unter "Your amount of lifes are:" |
| 9.1  | Man ist auf der Spielseite | Man spiel ein paar runden, wobei man da mindestens einmal falsch beim ratespiel raten muss und einmal richtig | Es wird angezeigt ob es richtig oder falsch ist |
| 10.1  | Man ist auf der Highscoreseite | Man schaut welche angaben zu den Score angezeigt werden | Es soll der name die anzahl Versüche, den Betrag und den Zeitpunkt der Spieles angezeigt werden |
| 11.1  | Man ist auf der Highscoreseite | Man schaut wie die Highscoreliste Sortiert ist | Es soll dem Betrag aufsteigen sortiert sein |
| 12.1  | Man ist auf der Spielseite | Man errät die Phrasen mindestens einmal | Es kommt eine andere Phrase |
| 13.1  | Man ist auf der Spielseite | Man Schaut welche auswahl man hat an buttons | Es gibt Buttons die einem ermöglichen zu spielen, und es gibt Buttons um den Highscore einzutragen und aufhören zu spielen |
| 14.1  | Man ist auf der Spielseite | Man errät die Phrase mindesten einmal | Nachdem man die Phrase erraten hat, kommt eine andere |
| 15.1  | Man ist auf der Spielseite | Man Spielt ein paar rundenen und submitten dann seinen Highscore | Auf der Highscoreliste sind die Anzahl an Versüche angezeigt  |
| 16.1  | Man ist auf der Spielseite | Man gibt beim raten etwas anderes als nur einen buchstaben ein | Es gibt eine Fehlermeldung und man muss noch einmal raten  |
| 17.1  | Man hat zugriff auf den Quellcode | Man Schaut sich den JDBCScoreDao an | Der JDBCScoreDao wurde im JDBC format programmiert |
| 18.1  | Man hat zugriff auf den Quellcode | Man Schaut sich den wie die Seite auf die Datenbank zugreifft an | Die Methode die von der Webseite aufgerufen wird greift nicht direkt auf die Datenbank ein, sondern ruft eine Methode im JDBCScoreDao auf |
| 19.1  | Man hat zugriff auf den Quellcode | Man schaut beim Gamestart.xhtml | Beim Inputtext für den Namen ist required |

# 5 Prototyp
Admin Seite
![adminsite](https://user-images.githubusercontent.com/40291776/221521835-4138b5bb-6db3-472c-8056-896f94af8baa.png)

Game Seite
![game site](https://user-images.githubusercontent.com/40291776/221521702-9157652e-a6fa-46c8-be41-f5388f1fe269.png)

# 6 Implementation


| User Story | Datum | Beschreibung |
| ---------- | ----- | ------------ |
| ...        |       |              |

# 7 Projektdokumentation

| US-№ | Erledigt? | Entsprechende Code-Dateien oder Erklärung |
| ---- | --------- | ----------------------------------------- |
| 1    | ja / nein |                                           |
| ...  |           |                                           |

# 8 Testprotokoll

✍️ Fügen Sie hier den Link zu dem Video ein, welches den Testdurchlauf dokumentiert.

| TC-№ | Datum | Resultat | Tester |
| ---- | ----- | -------- | ------ |
| 1.1  |       |          |        |
| ...  |       |          |        |

✍️ Vergessen Sie nicht, ein Fazit hinzuzufügen, welches das Test-Ergebnis einordnet.

# 9 `README.md`

✍️ Beschreiben Sie ausführlich in einer README.md, wie Ihre Applikation gestartet und ausgeführt wird. Legen Sie eine geeignete Möglichkeit (Skript, Export, …) bei, Ihre Datenbank wiederherzustellen.

# 10 Allgemeines

- [ ] Ich habe die Rechtschreibung überprüft
- [ ] Ich habe überprüft, dass die Nummerierung von Testfällen und User Stories übereinstimmen
- [ ] Ich habe alle mit ✍️ markierten Teile ersetzt
