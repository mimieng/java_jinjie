package Annnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//只能注解方法
@Retention(RetentionPolicy.RUNTIME)//运行时保留
public @interface MyTest {
}
