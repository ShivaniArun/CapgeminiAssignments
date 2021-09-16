package Assignment7;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute {
    int sequence() default 1;
}

public class ExecuteImplementation {
    public static void main(String[] args) throws NoSuchMethodException {
        MyClass obj = new MyClass();
        Method c = obj.getClass().getMethod("myMethod1");
        Annotation a = c.getAnnotation(Execute.class);
        Execute e = (Execute) a;
        System.out.println(e.sequence());
    }
}

class MyClass {
    @Execute(sequence = 2)
    public void myMethod1(){
        System.out.println("Method 1");
    }

    @Execute(sequence = 1)
    public void myMethod2(){
        System.out.println("Method 2");
    }

    @Execute(sequence = 3)
    public void myMethod3(){
        System.out.println("Method 3");
    }
}