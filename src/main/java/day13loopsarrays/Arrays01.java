package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    /*
        1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
          Bu yapilardan birisi de "Array" lerdir.
     */

    public static void main(String[] args) {

        //Array nasil olusturulur?
        int stdAges[] = new int[7];// [ 0, 0, 0, 0, 0, 0, 0 ]

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasil eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));// [12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);//10

        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

        int ilk = stdAges[0];

        //Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk + son);//24

        //Example 2: stdAges Array'in icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
      //  int sum = 0;

        for(int i=0; i<stdAges.length; i++){
        //    sum = sum + stdAges[i];
        }
       // System.out.println(sum);

//2.Yol while loop
        int sum=0;
        int i=0;
        while (i<stdAges.length){
            sum=sum+stdAges[i];
            i++;
        }
        System.out.println(sum);
//3.yol :do_while_loop
        int s=0;
        int top=0;
        do {

            top=top+stdAges[s];

            s++;
        }while(s<stdAges.length);
        System.out.println(top);

        //4.yol: For Each Loop
        int t= 0;
        for (int w: stdAges ) {
            t = t + w;
        }
        System.out.println(t);
        //Example 3 : String bir array olusturunuz
        //  Bu Array'e 5 tane isim yerlestiriniz
        // Bu isimlerdekikarakter sayilarinin toplamini ekrana yazdiriniz
        String isim[]=new String[5];
        isim[0] = "Ali";
        isim[1] = "Tom";
        isim[2] = "Veli";
        isim[3] = "Kemal";
        isim[4] = "Can";

        int karakterSayilariToplami =0;

      //  for (String w :isim){
       //     karakterSayilariToplami= karakterSayilariToplami +=w.length();
         System.out.println(karakterSayilariToplami);

        // Example 4 : Char bir array olusturunuz
            // Bu array'e 5 eleman ekleyiniz
            // Bu array'deki sadece buyuk harfleri ekrana yazdiriniz

        char ch [] = {'A','c','D','k','M',};
        for (char w :ch){
            if(w>'A'&&w<'Z'){
                System.out.println(w);
            }
        }



        }







    }

