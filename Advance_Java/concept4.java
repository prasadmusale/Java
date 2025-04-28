package Advance_Java;

//Ducking Exception using throws keyword 
public class A {
    public void show() throws Exception {

    }
}

// custom Exception class
class PrasadException extends Exception{
     System.out.println("This is my custom exception");
}

// handeling exception using try , throw and catch block .
public class concept4 {
    public static void main(String[] args) {

        // this try is called try with resources as it will close created
        // object/resource after execution of try block
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            throw new ArithmeticException();
        }

        catch (ArithmeticException e) {

        } catch (IndexOutOfBoundsException e) {

        } catch (Exception e) {

        }
        // finally block will be executed irrespectve of try block executed or not .
        finally {
            System.out.println("Generally used to close the resources");
        }

    }
}
