package problem_3;

import java.util.Scanner;

public class Main {

    private static int changeFirstZero(int a){

//        if((a &(a+1)) == 0) {
//            return a;
//        }
//
//        return a | (a+1);

        return (a & (a + 1)) == 0 ? a : a | (a + 1);
    }

    public static void main(String[] args) {

        int value;
        int valueAfter;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter integer value:");
            value = scanner.nextInt();
            System.out.println(Integer.toBinaryString(value));

            valueAfter = changeFirstZero(value);
            System.out.println(Integer.toBinaryString(valueAfter) + "\n");

        } while (value !=666);

    }

}
