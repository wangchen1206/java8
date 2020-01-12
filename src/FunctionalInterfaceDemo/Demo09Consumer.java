package FunctionalInterfaceDemo;

import java.util.function.Consumer;

/**
 * @Author: ck
 * @Date: 2020/1/12 12:19
 */
public class Demo09Consumer {
    private static void consumeString(Consumer<String> consumer,String name){
        consumer.accept(name);
    }

    public static void main(String[] args) {
        String name = "cc1";
        consumeString(System.out::println,name);
    }
}
