package streams;

import java.util.stream.Stream;

/**
 * @Author: cc
 * @Date: 2020/1/13 15:23
 */
public class Demo12StreamForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰","张无忌","周芷若");
        stream.forEach(System.out::println);
    }
}
