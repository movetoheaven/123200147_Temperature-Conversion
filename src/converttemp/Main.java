/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tempcel;
        int repeat =0;
        
        
        
        System.out.println("+--------------------------------------+");
        System.out.println("| WATER TEMPERATURE CONVERSION PROGRAM |");
        System.out.println("+--------------------------------------+");
        System.out.println("Data Entry");
        System.out.println("-----------");
        System.out.print("Temperature in Celcius  : ");
        tempcel = input.nextFloat();
        do{
            conversion fromcelcius = new conversion(tempcel);
            System.out.println("Option");
            System.out.println("----");
            System.out.println("1. View Conversion Data");
            System.out.println("2. Edit Conversion Data");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            repeat = input.nextInt();
            
            
            if (repeat == 1) {
                System.out.println("Temperature in Celcius : " + tempcel + "°C");
                System.out.println("In Fahrenheit : " + fromcelcius.fahrenheit()+"°F");
                System.out.println("In Reamur : " + fromcelcius.reamur()+"°R");
                System.out.println("In Kelvin : " + fromcelcius.kelvin()+"K");
                System.out.println(fromcelcius.watercondition());
            }
            
            else if (repeat == 2) {
                System.out.println("Data Entry");
            System.out.println("-----------");
            System.out.print("Temperature in Celcius  : ");
            tempcel = input.nextFloat();
            
            
            } else if (repeat != 3) {
                System.out.println("Option does not exist. Please enter the options correctly");
            }
            
        }while(repeat != 3);
    }
    
}
