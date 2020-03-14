import java.util.*;

/**
 * Write a description of class Sortierverfahren here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Sortierverfahren extends Verfahren implements Sort
{
    private String name;
    protected int count = 0;
    
    public Sortierverfahren(String pName)
    {
        name = pName;
        LegeCustomeArrayAnUnsortiert();
    }
    
    public int getCount() {
        return count;
    }
    
    public void resetCount() {
        count = 0;
    }
    
    protected void createTest() {
        LegeCustomeArrayAnUnsortiert();
        GebeArrayAusKomplett();
        System.out.println("---------------------------");
        System.out.println(name);
        System.out.println("---------------------------");
        resetCount();
    }
    
    protected void out() {
        GebeArrayAusKomplett();
        System.out.println("\nSortierschritte: " + count + "\n");
    }
}
