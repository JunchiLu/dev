package com.pdx.utils.reflect;

import com.pdx.utils.Ttest.StudentBen;

import java.lang.reflect.Constructor;

/**
 * @ClassName:ReflectTest2
 * @Author JunchiLu
 * @Date 2022/7/18
 * @Version 1.0
 */
public class ReflectTest2<T> {
    public static void main(String[] args) throws Exception {
        ReflectTest2<StudentBen> test2 = new ReflectTest2<>();
        StudentBen m =(StudentBen) test2.getM(new StudentBen());
        System.out.println(m);
    }
    public Object getM(T t) throws Exception {

        Class tClass = t.getClass();
        Constructor constructor = tClass.getConstructor();
        Object instance = constructor.newInstance("为你", 23);
        return instance;
    }
}
