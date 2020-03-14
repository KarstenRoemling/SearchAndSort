
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort extends Sortierverfahren
{
    public BubbleSort()
    {
        super("BUBBLE SORT");
    }

    public void sort() {
        for(int n = zahlenfeld.length; n > 1; n--)
            for(int i = 0; i < n - 1; i++) {
                count++;
                if(zahlenfeld[i] > zahlenfeld[i+1])
                    tausche(i, i+1);
            }
    }
    
    public void test() {
        super.createTest();
        sort();
        super.out();
    }
}
