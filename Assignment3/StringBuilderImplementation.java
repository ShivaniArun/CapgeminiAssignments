package Assignment3;

public class StringBuilderImplementation {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("StringBuilder");
        str.append(" is a peer class of String");
        str.append(" that provides much of");
        str.append(" the functionality of strings");
        System.out.println(str);
        System.out.println("........................................");
        StringBuilder st = new StringBuilder("It is used to _ at the specified index position");
        st.replace(st.indexOf("_"),st.indexOf("_")+1,"insert text");
        System.out.println(st);
        System.out.println("........................................");
        StringBuilder s =new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println(s.reverse());
    }
}
