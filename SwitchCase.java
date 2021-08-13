public class SwitchCase {
    public static void main(String[] args)
    {
        String coffee = "Cappuccino";

        switch (coffee) {
            default:
                System.out.println("Please select a valid option...");
                break;
            case "Cappuccino":
                System.out.println("Preparing Cappuccino!");
                break;
            case "Espresso":
                System.out.println("Preparing Espresso!");
                break;
            case "Latte":
                System.out.println("Preparing Latte!");
                break;
            case "Black Coffee":
                System.out.println("Preparing Black Coffee!");
                break;

        }
    }
}