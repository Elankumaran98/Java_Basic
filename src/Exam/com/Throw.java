package Exam.com;
class Throw{
    void fun() {
        try {
            throw new NullPointerException();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
}

