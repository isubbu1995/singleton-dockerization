package com.example.demo.singleton;

import java.io.Serializable;

public class LazySingletonSerialize implements Serializable {
    private static LazySingletonSerialize lazySingleton = null;

    private LazySingletonSerialize() {

    }

    public static LazySingletonSerialize getInstance() {

        if (lazySingleton == null) {
            synchronized (LazySingletonSerialize.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingletonSerialize();
                }
            }
        }
        return lazySingleton;
    }

    public Object readResolve(){
        return lazySingleton;
    }
}
