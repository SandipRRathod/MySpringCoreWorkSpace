package sandip12.myfproject.autoWiringUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ApplicationContext context = new ClassPathXmlApplicationContext("sandip12/myfproject/autoWiringUsingXml/studentRecord.xml");
   System.out.println(context.getBean("StudentInfo"));
   System.out.println(context.getBean("StudentInfo"));
   
   
   //for prototype bean scope 
//   System.out.println(context.getBean("StudentInfo").hashCode());
//   System.out.println(context.getBean("StudentInfo").hashCode());
   
   
   //for expression  spel
   
//   SpelExpressionParser temp = new SpelExpressionParser();
//   
//  System.out.println(temp.parseExpression("10+20").getValue());
	}

}
