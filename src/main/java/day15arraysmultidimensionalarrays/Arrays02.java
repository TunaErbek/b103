package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example :Size verilen pozitif ve nagatif sayilar iceren bir integer array'deki " en buyuk negatif " ve " en kucuk pozitif
       // elemani yaziniz
        int arr [] = { -12,18,-5,23,-2,0};

        Arrays.sort(arr);
        int maxNegative = arr[0];
        int minPositive =arr [arr.length-1];
        for(int w :arr){
            if(w<0){
                maxNegative = Math.max(maxNegative,w);
            }
       if(w>0){
           Math.min(minPositive,w );
       }
        }
        System.out.println(maxNegative + "and" +minPositive);
    }

}
