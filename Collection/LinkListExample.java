package Collection;
import java.util.LinkedList;
import java.util.List;
public class LinkListExample {
    public static void initLinkedList(){
        //co 2 cach
        //cach 1
        LinkedList<String> cars = new LinkedList<>();
        //cach 2
        List<String> student = new LinkedList<>();
        //them cac phan tu
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Ford");
        System.out.println(cars);
        //them vao vi tri xac dinh
        cars.add(2,"BMW");
        //Size
        System.out.println("Kich thuoc LinkList: "+ cars.size());
        //Lay phan tu xac dinh
        System.out.println("Phan tu co index = 1"+ cars.get(1));
        //Lay phan tu dau tien va cuooi cung
        System.out.println("Phan tu dau tien:"+ cars.getFirst());
        System.out.println("Phan tu cuoi cung: "+ cars.getLast());
        //update phan tu
        cars.set(1,"Huyndai");
        System.out.println(cars);
        //Tra ve phan tu dau tien roi xoa
        cars.pollFirst();
        //tra ve phan tu cuoi cung roi xoa
        cars.pollLast();
        System.out.println("DS update" + cars);
        //Xoa 1 pt xac dinh
        cars.remove(1);
        cars.remove("Huyndai");
        //Xoa phan tu cuoi va dau
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);
        //Xoa toan bo
        cars.clear();
        System.out.println(cars);
    }
    public static void main(String[]args){
        initLinkedList();
    }
}
