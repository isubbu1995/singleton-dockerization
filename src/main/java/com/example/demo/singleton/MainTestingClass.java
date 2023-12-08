package com.example.demo.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainTestingClass {
    public static void main(String[] args) throws Exception {
//        normalExample();
//      serialiseExample();
//      reflectionExample();
      EnumExample();
    }

    private static void EnumExample() {
        System.out.println( EnumSingleton.EnumSingletonClass.hashCode());
        System.out.println( EnumSingleton.EnumSingletonClass.hashCode());
    }

    private static void reflectionExample() throws Exception {
        Constructor<?>[] declaredConstructors = LazySingleton.class.getDeclaredConstructors();
        Constructor<?> declaredConstructor = declaredConstructors[0];
        declaredConstructor.setAccessible(true);
        LazySingleton lazySingleton1 = (LazySingleton)declaredConstructor.newInstance();
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());
        System.out.println(lazySingleton1.hashCode());
    }

    private static void serialiseExample() throws IOException, ClassNotFoundException {
        LazySingletonSerialize lazySingleton = LazySingletonSerialize.getInstance();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("Object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object.obj"));
        LazySingletonSerialize lazySingleton1 =(LazySingletonSerialize) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(lazySingleton.hashCode());
        System.out.println(lazySingleton1.hashCode());
    }

    private static void normalExample() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1=LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());
        System.out.println(lazySingleton1.hashCode());
    }
}
