package casting;

public class App1
{
    public static void main(String args[]){

        c1 c1=new c2();//up casting
        c1.add();
        c2 c2=(c2)c1;//down casting
        c2.add();
    }

}
class c1{

    public  void add(){

        System.out.println("welcome in c1 class");
    }
}
class c2 extends c1{

    public void add(){

        System.out.println("welcome in c2 class");
    }
}
