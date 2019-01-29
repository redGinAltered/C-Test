package problem_1;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Num> someMagicWithArray(double[] arr){

        ArrayList<Num> numArrayList = new ArrayList<>(arr.length);

        for(int i=0; i < arr.length; i++){

            Num newNum = new Num(arr[i]);

            if(numArrayList.contains(newNum)){

                int index = numArrayList.indexOf(newNum);
                numArrayList.get(index).increaseCount();

            } else {

                numArrayList.add(newNum);
            }
        }

        numArrayList.trimToSize();

        numArrayList.sort((n1, n2) -> {
            if(n1.getCount() > n2.getCount())
                return 1;
            else if (n1.getCount() < n2.getCount())
                return -1;
            else if(n1.getValue() > n2.getValue())
                return 1;
            else if(n1.getValue() < n2.getValue())
                return -1;
            else return 0;
        });

        return numArrayList;
    }

    public static void main(String[] args) {

        double[] array = {4,45,10,6,7,8,4,8,6,8,10,12,10,10,45,4,6,45.1};

        ArrayList<Num> numarr = someMagicWithArray(array);

        for (Num n : numarr){
            System.out.println(n);
        }

    }
}
