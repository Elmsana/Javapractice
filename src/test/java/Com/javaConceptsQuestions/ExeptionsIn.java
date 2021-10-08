package Com.javaConceptsQuestions;

public class ExeptionsIn {
    /*Exceptions
    IQ: How do you do exception handling in Java?

    I use try catch blocks to handle any exceptions in my code.
    I am familiar with major checked and unchecked exceptions and
     handle it accordingly to make my code execution smooth

    IQ: What are some exception types that you handled?

    UNCHECKED: indexoutbounds exception while working with strings , arrays.
            NullPointerexception if i forget to instantiate objects.
            CHECKED: IOException, SQLException, FileNotFoundException, InterruptedException

    SELENIUM: NoSuchElementException, NoSuchFrameException, NoSuchAlert Exception,
    NoSuchSessionException, InvalidXpath ~~


    All Selenium related exceptions are UNCHECKED.

  IQ: Explain try catch finally blocks in Java?

            try block: code that is protected for any exceptions

catch block: if any exception happens during runtime in the try block,
catch block will catch that exception.


      if any exception happens during runtime in the try block,
      control will be given to catch block.


            IQ: What is the super class of all exceptions in Java?

    Throwable class is the parent class of all runtime ERRORS, and EXCEPTIONS.

    IQ: Will FINALLY block execute in method body,
    if there is return statement in try or catch block?

      YES! finally always runs!

    IQ: How do you know if a certain exception type is CHECKED or UNCHECKED?

            1) Look at hierarchy, if that exception extends RuntimeException
            then it is an UNCHECKED exception
     if that exception extends Exception, Throwable or any other Checked Exception,
     then it is CHECKED exception.


            2) Throw it, if it compiles, it is a UNCHECKED exception,
            if not it is a CHECKED exception.


            throw new SomeException();

     */

}
