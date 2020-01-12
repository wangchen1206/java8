package FunctionalInterfaceDemo;

import java.util.function.Consumer;

/**
 * @Author: ck
 * @Date: 2020/1/12 12:30
 */
public class Demo10ConsumerAndThen {
    private static void consumerString(Consumer<String> one,Consumer<String> two,String string){
        one.andThen(two).accept(string);
    }

    public static void main(String[] args) {
        String s = "Hello World";
        consumerString(a-> System.out.println(s.toLowerCase()),a-> System.out.println(a.toUpperCase()),s);
    }
}
