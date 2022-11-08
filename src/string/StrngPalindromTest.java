package string;

import java.util.Scanner;

public class StrngPalindromTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any String");
        String name = sc.nextLine();
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("name after reciving:" + rev);

        if (rev.equals(name))
            System.out.println("palindram string");
        else
            System.out.println("palindram string");
    }
}


