package com.Klasa3p.gra;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("losowanie 6 liczb");
        gra gra1 = new gra();
        gra1.losu(6);
        gra1.wpisane(8);
        gra1.trafianie(gra1.liczby);
    }
}