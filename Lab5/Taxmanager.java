package Lab5;

public class Taxmanager {
    private static final int MAX = 100;
    private Taxpaper[] list = new Taxpaper[MAX];
    private int count = 0;
    public boolean addTaxpaper(Taxpaper taxpaper){
        if( count >= MAX){
            return false
        }
        list[count++] = taxpaper;
        return true;
    }
    public double getTax(){
        double sum = 0;
        for (int i = 0; i < count; i ++){
            sum += list[i].pay();
        }
        return sum;
    }
}
