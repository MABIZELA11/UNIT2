/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sales_tax;

import java.util.Scanner;

/**
 *
 * @author USSER1
 */
public class Sales_tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      final double TAX_RATE =0.55;
    double price;
    double tax;
    double total;
    
    Scanner keyboard = new Scanner(System.in);
    
   
    System.out.print("Item description: ");
        String Item = keyboard.nextLine();
       
    System.out.print("Item price: $");
    price = keyboard.nextDouble();
    
    //calculations 
    tax = price + TAX_RATE;
    total = price * TAX_RATE;
    //display results
    System.out.print(Item + "$");
    System.out.print(price);
    System.out.print("Tax $");
    System.out.print(tax);
    System.out.print("Total $");
    System.out.println(total);
    }
    
}
