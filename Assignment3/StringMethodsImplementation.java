package Assignment3;

import java.util.Locale;

public class StringMethodsImplementation {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(str1.length());
        String str2 = "Hello,";
        String str3 = "How are you?";
        System.out.println(str2 +str3);
        System.out.println(str2.concat(str3));

        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('a','$'));
        System.out.println(str.contains("collection"));
        System.out.println(str.equals("java string pool refers to collection of strings which are stored in heap memory"));
        System.out.println(str.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
    }
}
