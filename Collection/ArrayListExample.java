package Collection;
import java.util.List;
import java.util.ArrayList;
public class ArrayListExample {
    public static void initArrayList(){
        //De khoi tao arraylist co 2 cach
        //Cach 1: Thong qua instance cua arraylist
        ArrayList<String> animals = new ArrayList<>();
        //Cach 2: Thong qua interface la list
        List<String> Students = new ArrayList<>();


        //Them phan tu cho List
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Pig");
        System.out.println(animals);
        //Su dung forearch
        for (String ary : animals)
            System.out.println(ary);
        //Lay du lieu tu 1 phan tu trong ArrayList
        System.out.println("Truy cap phan tu: " + animals.get(3));
        //Cap nhat phan tu
        animals.set(3,"Tiger");
        System.out.println(animals);
        //Xoa phan tu trong arrylist
        animals.remove("Cat");
        animals.remove(1);
        System.out.println(animals);
        animals.clear();
        System.out.println("After clear() "+ animals);
    }
    public static void main(String[]args){

        initArrayList();
    }
}
