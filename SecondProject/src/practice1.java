public class practice1 {
    public static void main(String[] args) {


        int grade = 95;

        if (grade > 90 && grade < 100) {
            System.out.println("Grade is A");

        } else if (grade > 80 && grade < 89) {
            System.out.println("Grade is B");

        } else if (grade > 70 && grade > 79) {
            System.out.println("grade is c");

        } else if (grade > 60 && grade < 769) {
            System.out.println("grade is d");

        } else {
            System.out.println("F");


        }
        int sal = 50000;
        if (sal > 3000 && sal < 50000) {
            if (sal > 10000) {
                System.out.println("higher salary");


            } else {
                System.out.println("lower salary");
            }
        } else {
            System.out.println("invalide salary");

        }
        int i = 26;
        if (i % 2 == 1) {
            System.out.println(i + "is an odd number");

        } else
            System.out.println(i + "is an even number");
        int num = 80;
        if (num % 2 == 1) {
            System.out.println("num is an even number");

        } else {
            System.out.println("num is an odd number");
            {

            }

        }
        int weekday = 5;
        if (weekday == 1) {
            System.out.println("Today is monday");


        } else if (weekday == 2) {
            System.out.println("Today is tuesday");


        } else if (weekday == 3) {
            System.out.println(("Today is weednesday"));
        } else if (weekday == 4) {
            System.out.println("Today is thursday");
        } else if (weekday == 5) {
            System.out.println("Today is friday");
        } else if (weekday == 6) {
            System.out.println("Today is saturday");
        } else if (weekday == 7) {
            System.out.println("Today is sanday");
            {

            }

            for (int num1 = 1; num1 <= 5; num1 = num1 + 1) {
                System.out.println("Hello");

            }
            int month = 5;
            switch (month) {
                case 1:
                    System.out.println("january");
                    break;
                case 2:
                    System.out.println("february");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("april");
                    break;
                case 5:
                    System.out.println("may");
                    break;
                case 6:
                    System.out.println("june");
                    break;
                case 7:
                    System.out.println("july");
                    break;
                default:
                    System.out.println("nothing match");




            }


        }
    }

}
































