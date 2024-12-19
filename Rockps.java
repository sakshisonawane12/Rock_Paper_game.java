import java.util.Scanner;
import java.util.Random;


public class Rockps{
    public static void main(String args[]) {

     /*Choices are as below:
       Rock=0
       Paper=1
       Sissor=2
      */

        Scanner s = new Scanner(System.in);
        System.out.println("number by user is :");
        int b=s.nextInt();
        if (b==0){
            System.out.println("rock");
        }
        else if(b==1){
            System.out.println("paper");
        }
        else if (b==2){
            System.out.println("sissor");
        }
         if  ( b<0 || b>2)
         {
             System.out.println("invalid choice ");
         }



        Random r=new Random();
        int a=r.nextInt(3);
        System.out.println("number by computer is:");
        System.out.println(a);
        if (a==0){
            System.out.println("rock");
        }
        else if(a==1){
            System.out.println("paper");
        }
        else {
            System.out.println("sissor");
        }

       if (a==0 && b==2)
        {
            System.out.println("computer wins");
        }
        else if (a==0 && b==1)
       {
           System.out.println("user wins");
       }
        else if (a==0 && b==0)
       {
           System.out.println("match tie");
       }
        else if (a==1 && b==2)
       {
           System.out.println("user wins");
       }
        else if (a==1 && b==0)
       {
           System.out.println("computer wins");
       } else if (a == 1 && b == 1)
       {
           System.out.println("match tie");
       }
        else if(a==2 && b==0)
       {
           System.out.println("user wins");
       }
        else if (a==2 && b==1)
       {
           System.out.println("computer wins");
       }
        else if (a==2 && b==2)
       {
           System.out.println("match tie");
       }

        else {
           System.out.println("error in the game ");

       }

    }
}







