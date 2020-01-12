package FunctionalInterfaceDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: ck
 * @Date: 2020/1/12 11:37
 */
public class Demo6Comparator {
    private static Comparator<String> newComparator(){
//        return  new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };

        return (a,b)->a.length()-b.length();
    }

    public static void main(String[] args) {
        String[] array = {"abc","ab","abcd"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array,newComparator());
        System.out.println(Arrays.toString(array));
    }

}
