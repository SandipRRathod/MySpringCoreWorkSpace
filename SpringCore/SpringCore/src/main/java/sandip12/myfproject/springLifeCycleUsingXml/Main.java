package sandip12.myfproject.springLifeCycleUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("sandip12/myfproject/springLifeCycleUsingXml/productconfig.xml");
	System.out.println(context.getBean("productInfo"));
	
	// for destroy method
	context.registerShutdownHook();
	}

}
