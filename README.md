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

# ===============================

Constructor is get automatically Called whenever we creat it's Object.

# ==============================

## Spring-03 Annotaion

### Annotation

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
##### "org.springframework.stereotype.*".

We need to import this package to take benefits of annotations.



   
