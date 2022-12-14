import java.util.Scanner;
import java.util.Random;
import java.lang.*;//System.exit(0); exit the program
class Game{
    Scanner sc=new Scanner(System.in);
    int x,r;
    public void get() {
        System.out.println("enter a number...!");
        x=sc.nextInt();
    }    
}
class RRR extends Game{
    Random ran=new Random();
    public void rondoms() {
        r=ran.nextInt(101);
        System.out.println("computer generating number...! 0-100  "+r);
        get();
    } 
}
class Check extends RRR{
    public void check() {
        if(x==r)
        {
            System.out.println("your guess is correct");
            System.exit(0);
        }else if(x-r>=1 && x-r<=9)
        System.out.println("wrong but almost");
        else if(x-r>0)
        System.out.println("your guess is high");
        else if(x-r<0)
        System.out.println("your guess is low");
    }
}
public class guess{
    public static void main(String[] args) {
        Check obj=new Check();
        System.out.println("total chance is 3");
        obj.rondoms();
        int i;
        for(i=0;i<2;i++){
            obj.check();
            obj.get();
        }
        obj.check();
        if(i==2)
        {
            System.out.println("try again..!");
        }
    }
}