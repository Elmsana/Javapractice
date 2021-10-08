package Com.javaConceptsQuestions;

public class methodOverLoadingAndOverriding {
   /* Method Overloading & Overriding
    What's method overloading?

    Overloading mean same method name and different parameter,
    it can happen in same class.
    it's a feature that allows us to have more than one method with same name.
    Example: sort method of Arrays class
    Arrays.sort(int[] arr)
    Arrays.sort(String[] arr)

    Method overloading improves the reusability and readability.
    and it's easy to remember (one method name instead of remembering multiple method names)

    what's method overriding?


    Overriding means same method name and same parameter,
    occur in different class that has inheritance relationship.

    we use method overriding to implement specific functionality to the method.

    Example: get method

    WebDriver driver = new ChromeDriver();

    driver.get("URL") ==> opens the url from chrome

    WebDriver driver = new FireFoxDriver();

    driver.get("URL") ==> opens the url from Firefox

    we can only override instance methods and method override takes place in sub class.
    instance method we are going to override cannot be private and final

    can you overload main method?

    Yes, as long as we pass different parameter(s), we can overload it


    Return type of overloaded method should be same or not?

    return type can be same or different in method overloading


    Return type of override method should be same or not?

            return type MUST be same in method overriding

    }

    */
}
