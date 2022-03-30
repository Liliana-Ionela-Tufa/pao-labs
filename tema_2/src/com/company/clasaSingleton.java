package com.company.singleton;

public class clasaSingleton {
    private static clasaSingleton x;

    private clasaSingleton(){
    }

    static clasaSingleton getInstance(){
        if(x==null){
            x = new clasaSingleton();
        }
        return x;
    }
}
