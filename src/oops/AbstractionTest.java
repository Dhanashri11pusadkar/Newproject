package oops;

public class AbstractionTest {
    public void area(Shape s) {
        s.findArea();
        s.displayInfo();
    }

    public static void main(String[] args) {
//Shape s=new Shape();  we cannot create object of abstract class
//  Shape s=new Circle();//holding child class object into parent class ref is called as upcasting in java

        AbstractionTest at1 = new AbstractionTest();
//        at1.area(new Triangle());
//        at1.area(new Circle());
        at1.area(new Square());
        at1.area(new Circle());

    }
}
