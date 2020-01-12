package FunctionalInterfaceDemo;

import java.util.function.Function;

/**
 * @Author: ck
 * @Date: 2020/1/12 21:15
 */
public class Demo11FunctionApply {
    private static void method(Function<String, Integer> function, String s) {
        int r = function.apply(s);
        System.out.println(r + 20);
    }

    public static void main(String[] args) {
        String s = "1";
        method(s1 -> Integer.parseInt(s1),s);
    }
}
