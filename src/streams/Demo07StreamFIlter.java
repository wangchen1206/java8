package streams;

import java.util.stream.Stream;

/**
 * @Author: cc
 * @Date: 2020/1/13 15:29
 */
public class Demo07StreamFIlter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌","张三丰","周芷若");
        stream.filter(s -> s.startsWith("张")).forEach(System.out::println);
    }
}
