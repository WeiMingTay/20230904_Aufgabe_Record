`4. September 2023` - `neueFische - Java Development Bootcamp`

# Records

## Theoretische Fragen

1. Alle Eigenschaften von Records sind unveränderlich, sobald ein Record einmal erstellt wurde. Dies erscheint im ersten
   Augenblick als eine Einschränkung. Inwiefern ist dies für uns aber ein Vorteil? Nenne ein oder zwei Argumente.

   `Leichtere Nachvollziehbarkeit, sicherer, weniger Nebeneffekte`

```
Wenn ich ein Objekt vom Typ eines Record an eine Funktion/Methode übergebe, kann ich sicher sein, dass dieses Objekt danach noch genauso ist wie vor dem Aufruf der Methode.
```

2. Was ist ein weiterer Vorteil von Records gegenüber Klassen?

   `kürzerer Code: einfacher Lesbar`

```
weniger Code, alle Standard-Methoden (equals, hashcode, toString) automatisch und korrekt definiert
```

3. Ihr kommt neu in ein Developerteam, dass eine Immobilienverwaltung entwickelt. Es gibt einen Record `RealEstate`, der
   für eine Immobilie steht. Dieser Record hat die Eigenschaften "address", "squareMeters", "numberOfRooms" und "price".
   Zusätzlich hat er eine Methode

```java
public RealEstate withPrice(double price)
```

Zum Beispiel wird es verwendet
in

```java
RealEstate afterRaise=home.withPrice(75_000d);
```

Ihr wisst, dass ein Record unveränderlich ist, die Methode
sieht aber ähnlich zu einem Setter aus. Was macht diese Methode?

`Es wird eine Kopie von home erstellt, Attribut price wird auf 75.000 gesetzt. Modifizierte Kopie wird unter afterRaise gespeichert`

```
Die Methode erzeugt intern ein neues Objekt mit den Daten des ursprünglichen Objekt und des übergebenen Preises und gibt das erzeugte Objekt zurück.
```

## Aufgabe: Zoo-Projekt

1. Erstellt ein neues Projekt in IntelliJ und legt damit den Grundstein für das Java-Record Zoo Projekt.
2. Lege eine Java-Record-Klasse "Animal" an, die für ID, Name, Art und Alter folgende Eigenschaften haben soll. Wähle
   geeignete Feldnamen.

### Record-Methoden aufrufen

#### Nun verwenden wir einen Record als Attribut eines anderen Records.

3. In einer main-Methode, erstellt mehrere Animals.
4. Ruft die automatisch im Record generierten Methoden auf, und prüft, ob sie das tun, was ihr erwartet (equals,
   toString).

## Verschachtelung

#### Nun verwenden wir einen Record als Attribut eines anderen Records.

5. Legt nun einen `Owner`-Record an, der einige Eigenschaften eines Tierbesitzers speichert (Name, Alter, Adresse).
6. Lasst jedes `Animal` einen `Owner` haben.

### Verschachtelung + Wiederverwenden

#### Einen Record in mehreren anderen Records verwenden.

7. Erstellt einen `Species`-Record, der die Eigenschaften einer Tierart speichert (Name, Futterbedarf in Gramm pro Tag).
8. Lasst jedes `Animal` eine `Species` haben.
9. In Eurer main-Methode, lasst mehrere `Animal`-Objekte die gleiche `Species` haben.
10. Falls ihr diese Aufgabe bereits früher abgeschlossen habt, dürft ihr die Bonusaufgabe auf der nächsten Seite
    bearbeiten.

## Bonus Aufgabe With-Methoden

11. Schreibe with-Methoden ('wither', so wie bei den Rechereche-Fragen) für alle Eigenschaften des `Animal`-Records.

## Bonus-Aufgabe Zoo

12. Implementiere einen "Zoo"-Record, der eine Liste aller Animals hat und den Gesamtfutterbedarf aller Tiere im Zoo
    berechnen kann.