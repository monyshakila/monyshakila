package strings;

import java.util.Scanner;


public class StringClass1 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=scanner.nextInt();

        System.out.println("enter 2nd number");
        int num2=scanner.nextInt();
        if(num1>=50 && num1<=100 && num2>=50 && num2<=100 && num1>num2){
            if(num1>num2){
                System.out.println(num1+ "is a bgger number");
            }else{
                System.out.println(num2+ "is a bigger number");
            }
        }else{
            System.out.println("invalid number");

        }
        System.out.println("Enter starting point");
        int num3= scanner.nextInt();
        System.out.println("Enter ending point");
        int num4=scanner.nextInt();
        int count = 0;
        for (int i=num3; i<num4; i++);{
            int i = 0;
            if(i%3==0){
                System.out.println(i);
                count++;
                if(count == 5){
                //    break;
                }

            }
        }









    }

    public static void PrintArraySumequalOrNot(int[] nums1,int[]nums2) {

        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums1.length; i++);{
            sum1= sum1+nums1['i'];


        }
        for(int i=0; i<nums2.length;i++);{

            sum2 = sum2 + nums2['i'];
        }

        if (sum1==sum2){
            System.out.println("they are equal");
        }
        else{
            System.out.println("they are not equal");
        }

    }

}


