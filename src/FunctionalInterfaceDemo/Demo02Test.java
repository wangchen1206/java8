package FunctionalInterfaceDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Supplier;

/**
 * @Author: ck
 * @Date: 2020/1/12 12:10
 */
public class Demo02Test {
    private static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 52, 333, 23};
//        Arrays.sort(arr);
        int max = getMax(() -> {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });
        System.out.println(max);
    }
}
