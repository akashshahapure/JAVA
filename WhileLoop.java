public class WhileLoop {
    public static void main(String[] args) {

        boolean keepDriving = false;
        int currentFuel = 50;
        int loop = 0;

        while (currentFuel > 0){
            keepDriving = true;
            System.out.println("Keep on driving!");
            //System.out.println(currentFuel);
            loop = loop+1;
            currentFuel = currentFuel-1;
        }
        keepDriving = false;
        System.out.println("Need to refuel!");
        System.out.println(loop);
    }
}