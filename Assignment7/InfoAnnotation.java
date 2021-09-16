package Assignment7;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
    String authorID();
    String author() default "";
    String supervisor() default "";
    String date();
    String time();
    int version();
    String description() default "";
}

public class InfoAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        Demo obj = new Demo();
        Class<?> c = obj.getClass();
        Annotation a = c.getAnnotation(Info.class);
        Info i = (Info) a;
        System.out.println("Author id: "+i.authorID());
        System.out.println("Date is : " + i.date());

        // For fun()
        Method m = obj.getClass().getMethod("fun");
        Info i1 = m.getAnnotation(Info.class);
        System.out.println("Author id: "+i.authorID());
        System.out.println("Time is : "+i.time());
    }
}

@Info(authorID = "100",date = "15-09-21", time = "12:49", version = 5)
class Demo {
    int num = 10;

    @Info(authorID = "201",date = "15-09-21", time = "13:00", version = 8)
    public void fun(){
        System.out.println("Inside fun");
    }
}