/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package initials;
import java.util.*;
/**
 *
 * @author CHENBEIXUAN
 */
public class Initials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String [] names = new String[3];                  
        String [] name_combination = new String[6];       
        System.out.println("Enter three first names:");
        for (int i = 0; i < 3; i++) {
            names[i] = in.nextLine();                    
        }
        int x = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j)
                    continue;
                name_combination[x] = names[i] + " " +names[j];
                x++;
            }
        }
        System.out.println("Possible names are: ");    
        for(int i = 0; i < 6; i++)
            System.out.println((i+1) + " - "+name_combination[i]);
        System.out.print("Enter 1-6 to select a name: ");
        int choice = in.nextInt();                        
        String []initials = name_combination[choice-1].split(" ");  
        String username = initials[0].toLowerCase() + "_" +initials[1].toLowerCase();   
       
        System.out.println("The initials for " + name_combination[choice-1]+" is: " + initials[0].charAt(0)+initials[1].charAt(0));
        System.out.println("Suggested username: " + username);
    }
}
  