package streams;

import java.util.stream.Stream;

/**
 * @Author: cc
 * @Date: 2020/1/13 16:29
 */
public class Demo10StreamLimit {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        //大于数组长度不做任何操作
        long count = original.limit(4).count();
        System.out.println(count);
    }
}
