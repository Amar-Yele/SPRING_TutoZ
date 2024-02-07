package com.Mitanand.Annotations;
import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;

// 	import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

public class Watch {
	
	private Long price;
	private String compName;
	private String Origin;
	
	public Watch() {
		super();
		System.out.println("Constructror :: Watch.Watch()");
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getOrigin() {
		return Origin;
	}

	public void setOrigin(String origin) {
		Origin = origin;
	}

	
	@Override
	public String toString() {
		return "Watch :: Price=" + price + ", \nCompany Name=" + compName + ", \nOrigin=" + Origin;
	}
	
	@PostConstruct
	public void initStart()
	{
		System.out.println("Watch.initStart()");
		System.out.println("Initializing the Bean....");
	}
	@PreDestroy
	public void endDestroy()
	{
		System.out.println("Watch.endDestroy()");
		System.out.println("Destroying the Bean....");
	}
	
/*	These above Annotations are the deprecated from java 9 and java 11 removed them
	These are Part of the "Java EE"
	To use them we need to use following Dependency

    <dependency>
		<groupId>javax.annotation</groupId>
		<artifactId>javax.annotation-api</artifactId>
		<version>1.3.2</version>
	</dependency>
	
	and <context:annotation-config />
	or  <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>
	used to enable the above Annotations.

*
*/
	
}
