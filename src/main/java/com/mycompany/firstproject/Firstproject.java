/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproject;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Firstproject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name;
        String surname;
        
        System.out.print("Please enter name:");
        name = sc.next();
        
        System.out.print("please enter surname:");
        surname = sc.next();
        
        System.out.println("name:"+ name);
        System.out.println("surname:" +surname);
      
    }
}
