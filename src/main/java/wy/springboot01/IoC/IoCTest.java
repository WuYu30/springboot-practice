package wy.springboot01.IoC;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wy.springboot01.domain.CalMachine;

public class IoCTest {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("wy.springboot01.domain");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
        //context.getBean(User.class)利用IoC生成对象
        CalMachine calMachine = context.getBean(CalMachine.class);
        calMachine.add(2,3);
        calMachine.sub(2,3);
        calMachine.mul(2,3);
        calMachine.div(2,3);
    }
}
