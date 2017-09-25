package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD,ElementType.PARAMETER,ElementType.TYPE })   //这个注解能放在什么地方
public @interface Id {
     String name();
     int age();
}
