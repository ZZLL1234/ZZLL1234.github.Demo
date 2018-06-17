package com.china;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app = new App();
        app.method();
    }

    private void method() {
        System.out.println("第一次使用git提交本地数据");
    }

    private static void method1(){
        System.out.println("第二次提交git");
    }
}
