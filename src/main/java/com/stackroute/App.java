package com.stackroute;

import com.stackroute.domain.Manager;
import com.stackroute.domain.Surveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Surveyor surveyor = context.getBean("surveyor", Surveyor.class);
        System.out.println(surveyor);
        Manager manager= context.getBean("manager", Manager.class);
        System.out.println(manager);

        Manager manager1 = (Manager) context.getBean("manager");
        System.out.println(manager1);
    }
}
