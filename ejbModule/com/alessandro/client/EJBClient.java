package com.alessandro.client;

import javax.naming.Context;
import javax.naming.NamingException;
 
import com.alessandro.logic.HelloWorld;
import com.alessandro.logic.HelloWorldBean;
import com.alessandro.clientutility.ClientUtility;
 
public class EJBClient {
     
    public static void main(String[] args) {
        HelloWorld bean = doLookup();
        System.out.println(bean.sayHello()); 
    }
 
    private static HelloWorld doLookup() {
        Context context = null;
        HelloWorld bean = null;
        try {

            context = ClientUtility.getInitialContext();

            String lookupName = getLookupName();

            bean = (HelloWorld) context.lookup(lookupName);
 
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return bean;
    }
 
    private static String getLookupName() {

        String appName = "";
 

        String moduleName = "HelloWorldSessionBean";
 

        String distinctName = "";
 
       
        String beanName = HelloWorldBean.class.getSimpleName();
 
       
        final String interfaceName = HelloWorld.class.getName();
 
       
        String name = "ejb:" + appName + "/" + moduleName + "/" + 
            distinctName    + "/" + beanName + "!" + interfaceName;
 
        return name;
    }
}
