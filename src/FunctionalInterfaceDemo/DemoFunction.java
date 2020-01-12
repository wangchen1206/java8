package FunctionalInterfaceDemo;

import java.util.function.Function;

/**
 * @Author: ck
 * @Date: 2020/1/12 21:47
 */
public class DemoFunction {
    private static void method(Function<String, String> f1, Function<String, Integer> f2, Function<Integer, Integer> f3, String s) {
        Integer apply = f1.andThen(f2).andThen(f3).apply(s);
        System.out.println("result: " + apply);
    }

    public static void main(String[] args) {
        String s = "赵丽颖,20";
        method(s1 -> s1.split(",")[1], s1 -> Integer.parseInt(s1), s1 -> s1 + 100, s);
    }
}
