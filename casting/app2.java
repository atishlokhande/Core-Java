package casting;

public class app2
{
    public static void  main(String args[])
    {
        System.out.println("this is the main method...");

        demo.main();
        demo.main(3);
    }


}
class demo{
    public static void  main(){
        System.out.println("this is the main method...no param");
    }
    public static  void  main(int i){
        System.out.println("this is the main method...int param");
    }
}

