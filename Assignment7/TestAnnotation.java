package Assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // Can't be used only on non-static methods
@Retention(RetentionPolicy.RUNTIME)
@interface Test {

}
public class TestAnnotation {
    public static void main(String[] args) {
        TestAnnotation.m1();
        TestAnnotation obj = new TestAnnotation();
        obj.m2();
    }

    @Test
    public static void m1(){
        System.out.println("Static method");
    }

    @Test
    public void m2(){
        System.out.println("Non static method");
    }
}
