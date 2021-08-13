import java.util.Scanner;
class incomeTax{
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter annual income :");
        double income = scan.nextDouble();
        System.out.println("Enter age :");
        int age = scan.nextInt();
        
        double tax = 0.0;
        
        if (age<60){
            System.out.println("You are eligible for tax Rs. ");

            if (income<=250000){
                tax = 0.0;
            }
            else if (income>250000 && income<=300000){
                tax = 0.10 * (income-250000);
            }
            else if (income>300000 && income<=500000){
                tax = (0.10 * (income-300000)) + (0.10 * (300000-250000));
            }
            else if (income>500000 && income<=1000000){
                tax = (0.20 * (income-500000)) + (0.10 * (500000-250000));
            }
            else{
                tax = (0.30* (income-1000000)) + (0.20 * (1000000-500000)) + (0.10 * (500000-250000));
            }
        }
        else if (age>61 && age<80){
            System.out.println("You are eligible for tax Rs. ");

            if (income<=300000){
                tax=0.0;
            }
            else if (income>300000 && income<=500000){
                tax = 0.10 * (income-300000);
            }
            else if (income>500000 && income<=1000000){
                tax = (0.20 * (income-500000)) + (0.10 * (500000-250000));
            }
            else{
                tax = (0.30* (income-1000000)) + (0.20 * (1000000-500000)) + (0.10 * (500000-300000));
            }
        }
        else{
            System.out.println("You are eligible for tax Rs. ");

            if (income<=500000){
                tax=0.0;
            }
            else if (income>500000 && income<=1000000){
                tax = 0.20 * (income-500000);
            }
            else {
                tax = (0.30 * (income - 100000)) + (0.20 * (1000000 - 50000));
            }
        }
        
        System.out.print(tax);
        scan.close();
    }
}