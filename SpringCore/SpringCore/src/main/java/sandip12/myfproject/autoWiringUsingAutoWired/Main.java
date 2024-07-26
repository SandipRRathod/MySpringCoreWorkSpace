package sandip12.myfproject.autoWiringUsingAutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context = new ClassPathXmlApplicationContext("sandip12/myfproject/autoWiringUsingAutoWired/studentRecord.xml");
		   System.out.println(context.getBean("studentInfo"));

	}

}
