package FunctionalInterfaceDemo;

import interfaces.MyFunctionInterface;

public class Main {

    private static void doSomething(MyFunctionInterface myFunctionInterface,String name){
        myFunctionInterface.myMethod(name);
    }

    public static void main(String[] args) {
//        doSomething(name-> System.out.println(name),"ccder");
        new Thread(()-> System.out.println("线程任务执行")).start();
    }


}
