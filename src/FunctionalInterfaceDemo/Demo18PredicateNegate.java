package FunctionalInterfaceDemo;

import java.util.function.Predicate;

/**
 * @Author: ck
 * @Date: 2020/1/12 20:59
 */
public class Demo18PredicateNegate {
    private static void method(Predicate<String> predicate, String s) {
        boolean veryLong = predicate.negate().test(s);
        System.out.println("字符串很长么：" + veryLong);
    }

    public static void main(String[] args) {
        String s1 = "hello world";
        method(s -> s.length() < 5, s1);
    }
}
