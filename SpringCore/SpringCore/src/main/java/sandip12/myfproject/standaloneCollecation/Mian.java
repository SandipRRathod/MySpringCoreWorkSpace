package sandip12.myfproject.standaloneCollecation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con = new ClassPathXmlApplicationContext("sandip12/myfproject/standaloneCollecation/student.xml");
//using satndalone collection 
System.out.println(con.getBean("studentinfo"));
//using collection using values
System.out.println(con.getBean("student"));
	}

}
