package com.deepak.aiml;

import java.util.ArrayList;

public class rough {
    public static void main(String[] args){
        // Exception
        /*try{
            int [] array = {3,4,5,6,7};
            System.out.println(array[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Access the correct index");
        }
        finally {
            System.out.println("Exception Handled");
        }

         */

        // Collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(11);
        System.out.println(list);


    }
}
