package in.Mitanand.Constructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("in/Mitanand/Constructor/Config.xml");

		try {
			System.out.println("\n*********\n");
			Student s = app.getBean("aref", Student.class);	
			System.out.println(s);
		}
		catch(Exception e) {
			System.err.println("Exception found Here");
			e.printStackTrace();
		}
		
		try {
			System.out.println("\n*********\n");
		
			Student e = app.getBean("eref", Student.class);
			System.out.println(e);
		}
		catch(Exception e) {
			System.err.println("Exception found Here");
			e.printStackTrace();
		}
		try {
			
			System.out.println("\n*********\n");	
			Student g = app.getBean("gref", Student.class);
			System.out.println(g);
		}
		catch(Exception e) {
			System.err.println("Exception found Here");
			e.printStackTrace();
		}
		
		//All the Three ways are done in xml Configuration
		
	}

}
