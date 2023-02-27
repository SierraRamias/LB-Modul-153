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
| 7    |     Kann        |   Rand         | Als Benutzer möchte ich zur jeder Zeit meinen Kontostand sehen, damit ich eifnacher entscheiden kann, wann ich mich in die Highscoreliste Eintragen lassen möchte |
| 8    |     Kann        |   Rand         | Als Benutzer möchte ich zu jeder Zeit meine Lebenspunkte sehen können, damit ich weiss wie oft ich noch falsch raten kann  |
| 9    |     Kann        |   Rand         | Als Benutzer möchte ich dass es mir angezeigt wird ob mein geratener Buchstabe richtig oder falsch ist, damit ich sehen kann ob ich richtig oder falsch war |
| 10   |     Kann        |   Rand         | Als Benutzer möchte ich das auf der Highscoreliste Rang, Name, Zeitpunkt des Spieles, Geldetrag und die Anzahl an spielrunden sind, damit ausführlich angezeigt wird, wie gut man wat |
| 11   |     Kann        |   Rand         | Als Benutzer möchte ich dass die Highscoreliste nach Rang aufsteigend sortiert ist, damit zu sehen ist, wer der Beste war |
| 12   |     Kann        |   Rand         | Als Benutzer möchte ich Das Phrasen nur einmal angezeigt werden, damit das Spiel nicht zu einfach wird |
| 12   |     Kann        |   Rand         | Als Benutzer möchte ich jederzeit entweder Spielen, oder aufhören und meinen Gewinn in die Highscoreliste übernehmen, damit ich die Wahl zum weiterspielen oder nicht habe |
| 12   |     Kann        |   Rand         | Als Benutzer möchte ich dass das Spiel mit einer Spielbaren anzahl an Phrasen gefüllt ist  |
| 12   |     Kann        |   Rand         | Als Benutzer möchte ich dass die Anzahl der Spielrunden gezählt werden, damit dies dann in der Hichscoreliste angezeigt wird  |
| 12   |     Kann        |   Rand         | Als Admin möchte ich das einfach Formulareingaben wie Leere Textfelder auf Client wie auf Serverseite geprüft wird, damit es ein Stück Sicherheit gibt  |
| 12   |     Kann        |   Rand         | Als Admin möchte ich dass als Datenbnank JDBC benutzt wird, damit es so Sachen wie Highscore einfach gespeichert werden können  |
| 12   |     Kann        |   Rand         | Als Admin möchte ich dass die Datenbank anbindung möglichst unabhängig vom Tatsächlichen Produkt ist  |
| 12   |     Kann        |   Rand         | Als Admin möchte ich dass Sicherheits aspekte umgesetzt werden, damit die Seite gegen Hackers geschützt ist|
<

# 4.2 Testfälle

| TC-№ | Vorbereitung | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  |  Das Spiel muss gestartet sein und der Tester ist auf der Glücksrad Seite   | Man drückt auf "Rad drehen" |  Das Rad dreht sich und man sieht mit welchen Betrag man spielt |
| 2.1  |  Das Spiel ist gestartet   |         |                   |
| 3.1  |              |         |                   |
| 4.1  |              |         |                   |
| 5.1  |              |         |                   |
| 6.1  |              |         |                   |

✍️ Die Nummer hat das Format `N.m`, wobei `N` die Nummer der User Story ist, die der Testfall abdeckt, und `m` von `1` an nach oben gezählt. Beispiel: Der dritte Testfall, der die zweite User Story abdeckt, hat also die Nummer `2.3`.

# 5 Prototyp

✍️ Erstellen Sie Prototypen für das GUI (Admin-Interface und Quiz-Seite).

# 6 Implementation

✍️ Halten Sie fest, wann Sie welche User Story bearbeitet haben

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
