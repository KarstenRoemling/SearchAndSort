/**
 * Klasse LineareSuche
 * Unterklasse abgeleitet von Oberklasse Suche für die Implementierung der linearen Suche.
 * Nutzung der Datenstruktur Array
 * @author WK
 * @version 2018-03-21
 */
public class LineareSuche extends Suchverfahren
{
    public LineareSuche() 
    {
        super("LINEARE SUCHE");
    }

    public int search(int num) 
    {
        for(int i = 0; i < zahlenfeld.length; i++) {
            count++;
            if(zahlenfeld[i] == num) {
                return i;
            }
        }
        return -1;
    }  
    
    public int searchR(int num)
    {
        return sucheRekursiv(num, 0);
    }
    
    public void test(int num, boolean recursive) {
        super.createTest(recursive);
        int result = recursive ? searchR(num) : search(num);
        super.out(num, result);
    }
    
    private int sucheRekursiv(int suchzahl, int index) {
        count++;
        if(index >= zahlenfeld.length)
            return -1;
        if(suchzahl == zahlenfeld[index])
            return index;
        return sucheRekursiv(suchzahl, index + 1);
    }
}
