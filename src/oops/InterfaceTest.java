package oops;
interface Printable
{
    void print();
}
interface Showable extends Printable
{
    void show();
}
class InterfaceTest implements Showable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");

    }

    public static void main(String[] args) {
        InterfaceTest Test=new InterfaceTest();
        Test.print();
        Test.show();
    }


}
