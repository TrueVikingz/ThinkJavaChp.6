package com.company;

public class Main {

    public static void main(String[] args) {
	    String ord = "xabcde";
        if (isAbecedarian(ord)) {
            System.out.println("ordet " + ord + " er i abc-rækkefølge.");
        }
        else {
            System.out.println("ordet " + ord + " er ikke i abc-rækkefølge.");
        }
    }
    public static boolean isAbecedarian(String ord) {

    boolean correctRækkefølge = true;
        for (int i = 1; i < ord.length(); i++) {
            if (ord.charAt(i)>=ord.charAt(i-1)) {
            }
            else {
                correctRækkefølge = false;
            }
        }
        return correctRækkefølge;
    }
}
