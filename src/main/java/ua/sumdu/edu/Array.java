package ua.sumdu.edu;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7};
        sayHello ();
        System.out.println(Arrays.toString(mas));
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

    }

    public static void sayHello () {
        System.out.println("Hi!");
    }
}
