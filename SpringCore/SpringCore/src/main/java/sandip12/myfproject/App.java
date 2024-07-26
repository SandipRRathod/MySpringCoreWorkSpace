package sandip12.myfproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
//        student student1 =(student) context.getBean("student1");
        
        System.out.println(context.getBean("student1"));
        System.out.println(context.getBean("student2"));
        System.out.println(context.getBean("student3"));

    }
}
