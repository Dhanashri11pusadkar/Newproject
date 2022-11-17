package oops;
interface AnimalEat
{
    void eat();
}
interface AnimalRun
{
    void run();
}
class Animal implements AnimalEat ,AnimalRun
{
    @Override
    public void eat() {
        System.out.println("Animal eats");
    }

    @Override
    public void run() {
        System.out.println("Animal run");
    }
}
public class MultipleInharitance {
    public static void main(String[] args) {
        Animal tiger=new Animal();
        tiger.eat();
        tiger.run();
    }


}
