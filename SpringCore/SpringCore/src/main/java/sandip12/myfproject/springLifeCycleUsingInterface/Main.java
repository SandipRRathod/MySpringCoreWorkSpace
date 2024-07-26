package sandip12.myfproject.springLifeCycleUsingInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("sandip12/myfproject/springLifeCycleUsingInterface/product2.xml");
	System.out.println(context.getBean("productInfo"));
	context.registerShutdownHook();
	}

}
