package com.arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){
      //  Integer | Float | String | Boolean
        ArrayList<Integer> list =new ArrayList<>();//define arraylist of Integers
      //  ArrayList<String> list2=new ArrayList<String>();//arraylist of String

        //add elememts into list
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list); //print the added list

        //get elements from list
        int element=list.get(1); //store element in element variable
        System.out.println(element);

        //add element in between
        list.add(1,1); //add element 1 at index 1
        System.out.println(list);

        //set element
        list.set(0,5);//change element at index 0
        System.out.println(list);

        //delete element from list
        list.remove(3); //delete element at index 3
        System.out.println(list);

        //size of arraylist
        int size=list.size(); //find the size of the arraylist
        System.out.println(size);

        //loops in arraylist
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));//print elements from list one by one

        }
        System.out.println();

        //sorting in arraylist
        Collections.sort(list);//sort list in ascending order
        System.out.println(list);



    }
}
