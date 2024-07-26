package sandip12.myfproject.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("sandip12/myfproject/constructor/student.xml");
System.out.println(context.getBean("StudentInfo"));
//System.out.println(context.getBean("CertiName"));

System.out.println(context.getBean("Addition"));
	}

}
