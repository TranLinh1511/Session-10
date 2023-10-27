package baitap;

public class Main {
    public static void main(String[] args) {
        Retangle retangle = new Retangle(5,7);
        System.out.println("hinh chu nhat co chieu rong la "+ retangle.getWidth()+ " chieu cao la "+ retangle.getHeight() +" co dien tich la "+ retangle.getArea());
        Circle circle = new Circle(5);
        System.out.println("hinh tron voi ban kinh la "+ circle.getRadius() +" co dien tich la " +circle.getArea());
    }
}
