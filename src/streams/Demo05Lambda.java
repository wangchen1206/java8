package streams;

import interfaces.Calcable;

/**
 * @Author: cc
 * @Date: 2020/1/13 17:19
 */
public class Demo05Lambda {
    private static void method(int num, Calcable calcable){
        System.out.println(calcable.calc(num));
    }

    public static void main(String[] args) {
        int n = -10;
        method(n,num -> Math.abs(num));
        //使用类名称引用静态方法
        method(n,Math::abs);
    }
}
