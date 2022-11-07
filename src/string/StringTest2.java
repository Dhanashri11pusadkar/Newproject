package string;

public class StringTest2 {
    public static void main(String[] args) {
        String testString="Strings, which are widely used in Java programming, are a sequence of characters.";
        System.out.println("length of above string is="+ testString.length());
//split method
        String[] words= testString.split(" ");
        System.out.println("total number of word in above string=" +words.length);
        int i=0;
        for(String word:words)
        {
            i++;
            System.out.println(i+":"+word);
        }
     // String[] ws= testString.split("t");
       //System.out.println("ws.length");
     if(testString.contains("Java"))

     System.out.println("String is avilabel");
     else
        System.out.println("String is  not avilabel");

        System.out.println(testString.toLowerCase());
        System.out.println(testString.toUpperCase());

        System.out.println("the char at index no 3:"+testString.charAt(3));
        System.out.println("the char at index no 9:"+testString.charAt(9));
        System.out.println("the char at index no 11:"+testString.charAt(11));

        System.out.println("index of char 'j' is:"+testString.indexOf('j'));
        System.out.println("index of char 'm' is:"+testString.indexOf('m'));

        System.out.println("string after substracting:");
        System.out.println(testString.substring(15));
        System.out.println(testString.substring(5,15));

        System.out.println(testString.isEmpty());
        String test="";
        System.out.println(testString.isEmpty());

    }
}
