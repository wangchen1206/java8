package streams;

import java.util.stream.Stream;

/**
 * @Author: cc
 * @Date: 2020/1/13 16:33
 */
public class Demo13StreamConcat {
    public static void main(String[] args) {
        Stream<String> a = Stream.of("张翠山");
        Stream<String> b = Stream.of("张无忌");
        Stream<String> c = Stream.concat(a,b);
        c.forEach(System.out::println);
    }
}
