public class MethodClass1 {
    public static void main(String[] args) {
    //    addsum(9, 3);
        addsum(7, 6, 9);
        addsum(7, 7, 5);

    }

    public static void addsum(int num1, int num2) {
        System.out.println("sum is " +(num1+num2));

    }

    public static void addsum(int num1, int num2, int num3){

        addsum(5,6);
        System.out.println("sum is" +(num1+num2+num3));
    }

    public static void addsum(int num1, double num2){
        System.out.println("sum is" +(num1+num2));

    }
}

