package com.try_block;

public class Demo2 {

    int r = 10;
    int q = 30;

    public static void main(String[] args) {

        try {
            int r = 5 / 0;
            System.out.println("r ");
        } catch (Exception e) {
            System.out.println(e);
            try {
                int q = 20 / 0;
                System.out.println("20 is values that q");
            } catch (Exception e1) {

            }
        } finally {
            System.out.println("This is the Finall exde");
        }
    }
}


