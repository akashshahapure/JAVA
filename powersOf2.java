/*Description
Write a code that prints the highest power of 2, less than or equal to a given number. For e.g.,
if the input number is 9, the code should print 8, as 8 or  23 is the highest power of two which is less than 9.*/

import java.util.Scanner;

class powersOf2{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = scan.nextInt();  
    int result = 1, pwr = 1, exp=1;
    if(number >= 2) {
     
    while (result<=number) {
        pwr = (int)Math.pow(2, exp);
      if(pwr>number){
          break;}
          result = pwr;
          exp++;
    }

    //ALTERNATE SOLUTION

        /*if(number >= 2) {

            while (result * 2 <= number) {
                result = result * 2;
            }*/
    
    System.out.print(result);
    
    } else {
      System.out.print("Please enter an integer >= 2");   
    }
    scan.close();
  }
}
