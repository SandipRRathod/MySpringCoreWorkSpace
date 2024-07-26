package sandip12.myfproject.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {


	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("sandip12/myfproject/collection/collection.xml");		 
		 System.out.println(context.getBean("emp1"));
	}
}
