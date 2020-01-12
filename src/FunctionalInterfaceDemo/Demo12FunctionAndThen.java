package FunctionalInterfaceDemo;

import java.util.function.Function;

/**
 * @Author: ck
 * @Date: 2020/1/12 21:42
 */
public class Demo12FunctionAndThen {
    private static void method(Function<String, Integer> f1, Function<Integer, Integer> f2, String s) {
        Integer apply = f1.andThen(f2).apply(s);
        System.out.println("result is :" + apply);
    }

    public static void main(String[] args) {
        String s1 = "100";
        method(s -> Integer.parseInt(s), s -> s *= 10, s1);
    }
}
