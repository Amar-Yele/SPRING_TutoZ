package in.Mitanand.AmbiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("in/Mitanand/AmbiguityProblem/AmbigConfig.xml");

		System.out.println("\n**Int************");
		Addtion addInt = app.getBean("addInt", Addtion.class);
		addInt.doSum();
		System.out.println("\n*****String********");
		Addtion addString = app.getBean("addString", Addtion.class);
		addString.doSum();
		System.out.println("\n***********Double**");
		Addtion addDouble = app.getBean("addDouble", Addtion.class);
		addDouble.doSum();
	}

}
