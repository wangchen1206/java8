package streams;

import java.util.stream.Stream;

/**
 * @Author: cc
 * @Date: 2020/1/13 16:30
 */
public class Demo11StreamSkip {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        original.skip(1).forEach(System.out::println);
    }
}
