package FunctionalInterfaceDemo;

import java.util.function.Predicate;

/**
 * @Author: ck
 * @Date: 2020/1/12 20:55
 */
public class Demo17PredicateOr {
    private static void method(Predicate<String> p1,Predicate<String> p2,String s){
        boolean isValid = p1.or(p2).test(s);
        System.out.println("字符串有效么："+isValid);
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        method(s -> s.contains("a"),s -> s.contains("b"),s1);
    }
}
