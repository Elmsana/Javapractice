package Com.javaConceptsQuestions;

public class oopConcepts {
   /* OOP Concepts
1. Encapsulation: we can hide direct access to the data by giving private keyword.
        And access the data using public getter and setter methods.
        • Getter method is return type(you must initialize to some variable like string),
        no parameters, read data.

         • Setter method is non-return method with void, must have parameter,
         modify the data, use this keyword if param has same name as private data.
         Data type of the param must be same as private data.
         If private data is final we cannot modify.

    Ex:In my project i created multiple POJO/BEAN classes(Json to java (Gson, Jakson ))
            in order to manage test data and actual data.
    EX: I take JSON from API response and convert to object of my POJO class all
            variables are private with getters and setter.
    Also in order to store credentials or sensitive data in my framework
         I have use encapsulation, configuration reader also known as property file or excel
         sheet to hide data fromoutside world to get access.
          I use Apache POI if the data store in Excel in order to extract/read and modify data.


 2. Inheritance: it is used to define relationship between two class,
             which a child class occurs all the properties and behaviours of a parent class.
              Provides code reusability.
        Ex: in my framework I have a TestBase class which
            I store all my reusable code and methods.
             My test execution classes and elements classes will extend the TestBase
             in order to reuse the code.


3. Abstraction: it is process of hiding implementation details and only showing the functionality to the user.
           Abstraction focus on what the object does instead of how it does.
              It is achieved by using Abstract class and Interface.
            abstract methods (methods without body, cannot be static and final), interface must implemented
            and abstract classes must be extended by regular classes in order to achieve abstraction
            ( because abstract methods can only be exist in abstract class and interface).
             A class can implement multiple interfaces, but it can extend only single abstract class.

    Ex: In my framework I have achieve abstraction by using collections or Map,
        because it’s all interface. Most of the cases I come across using List.
       If we want to access elements frequently by using index, List is a way to go.
         ArrayList provides faster access if we know index.
         f we want to store elements and want them to maintain an order, List is a better choice.

      i)List<String> webs=driver.getWindowHandles();
            =>create a list first to store web URLs in list

       ii)findElements evaluates multiple elements so therefore will assigned to List <WebElement>

       iii)To handle dynamic elements store it in the list and identify by index:
           List<WebElement> all=driver.findElements(By.tagname(“”)); (or other locators).


4. Polymorphism: it is ability of a object to behave in multiple forms.
          We use method overloading and overriding to achieve the polymorphism.
          Occurs when a parent class reference is refer to a child class object.
         If the super class is Abstract or Interface the class can only be reference type.
         For the abstract class object it must have to be extended regular class,
          and for the interface it has to be implemented class.

• Overloading(static, compile time) mean same method name and different parameter,
          occur in same class. We can overload static, final and private methods.
             Return type can be different or same.

• Overriding(dynamic, runtime) means same method name and same parameter, occur in different
            class that has inheritance relationship(Is-A). We cannot override static, final and private methods.
            In method overriding return type must be same or coverient. static methods can not be override.

        Ex: WebDriver(interface) driver = new ChromeDriver()(class);
we are initializing Chrome browser using Selenium WebDriver.
    It also means we are creating a reference variable (driver) of the
    interface (WebDriver) and creating an Object.

    */

}
