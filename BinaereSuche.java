/**
 * Klasse BinaereSuche
 * Unterklasse abgeleitet von Oberklasse Suche für die Implementierung der binaeren Suche.
 * Nutzung der Datenstruktur Array
 * @author WK
 * @version 2018-03-21
 */
public class BinaereSuche extends Suchverfahren
{
    public BinaereSuche() 
    {      
        super("BINAERE SUCHE");
    }

    public int search(int num) 
    {
        int links = 0;
        int rechts = zahlenfeld.length - 1;
        int mitte = (links + rechts) / 2;
        while(num != zahlenfeld[mitte] && links <= rechts) {
            count++;
            mitte = (links + rechts) / 2;
            if(num > zahlenfeld[mitte]) {
                links = mitte + 1;
            }
            else if(num < zahlenfeld[mitte]) {
                rechts = mitte - 1;
            }
        }
        if(num == zahlenfeld[mitte]) {
            return mitte;
        } else {
            return -1;
        }
    }
    
    public int searchR(int num) {
        return sucheRekursiv(num, 0, zahlenfeld.length - 1);
    }
    
    public void test(int num, boolean recursive) {
        super.createTest(recursive);
        int result = recursive ? searchR(num) : search(num);
        super.out(num, result);
    }
    
    private int sucheRekursiv(int suchzahl, int links, int rechts) {
        count++;
        int mitte = (links + rechts) / 2;
        if(zahlenfeld[mitte] == suchzahl) {
            return mitte;
        }
        if(links > rechts) {
            return -1;
        }
        if(suchzahl < zahlenfeld[mitte]) {
            return sucheRekursiv(suchzahl, links, mitte - 1);
        }
        return sucheRekursiv(suchzahl, mitte + 1, rechts);
    }
}

/**
Beispielausgabe:

Arraylaenge: 11
Ausgabe des kompletten Arrays:
zahlenfeld[0] hat Wert 3
zahlenfeld[1] hat Wert 7
zahlenfeld[2] hat Wert 13
zahlenfeld[3] hat Wert 19
zahlenfeld[4] hat Wert 28
zahlenfeld[5] hat Wert 42
zahlenfeld[6] hat Wert 47
zahlenfeld[7] hat Wert 50
zahlenfeld[8] hat Wert 57
zahlenfeld[9] hat Wert 59
zahlenfeld[10] hat Wert 60

Suche Zahl 60
Element gefunden bei Index: 10
Suchschritte: 5

Suche Zahl 1000
Element nicht gefunden!
Suchschritte: 5

Suche Zahl 3
Element gefunden bei Index: 0
Suchschritte: 4

Suche Zahl 42
Element gefunden bei Index: 5
Suchschritte: 1

 */
