package in.Mitanand.Spring_06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
        
        Student student1 = (Student) app.getBean("student1");
        Student student2 = app.getBean("student2", Student.class);

        
    	System.out.println( "\n****Container Started****\n" );
    	
    	System.out.println(student1);
    	
    	System.out.println("\n*****Individual Accessing by Attribute********");
    	
    	System.out.println("Student Id 	:: "+student2.getStudentId());
    	System.out.println("Student Name 	:: "+student2.getStudentName());
    	System.out.println("Phone Numbers 	:: "+student2.getStudentPhone());
    	System.out.println("Addresses 	:: "+student2.getStudentAddress());
    	System.out.println("Course Enrolled :: "+student2.getStudentCourses());
        
    }
}
