import com.Mitanand.Ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mitanand/Config.xml");
		A a = context.getBean("aref", A.class);
		
		System.out.println(a.getObject());
		System.out.println("Value of X :: "+a.getX());
		System.out.println("Value of Y :: "+a.getObject().getY());
		System.out.println("Value of Y :: "+a.getObject());
		System.out.println(a);
	}

}
