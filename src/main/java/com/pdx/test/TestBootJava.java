package com.pdx.test;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.naming.Context;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/**
 * @ClassName:TestBootJava
 * @Author JunchiLu
 * @Date 2022/6/16
 * @Version 1.0
 */
public class TestBootJava {

    public static void main(String[] args) {
   // keyToValueMap();
        ContainsJava();

    }
    public static void ContainsJava(){
        System.out.println(StringUtils.contains("11","1"));


    }

    public static void keyToValueMap(){
        MultiValueMap<String, String> valueMap = new LinkedMultiValueMap<>();
        List<String> list = new ArrayList<>();
       /* list.add("list1");
        list.add("list2");
        list.add("list3");
        valueMap.put("1",list);*/
        valueMap.add("2","String2");
        valueMap.add("2","String2");
        Set<String> strings = valueMap.keySet();
        for (String s : strings
             ) {
            System.out.println(s);
            List<String> list1 = valueMap.get("2");
            System.out.println(valueMap.get(s));
        }
    }
//做登录请求密码校验的；InitialLdapContext、LdapContext
    private LdapContext getContext() throws Exception {
        System.out.println("woe-----");
        Hashtable<String, String> envDC = new Hashtable<String, String>();
        envDC.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        //envDC.put(Context.PROVIDER_URL, "127.0.0.1");
        envDC.put(Context.SECURITY_AUTHENTICATION, "simple");
        envDC.put(Context.SECURITY_PRINCIPAL, "asdf");
        envDC.put(Context.SECURITY_CREDENTIALS, "123456");
        return new InitialLdapContext(envDC, null);
    }
}
/**
 * @ClassName:TestBootJava
 * @Author JunchiLu
 * @Date 2022/6/16
 * @Version 1.0
 */