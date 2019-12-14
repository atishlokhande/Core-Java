package try_catch_finally;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExecutionFlow {

    public  static void main(String args[]){

        try{
            System.out.println("Before exception Occurs");
           add();
            System.out.println("After Exception Occurs........");
        }catch (Exception e){
            System.out.println("Exception is in catch block........");
        }
        finally {
            System.out.println("i m in finally.......");
        }
        System.out.println("I main method after finally........");
    }
    public static void add() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
