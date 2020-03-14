
/**
 * Write a description of class Verfahren here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Verfahren
{
    //Array unbestimmer Laenge
    protected int[] zahlenfeld;
    
    public int[] getZahlenfeld() {
        return zahlenfeld;
    }
    
    public void setZahlenfeld(int[] pZahlenfeld) {
        zahlenfeld = pZahlenfeld;
    }

    public void LegeCustomeArrayAnVorsortiert() {
        int[] customearray = {3,7,13,19,28,42,47,50,57,59,60};
        zahlenfeld = customearray;
    }
    
    public void LegeCustomeArrayAnUnsortiert() {
        int[] customearray = {57,3,13,7,60,47,19,50,42,28,59};
        zahlenfeld = customearray;
    }
    
    public void LegeArrayAn(int anzahl) 
    {
        //Reserviere der Anzahl nach Speicherplaetze fur das Array.
        zahlenfeld = new int[anzahl];

        //Belege die Elemente des Array mit allen Zahlenwerte von 1 bis zur Laenge
        for (int i = 0; i < zahlenfeld.length; i++)
            zahlenfeld[i] = i+1;        
    }

    //Vertauscht die Elemente im Array mit den Indize i un j an den jeweiligen Positionen.
    public void tausche(int i, int j) 
    {
        int zwischenspeicher = zahlenfeld[i];
        zahlenfeld[i] = zahlenfeld[j];
        zahlenfeld[j] = zwischenspeicher;
    }

    //Mischt die Elemente im Array fuer die drei Testfälle: Bestcase, Averagecase und Worstcase
    public void MischeArray(String fall) 
    {
        if (fall == "averagecase") 
        {
            for(int j = 0; j < 2; j++) 
                for(int i = 0; i < zahlenfeld.length; i++) 
                {
                    int zufallindex1 = (int)(Math.random() * zahlenfeld.length);
                    int zufallindex2 = (int)(zahlenfeld.length * Math.random()); 
                    tausche(zufallindex1, zufallindex2);
                    //System.out.println(zufallindex1 + " " + zufallindex2);
                }
        }
        else 
        if (fall == "worstcase") 
        {
            for (int i = 0; i < zahlenfeld.length; i++)
                zahlenfeld[i] = zahlenfeld.length - i; 
        }
        else 
        if (fall == "bestcase") 
        {
            for (int i = 0; i < zahlenfeld.length; i++)
                zahlenfeld[i] = i+1;  
        }

    }

    // Gibt den Inhalt des Array aus. 
    // Ist bis = 0, wird das komplette Array der Laenge nach ausgegeben, ansonsten nur bis zu gewünschten Länge.
    public void GebeArrayAusBis(int bis)    
    {
        if (bis <= 0) 
        {
            System.out.println("Arraylaenge: " + zahlenfeld.length);
            System.out.println("Ausgabe des kompletten Arrays:");
            for (int i = 0; i < zahlenfeld.length; i++)
                System.out.println("zahlenfeld[" + i + "] hat Wert " + zahlenfeld[i]);
        } 
        else 
        {
            if ( !(bis > zahlenfeld.length) ) 
            {
                System.out.println("Arraylaenge: " + zahlenfeld.length);
                System.out.println("Ausgabe bis: " + bis);
                for (int i = 0; i < bis; i++)
                    System.out.println("zahlenfeld[" + i + "] hat Wert " + zahlenfeld[i]);
            } 
            else 
            {
                System.out.println("Fehler: Parameter 'bis' überschreitet tatsächliche Arraylänge!");
            }
        }
        System.out.print("\n");
    }  

    public void GebeArrayAusKomplett() 
    {
        GebeArrayAusBis(0);
    }

    public void LegeArrayAnundMischeAusgabe(int anzahl, String testfall) 
    {       
        LegeArrayAn(anzahl);     
        MischeArray(testfall);       
        GebeArrayAusBis(0);
    }

    public void LegeArrayAnundMischeKeineAusgabe(int anzahl, String testfall) 
    {       
        LegeArrayAn(anzahl);     
        MischeArray(testfall);
    }
}
