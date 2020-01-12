package FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: ck
 * @Date: 2020/1/12 12:37
 */
public class DemoConsumer {

    private static void printInfo(Consumer<String> one, Consumer<String> two, String info) {
            one.andThen(two).accept(info);
    }

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };

        for (int i = 0; i <array.length; i++) {
            printInfo(s-> System.out.print("姓名：" + s.split(",")[0]),
                    s-> System.out.println("。性别：" + s.split(",")[1] + "。"),
                    array[i]);
        }
    }
}
