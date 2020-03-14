
/**
 * Write a description of class GnomeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GnomeSort extends Sortierverfahren
{
    public GnomeSort()
    {
        super("GNOME SORT");
    }

    public void sort() {
        int pos = 0;
        while(pos < zahlenfeld.length) {
            count++;
            if(pos == 0 || zahlenfeld[pos] >= zahlenfeld[pos - 1])
                pos++;
            else {
                tausche(pos, pos - 1);
                pos--;
            }
        }
    }
    
    public void test() {
        super.createTest();
        sort();
        super.out();
    }
}
