package com.Klasa3p.gra;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj na losowaniu 6 liczb");
        gra gra1 = new gra();
        gra1.zagraj(4);
        gra1.zagraj(10);
        gra gra2 = new gra();
        gra2.zagraj(3);
    }
}