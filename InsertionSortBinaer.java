import java.util.*;
/**
 * Write a description of class InsertionSortBinaer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSortBinaer extends Sortierverfahren
{
    public InsertionSortBinaer()
    {
        super("INSERTION SORT BINÄR");
    }

    public void sort() {
        ArrayList<Integer> tempZahlenfeld = new ArrayList<Integer>();
        for(int i = 0; i < zahlenfeld.length; i++){
            int pos = getPositionBinaer(zahlenfeld[i], tempZahlenfeld);
            tempZahlenfeld.add(pos, zahlenfeld[i]);
        }
        for(int i = 0; i < zahlenfeld.length; i++) {
            zahlenfeld[i] = tempZahlenfeld.get(i);
            count++;
        }
    }
    
    private int getPositionBinaer(int suchzahl, ArrayList<Integer> searchList) {
        int links = 0;
        int rechts = searchList.size() - 1;
        int mitte = (links + rechts) / 2;
        if(searchList.size() == 0)
            return 0;
        while(links <= rechts) {
            count++;
            mitte = (links + rechts) / 2;
            if(suchzahl == searchList.get(mitte))
                return mitte;
            if(suchzahl > searchList.get(mitte))
                links = mitte + 1;
            else if(suchzahl < searchList.get(mitte))
                rechts = mitte - 1;
        }
        return links;
    }
    
    public void test() {
        super.createTest();
        sort();
        super.out();
    }
}
