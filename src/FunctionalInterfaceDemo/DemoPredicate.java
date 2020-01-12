package FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: ck
 * @Date: 2020/1/12 21:04
 */
public class DemoPredicate {
    private static List<String> filter(Predicate<String> p1,Predicate<String> p2,String[] arr){
        List<String> info = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (p1.and(p2).test(arr[i])){
                info.add(arr[i]);
            }
        }
        return info;
    }

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> info = filter(s -> s.split(",")[0].length() == 4,
                s -> s.split(",")[1].equals("女"),array);
        System.out.println(info);
    }
}
