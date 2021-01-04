package collection;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        // arraylist declaration

        ArrayList<Integer> list = new ArrayList<Integer>(); // array list with object


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        int a = 10;


        System.out.println(list.size());

        // iteration the list using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(1);

        for (Integer data : list) {
            System.out.println(data);
        }

        }


    }
