package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[100];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        try {
            result = arr[(int) (Math.random() * 100)] / arr[(int) (Math.random() * 200)];
        }
        catch (ArithmeticException ex) {
            try {
                result = arr[(int) (Math.random() * 100)] / arr[(int) (Math.random() * 200)];
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(result);
    }
}
