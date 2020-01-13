package streams;

import java.util.stream.Stream;

/**
 * @Author: cc
 * @Date: 2020/1/13 15:31
 */
public class Demo08StreamMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("10","11","12");
        stream.map(s -> Integer.parseInt(s)).map(s->s+1).forEach(System.out::println);
    }
}
