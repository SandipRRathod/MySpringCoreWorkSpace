package sandip12.myfproject.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("sandip12/myfproject/ref/refconfig.xml");
System.out.println(context.getBean("bref"));
System.out.println(context.getBean("aref"));
System.out.println(context.getBean("cref"));
System.out.println(context.getBean("dref"));
	}

}
