public class practiceFunction {
    /*public static void print(String var1, int var2) {
        for (int i = 0; i < var2; i++) {
            System.out.println(var1 + " " + i);
        }
    }

    public static void main(String[] args) {
        String var1 = "Hello";
        int var2 = 4;
        print(var1, var2);
    }
}*/

    public static void main(String[] args) {
        String string1 = "Welcome";
        uppercase(string1);
        System.out.println(string1);
    }

    public static String uppercase(String string1) {
        string1.toUpperCase();
        return string1;
    }
}