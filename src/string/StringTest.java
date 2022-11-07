package string;

public class StringTest {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3=new String("Java");
        String s4=new String("Java");
        if(s1==s2)
            System.out.println("both are same");
        else
            System.out.println("both are not same");
        if(s3==s4)
        System.out.println("both are same");
        else
            System.out.println("both are not same");
        if(s3.equals(s4))
            System.out.println("both are same");
        else
            System.out.println("both are not same");
        if(s2==s4)
            System.out.println("both are same");
        else
            System.out.println("both are not same");
        if(s2.equalsIgnoreCase(s4))
            System.out.println("both are same");
        else
            System.out.println("both are not same");


    }
}
