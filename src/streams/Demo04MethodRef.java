package streams;

import interfaces.Printable;

/**
 * @Author: cc
 * @Date: 2020/1/13 17:12
 */
public class Demo04MethodRef {
    private static void printString(Printable printable){
        printable.print("Hello World");
    }

    public static void main(String[] args) {
        //通过对象名引用成员方法
        MethodRefObject methodRefObject = new MethodRefObject();
        printString(methodRefObject::printUpperCase);
    }
}
