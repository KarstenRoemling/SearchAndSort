import java.util.*;
/**
 * Write a description of class InsertionSortLinear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSortLinear extends Sortierverfahren
{
    public InsertionSortLinear()
    {
        super("INSERTION SORT LINEAR");
    }

    public void sort() {
        ArrayList<Integer> tempZahlenfeld = new ArrayList<Integer>();
        for(int i = 0; i < zahlenfeld.length; i++){
            int pos = getPosition(zahlenfeld[i], tempZahlenfeld);
            tempZahlenfeld.add(pos, zahlenfeld[i]);
        }
        for(int i = 0; i < zahlenfeld.length; i++) {
            zahlenfeld[i] = tempZahlenfeld.get(i);
            count++;
        }
    }
    
    private int getPosition(int suchzahl, ArrayList<Integer> searchList) {
        int i;
        for(i = 0; i < searchList.size(); i++) {
            count++;
            if(searchList.get(i) >= suchzahl)
                return i;
        }
        return i;
    }
    
    public void test() {
        super.createTest();
        sort();
        super.out();
    }
}
