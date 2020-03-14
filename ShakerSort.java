
/**
 * Write a description of class ShakerSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShakerSort extends Sortierverfahren
{
    public ShakerSort()
    {
        super("SHAKER SORT");
    }

    public void sort() {
        int left = -1;
        int right = zahlenfeld.length - 2;
        boolean swapped = false;
        
        do {
            
            swapped = false;
            left++;
            for(int i = left; i <= right; i++) {
                count++;
                if(zahlenfeld[i] > zahlenfeld[i + 1]) {
                    tausche(i, i + 1);
                    swapped = true;
                }
            }
            
            if(!swapped)
                break;
                
            swapped = false;
            right--;
            for(int i = right; i >= left; i--) {
                count++;
                if(zahlenfeld[i] > zahlenfeld[i + 1]) {
                    tausche(i, i + 1);
                    swapped = true;
                }
            }
            
        } while(swapped);
    }
    
    public void test() {
        super.createTest();
        sort();
        super.out();
    }
}
