package day12loops;

public class Whileloops01 {

    public static void main(String[] args) {

        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz
        // 1.yol:
        for(int i = 3; i<11; i++){

            System.out.print(i +" " );}

        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

         int k=17;

        while (k>3);
        {
        }

//Example 3: 12 den 67 ye kadar sayıların toplamını veren kodu yazınız
 int sum =0 ;
        int m = 12;
        while (m <68){

        sum = sum + m;
        m ++;
        System.out.println(sum);
        }
}


//Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz
    //for( int i = 3;  i <11;i++) {
   //     System.out.print(i);
        }

        //2. yol:
       /* int i=3;
        while (i<11){
        System.out.println(i+ " ");
        i++;
        }

        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int k =17;
        while(k>3){
        if (k%2==0){
        System.out.print(k+" ");
        }
        k--;
        }
         System.out.println();

          //Example 3: 12 den 67 ye kadar sayilarin toplamini veren kodu yazınız

        int sum=0;
        int m = 12;

        while(m<68){

        sum = sum +m;

        m++;

        }
        System.out.println(sum);

        }
        }

            /Example-4: Size verilen bir tam sayının rakamlarının toplamını ekrana yazdıran kodu yazınız
        int sayi = 421;

        int sum = 0;

        while(sayi>0) {
        sum = sum+ sayi%10;
        sayi =sayi/10;
        }
        System.out.println(sum);



        //Example 5: Kullanıcıdan aldığınız bir sayının çarpım tablosunu ekrana yazdırınız


        int verilenSayi = 5;
        while (verilenSayi > 0){
        for (int i = 1; i < verilenSayi; i ++){
        int sonuc = verilenSayi * i;


        System.out.println(verilenSayi + " * " + i + " =" + sonuc );
        }
        verilenSayi--;
        }




        }

        */