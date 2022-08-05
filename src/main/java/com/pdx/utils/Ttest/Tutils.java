package com.pdx.utils.Ttest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName:Tutils
 * @Author JunchiLu
 * @Date 2022/7/18
 * @Version 1.0
 */
public class Tutils {
    public <T extends StudentBen, C extends StudentBen> C getput(Class<T> te, C coo) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        T type = te.newInstance();
        String simpleName = te.getSimpleName();
        String name = te.getName();
        //   Method method = te.getMethod("id",new Class[]{String.class,Integer.class});
        //    Object id = method.invoke(type, "id");
        //    System.out.println(type+"---"+simpleName+"---"+name+"---"+method+"---"+id+"||");
        System.out.println(type + "---" + simpleName + "---" + name + "---" + "||");
        return coo;
    }

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Te te = new Te();
        Tutils tutils = new Tutils();
        tutils.getput(te.getClass(), te);
    }
}
