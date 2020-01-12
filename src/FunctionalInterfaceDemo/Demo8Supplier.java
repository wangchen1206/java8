package FunctionalInterfaceDemo;

import java.util.function.Supplier;

/**
 * @Author: ck
 * @Date: 2020/1/12 12:00
 */
public class Demo8Supplier {
    private static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String string = getString(() -> a + b);
        System.out.println(string);
    }
}
