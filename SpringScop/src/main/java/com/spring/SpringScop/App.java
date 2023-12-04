package com.spring.SpringScop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.context.support.UiApplicationContextUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
        Student s1=a.getBean("s1",Student.class);
        
        s1.setId(1);
        s1.setFname("Prabha");
        s1.setLname("Shanker");
        s1.setEmail("pb@gmail.com");
        
        System.out.println(s1);
    }
}
