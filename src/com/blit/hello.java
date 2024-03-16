package com.blit;


public class hello {
    public static void main(String[] args) {

        int n = 20;

        int j = 20;


        for (int i = 1; i <= n; i++) {

            --j;
            System.out.println("j value : " + j);
            System.out.println("i value : " + i);
        }
        details();

    }

    public static void details() {

        String r = String.valueOf(Math.random());

        System.out.println(r);
    }


}



