/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

import java.util.Scanner;

/**
 *
 * @author faikar
 */
public class Soal5 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String a1, a2;
        
        a1 = baca.nextLine();
        a2 = baca.nextLine();
        
        System.out.println(a1.length() + a2.length());
        
        if(a1.compareTo(a2) < a2.compareTo(a1)){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        System.out.println(a1.substring(0, 1).toUpperCase() + a1.substring(1) + ""
                + " " + a2.substring(0, 1).toUpperCase() + a2.substring(1));
    }
}