/**
 * Klasse Suche
 * Klase Suche zum Ableiten von Unterklassen für lineare und binaere Suche mit Hilfsmethoden für die drei 
 * Testfälle Bestcase, Worstcase, Averagecase
 * @author WK
 * @version 2018-03-21
 */
public abstract class Suchverfahren extends Verfahren implements Search
{
    protected int count = 0;
    private String name;
    
    public Suchverfahren(String pName)
    {
        name = pName;
        LegeCustomeArrayAnVorsortiert();
    }
    
    protected void createTest(boolean recursive) {
        LegeCustomeArrayAnVorsortiert();
        GebeArrayAusKomplett();
        System.out.println("---------------------------");
        System.out.println(name + (recursive ? " REKURSIV" : " ITERATIV"));
        System.out.println("---------------------------");
        count = 0;
    }
    
    protected void out(int num, int result) {
        System.out.println("\nGesucht: " + num + ", " + (result == -1 ? "Nicht gefunden!" : "Gefunden bei: " + result));
        System.out.println("\nSuchschritte: " + count + "\n");
    }
}
