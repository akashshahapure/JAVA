import java.util.*;
public class lieDetector{

   public static void main(String[] args) {

       int X,Y,A,B,heartRate;
       Scanner input= new Scanner(System.in);
       System.out.println("Chemical X = ");
       X=input.nextInt();
       System.out.println("Chemical Y = ");
       Y=input.nextInt();
       System.out.println("Chemical A = ");
       A=input.nextInt();
       System.out.println("Chemical B = ");
       B=input.nextInt();
       System.out.println("Heart Rate = ");
       heartRate=input.nextInt();

       if (X+Y>30){
           System.out.println("The person is telling the truth.");
       }
       else if (A>3 || B<6){
           System.out.println("The person is telling the truth.");
       }
       else if (heartRate==70 && X>3){
           System.out.println("The person is telling the truth.");
       }
       else{System.out.println("The person is lying.");}
      
   }
}

