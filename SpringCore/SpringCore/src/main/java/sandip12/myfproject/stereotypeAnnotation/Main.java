package sandip12.myfproject.stereotypeAnnotation;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"sandip12/myfproject/stereotypeAnnotation/student.xml");
		context.getBean("student");
		
		Student newstd = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ");
		newstd.setFname(sc.nextLine());
		System.out.println("Enter LName ");
		newstd.setLname(sc.nextLine());
		System.out.println(newstd);

	}

}
