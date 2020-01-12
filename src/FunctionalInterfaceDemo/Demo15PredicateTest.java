package FunctionalInterfaceDemo;

import java.util.function.Predicate;

/**
 * @Author: ck
 * @Date: 2020/1/12 20:49
 */
public class Demo15PredicateTest {
    private static void method(Predicate<String> predicate, String s) {
        boolean verylong = predicate.test(s);
        System.out.println("字符串很长么：" + verylong);
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        method(s -> s.length() > 5,s1);
    }
}
