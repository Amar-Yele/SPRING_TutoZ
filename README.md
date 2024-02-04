# Spring_TutoZ
## Scratch Spring
Spring is Framework which used to develop the Enterprize Java Applications. 

To Building the such applications Spring provide Cohesive and modular approach.

Spring Framework was released alpha/beta 0.9 version in early 2002. 

Spring Firstly released 1.0 production version in 2004.

It is the Technology which is build on top of the Java and it's API's.

It contains, Spring Core, "GOF(Gang of Four)--->>>Creational Design Pattern, Structural DP, Behavioural DP--->>>Strategy DP", Setter Injection, Dependency Injection, STS, MVN, and lots of things.

# ================================

In main class we need to tell the IOC, collection the Information from the XML files.

To collect the information from XML by IOC there is two approaches

1) OLD Approach

    Need to import the required Packages

{
   
   Resource resource = new ClassPathResource("Bean.xml");
   
   BeanFactory factory = new XmlBeanFactory(resource);
   
   factory.getBean("object_Name", Class_Name.class);
 
  }


3) NEW Approach or Recently used :-

    Here also need to import the Packages
 
  {
  
   ApplicationContext app = new ClassPathXmlApplicationContext("Bean.xml");
 
  }
  
   but when we use this NEW Approach then then we don't need explicitly call the object.

Constructor is get automatically Called whenever we creat it's Object.

# ==============================

## Spring-03 Annotaion **********

### Annotation *******

came in the java's 1.5 version.

Annotation means Metadata only.

They are can be used as a message to developer, msg to the Compiler, msg, JVM etc and also it work as a Comments.

some of the important and commonly used annotations in the Spring are following,
1. @Repository
2. @Service
3. @Configuration
4. @Component
5. @Bean
6. @Controller
7. @RestController
8. @Autowired
9. @Required
10. @Primary
11. @Transactional

They are the some of the commonly used annotations in the spring and springboot also.

Annotations are present in the package of,
#### "org.springframework.stereotype.*".

We need to import this package to take benefits of annotations.
# =============================
# Spring DI Real Time Approach

### Setter Injection
1. use setter method to inject the dependant values/objects to target class object.
2. #### < property name='' value=''/ > and < property name='' ref=''/ >
3. supports cylic dependancy injection
4. bit slow becoz injection happens after creating the Target class object.
5. First Target object and later Dependant object will be created.
6. It is best suited when we want to involve our choice no of properties in 
dependancy injection.
7. If we configure spring bean in setter injection style,then container will create
the bean using "zero-arg" constructor.

In setter injection, dependencies are injected through setter methods of the bean.

It provides flexibility as you can modify or update dependencies after the bean is instantiated.

It requires a default (no-argument) constructor for the bean, and dependencies can be set using setter methods.

### Constructor Injection
1. use constructor to inject the dependant values/objects to target class object.
2. #### "< constructor-arg name='' value=''/ > and <constructor-arg name='' ref=''/ >
3. Doesn't supports cylic dependancy injection
4. It is Fast becoz injection happens while instantiating the dependant class 
object.
5. First Dependant object and later Target object will be created.
6. It is not best suited when we want to involve our choice no of properties in 
dependancy injection,for this we need n! overloaded constructor.
7. If we configure spring bean in constructor injection style,then container will 
create the bean using "n-param" constructor.

In constructor injection, dependencies are injected through the constructor of the bean.

It ensures that a bean is always created in a fully initialized state.

It is often considered a better practice for mandatory dependencies, as it enforces that the required dependencies are provided during bean creation.
### DefaultListableBeanFactory
It is a basic implementation of the BeanFactory interface.

It provides the fundamental features of a bean factory, such as bean instantiation, configuration, and lifecycle management.

It is more low-level and is suitable for programmatic bean registration and manipulation.
### ApplicationContext
The ApplicationContext is a central interface in Spring that represents the Spring IoC container. It is responsible for managing the beans of an application, handling their lifecycle, and providing services like dependency injection.

It is a more advanced and feature-rich container that extends "DefaultListableBeanFactory".

It includes additional functionalities like event propagation, declarative mechanisms for bean configuration (through XML, annotations, or Java configuration), AOP (Aspect-Oriented Programming) support, and more.

"ApplicationContext" is more suitable for enterprise-level applications due to its higher-level features and better integration capabilities.
#### DefaultListableBeanFactory is a basic bean factory with core functionalities, "ApplicationContext" extends it and provides additional features for enterprise-level applications.

### ClassPathXmlApplicationContext
"ClassPathXmlApplicationContext" is one of the implementations of "ApplicationContext".

It is used to create a Spring container by reading the bean definitions from an XML file located in the classpath of the application.





   
