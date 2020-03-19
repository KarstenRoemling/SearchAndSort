
/**
 * Write a description of class SelectionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSort extends Sortierverfahren
{
    public SelectionSort()
    {
        super("SELECTION SORT");
    }

    public void sort() {
        int highestIndex = zahlenfeld.length - 1;
        int insertIndex = 0;
        do {
            int minPosition = insertIndex;
            for(int i = insertIndex + 1; i < highestIndex + 1; i++) {
                count++;
                if(zahlenfeld[i] < zahlenfeld[minPosition])
                    minPosition = i;
            }
            tausche(minPosition, insertIndex);
            insertIndex++;
        } while(insertIndex < highestIndex);
    }
    
    public void test() {
        super.createTest();
        sort();
        super.out();
    }
}
