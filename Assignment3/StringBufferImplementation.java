package Assignment3;

public class StringBufferImplementation {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("StringBuffer");
        str.append(" is a peer class of String");
        str.append(" that provides much of");
        str.append(" the functionality of strings");
        System.out.println(str);
        System.out.println("........................................");
        StringBuffer st = new StringBuffer("It is used to _ at the specified index position");
        st.replace(st.indexOf("_"),st.indexOf("_")+1,"insert text");
        System.out.println(st);
        System.out.println("........................................");
        StringBuffer s =new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println(s.reverse());
    }
}
