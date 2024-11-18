package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//限定注解使用的位置
@Target({ElementType.TYPE,ElementType.METHOD})
//指定注解的有效范围
@Retention(RetentionPolicy.RUNTIME)
public @interface MyText01 {
    String value();
    double aaa() default  100;
    String [] bbb() ;
}
