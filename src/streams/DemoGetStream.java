package streams;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: cc
 * @Date: 2020/1/13 15:12
 */
public class DemoGetStream {
    public static void main(String[] args) {
        String[] array = { "张无忌", "张翠山", "张三丰", "张一元" };
        Stream<String> stream= Stream.of(array);

        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        HashMap<String,String> hashMap = new HashMap<>(1<<4);
        Stream<String> keyStream = hashMap.keySet().stream();
        Stream<String> valueStream = hashMap.values().stream();
        Stream<Map.Entry<String,String>> entryStream = hashMap.entrySet().stream();

        HashSet<String> hashSet = new HashSet<>();
        Stream<String> hashSetStream = hashSet.stream();

        Vector<String> vector = new Vector<>();
        Stream<String> vectorStream = vector.stream();

    }
}
