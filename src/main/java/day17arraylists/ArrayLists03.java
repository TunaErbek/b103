package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

//Exaple : Bir list'teki elemanlarin birbirine en yakin olan ikisini bulunuz
        //   [12,19 , 15, 30 , 21] ==>19 ve 21

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);

        Collections.sort(a);

        System.out.println(a);




    }
}
