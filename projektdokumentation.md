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
| 1    |     Muss        |   Funktional   | Als ein Spieler möchte ich das Glücksrad drehen können, um um einen Betrag spielen zu können |
| 2    |     Muss        |   Funktional   | Als ein Spieler möchte ich Buchstaben raten können, um Beträge zugeschrieben zu bekommen |
| 3    |     Muss        |   Funktional   | Als ein Spieler möchte ich das Wort raten können, um um meinen Betrag gewinnen zu können |
| 4    |     Muss        |   Qualitative  | Als ein Spieler möchte ich dass der nächste dran kommt mit raten wenn der spielende den Falschen Buchstabe/Wort ratet, damit ich auch dran komme, wenn ich nicht als erstes dran bin |
| 5    |     Kann        |   Rand         | Als ein Spieler möchte ich das Rad drehen sehen damit das drehen des Rades Spannung aufbaut |
| 6    |     Kann        |   Rand         | Als Admin möchte ich die Spielstände aller benutzer sehen können, damit ich den Status des Spieles beurteilen kann|
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
