import java.util.Scanner;
public class practice {
    public static void main(String args[]){
        /*int a = 23456;
        int ones = a % 10;
        int tens = (a % 100)/10;
        int hundreds = (a % 1000)/100;
        int thousands = (a % 10000)/1000;
        int tThousands = (a % 100000)/10000;
        System.out.println("Ones Place Digit: "+ones);
        System.out.println("Tenth Place Digit: "+tens);
        System.out.println("Hundredth Place Digit: "+hundreds);
        System.out.println("Thousandth Place Digit: "+thousands);
        System.out.println("Ten Thousandth Place Digit: "+tThousands);

        int a = 5, b = 4, c = 3;
        int z = a + b - c * a;
                System.out.println(z);

                int a;
                int b;
                int c;

                Scanner user = new Scanner(System.in);

                System.out.println("Enter value for a");
                a = user.nextInt();
                System.out.println("Enter value for b");
                b = user.nextInt();
                System.out.println("Enter value for c");
                c = user.nextInt();
                int z = a * b + c;
                System.out.println(z);

        int a=200;
        double d=420.4;

        a= (int) d;
        double b=(double) a;
        System.out.println(a);
        System.out.println(b);

        char a = 'a' ;
        char b = 'A' ;
        int cc = (int) a - (int) b ;
        char x = (char) cc ;
        System.out.println(x);

        /*String firstName = "Akash" ;
        String lastName = "Shahapure" ;
        String fullName = firstName + " " + lastName ;
        System.out.println(fullName) ;

        boolean t = true;
        boolean f = false;
        boolean o = true;

        boolean tt = t||f&&!o;
        //boolean ff = t || f;

        System.out.println(tt);
        //System.out.println(ff);

        int speed1 = 15;
        double speed2 = speed1*(5/18);
        System.out.println(speed2);

        boolean bool1,bool2;
        bool1 = ( 1>2 || 2<4 );
        bool2 = ( 23456%2 > 0 );
        if (bool1 && bool2){
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }

        int n1=1, n2=2, n3=3;
        if (n1<n2 && n2<n3){
            System.out.println("Increasing order");
        }
        else if (n1>n2 && n2>n3){
            System.out.println("Decreasing order");
        }
        else{System.out.println("Not in Increasing nor Decreasing order");}

        int ascii = 97;

        while (ascii<=122){
            char x = (char)ascii;
            System.out.print(x + " ");
            ascii++;
        }

        int n=2;
        for (int i=12-n; i>2; i=i-n) {
            System.out.println(i);
        }

        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int num , avg = 0;

        for (int i=0; i<n; i++){
            num= input.nextInt();
            avg = avg+num;
        }
        avg=avg/n;
        System.out.println(avg);*/

        int PIN = 290591, userPIN;
        Scanner user = new Scanner(System.in);

        do{
            System.out.println("Enter PIN");
            userPIN = user.nextInt();
            if(userPIN!=PIN){
                System.out.println("Incorrect PIN");
            }
            else{System.out.println("Correct PIN");}
        }
        while (userPIN!=PIN);

        System.out.println("Welcome");
    }
}
