package Annotation;
import org.junit.Test;
import javax.annotation.processing.SupportedAnnotationTypes;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class text {
public static void main(String[] args) throws NoSuchMethodException {
     text t = new text();
     t.test();
     t.demo();

}
    @Test
    public void test() throws NoSuchMethodException {
        Class a1 = Demo.class;
        if (a1.isAnnotationPresent(MyText01.class)) {
            MyText01 an = (MyText01) a1.getDeclaredAnnotation(MyText01.class);
            System.out.println(an.value());
            System.out.println(an.aaa());
            System.out.println(Arrays.toString(an.bbb()));
//           System.out.println(Arrays.toString(MyText01.bbb()));
        }

            } public void demo() throws NoSuchMethodException {
                Class a2 = Demo.class;
                Method show = a2.getDeclaredMethod("show");
                if (a2.isAnnotationPresent(MyText01.class)) {
                    MyText01 an = (MyText01)show.getDeclaredAnnotation(MyText01.class);
                    System.out.println(an.value());
                    System.out.println(an.aaa());
                    System.out.println(Arrays.toString(an.bbb()));
//           System.out.println(Arrays.toString(MyText01.bbb()));
        }
    }
}
