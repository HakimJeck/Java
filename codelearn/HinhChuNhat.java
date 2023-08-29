package codelearn;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[]args){
        HinhChuNhat1 HCN = new HinhChuNhat1();
        HCN.width = 4;
        HCN.length = 5;
        HCN.display();
    }
}
class HinhChuNhat1 {
    double length, width;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter(){
        return ( length + width)*2;
    }
    public void display(){
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter " + getPerimeter());
    }
}
