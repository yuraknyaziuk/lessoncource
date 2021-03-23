package com.company;

public class Main {

    public static void main(String[] args) {
        /* Вывести числа от 7 до 1 с помощью цикла for
        Создать и проинициализировать массив из 10 любых чисел. Вывести все элементы массива на экран с помощью цикла while
        Написать алгоритм для вывода последовательности Фибоначчи с помощью цикла до 100
        */
        String text = "First task";
        System.out.println(text);

        int res = 0;
        for (int i = 7; i > 0; --i){
            res = i;
            //System.out.println(res);
            System.out.print(res + " ");
        }
        System.out.println(" ");
        String text1 = "Second task";
        System.out.println(text1);
        int [] massiv = new int [10]; //или int [] massiv = { 12, 1, 2, 13, 3, 14, 4, 15, 5, 16 }
        massiv [0] = 12;
        massiv [1] = 1;
        massiv [2] = 2;
        massiv [3] = 13;
        massiv [4] = 3;
        massiv [5] = 14;
        massiv [6] = 4;
        massiv [7] = 15;
        massiv [8] = 5;
        massiv [9] = 16;
        int i = 0;
        while ( i < massiv.length ){
           res = massiv [i];
            i++;
            //System.out.println(res);
            System.out.print(res + " ");
        }
        System.out.println(" ");
        text1 = "The third task";
        System.out.println(text1);


        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int h = 3; h <= 100; h++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();

    }
}
