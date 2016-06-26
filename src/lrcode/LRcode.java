/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrcode;

import java.util.Scanner;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author landryk
 */
public class LRcode {    
   /* public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Veuillez saisir la phrase a coder");
    String str = sc.nextLine();
    int taille = str.length();
    int tab[] = new int[taille];
    code(str,tab);
    }
*/
    static void code(String str,int[] tab){
        int taille = str.length(),i=0,a=(int)'a';
        for(i = 0; i<taille;i++){
            tab[i] = (int)str.charAt(i)-a+1;
            if(tab[i] == -64)
                tab[i] = 0;
            System.out.println(tab[i]);
        }
    }

    
}
