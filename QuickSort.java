
/**
 * Write a description of class QuickSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSort extends Sortierverfahren
{
    public QuickSort()
    {
        super("QUICK SORT");
    }

    public void sort() {
        quicksort(0, zahlenfeld.length - 1);
    }
    
    private void quicksort(int left, int right) {
        if(left < right) {
            int seperator = seperate(left, right);
            quicksort(left, seperator - 1);
            quicksort(seperator + 1, right);
        }
    }
    
    private int seperate(int left, int right) {
        int i = left;
        int j = right - 1;
        int middle = zahlenfeld[right];
        
        while(i < j) {
            while(i < right && zahlenfeld[i] < middle) {
                count++;
                i++;
            }
            while(j > left && zahlenfeld[i] >= middle) {
                count++;
                j--;
            }
            if(i < j) {
                count++;
                tausche(i, j);
            }
        }
        
        if(zahlenfeld[i] > middle) {
            count++;
            tausche(i, right);
        }
        
        return i;
    }
    
    public void test() {
        super.createTest();
        sort();
        super.out();
    }
}
