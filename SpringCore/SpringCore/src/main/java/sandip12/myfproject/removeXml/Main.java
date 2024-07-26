package sandip12.myfproject.removeXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con = new AnnotationConfigApplicationContext(XmlAsConfig.class);
System.out.println(con.getBean("student"));
	}

}
