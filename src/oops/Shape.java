package oops;

import java.util.Scanner;

abstract class Shape
{
    public void displayInfo()
    {
        System.out.println("i am from shape abstract class :"+Shape.this.getClass());
    }
    public abstract void findArea();//abstract methods.

}

class Square extends Shape{

    @Override
    public void findArea() {
        System.out.println("Area of Square::\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side value:");
        int side=sc.nextInt();
        System.out.println("area of square is :"+(side*side));
    }
}
class Triangle extends Shape{

    @Override
    public void findArea() {
        System.out.println("Area of Triangle::\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the breadth value:");
        int breadth=sc.nextInt();
        System.out.println("enter the height value:");
        int height=sc.nextInt();
        System.out.println("area of square is :"+(0.5*breadth*height));
    }
}
class Circle extends Shape
{

    @Override
    public void findArea() {
        System.out.println("Area of Circle::\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radious value:");
        int radious=sc.nextInt();
        double PI=3.14;
        System.out.println("Area of circle :"+(PI*radious*radious));
    }
}

