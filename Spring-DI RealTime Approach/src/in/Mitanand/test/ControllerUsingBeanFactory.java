package in.Mitanand.test;
import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.Mitanand.Service.Flipkart;

public class ControllerUsingBeanFactory {

	public static void main(String[] args) throws IOException {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/Mitanand/configuration/applicationContext.xml");
		
		System.out.println("****Container Started****\n");
		
		System.in.read(); //When we use this we need to Use Exception
		
		Flipkart flipkart = factory.getBean("fk", Flipkart.class);
		System.out.println(flipkart);
		System.out.println();
		String result = flipkart.doShopping(
				new String[] {"fossil", "Tissot"}, 
				new float[] {24000.5f, 12000.5f}
				);
		System.out.println(result);
		System.out.println("\n*****Container Stopped******");
	
	}
}
