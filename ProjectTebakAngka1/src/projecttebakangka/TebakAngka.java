/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TebakAngka {
    
    void input(){
        int random, tebakan;
        /** Memilih bilangan bulat random 1-100 **/
        random = (int) (Math.random() * 100);
        System.out.println("Hai! Saya telah memilih sebuah bilangan bulat 1 s/d 100. Silahkan ditebak yap!");
        Scanner data = new Scanner(System.in);
 
        do {
            /** Input data **/
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = data.nextInt();
 
            /** Jika tebakan lebih besar dari yang dipilih **/
            if (tebakan > random) {
                System.out.println("Bilangan tebakan Anda terlalu besar");
                System.out.println("-----");
                /** Jika tebakan lebih kecil dari yang dipilih **/
            } else if (tebakan < random) {
                System.out.println("Bilangan tebakan Anda terlalu kecil");
                System.out.println("-----");
            /** Jika tebakan tidak lebih besar atau lebih kecil dari yang dipilih **/
            } else {
                System.out.println("Selamat! Bilangan tebakan Anda benar");
            }
        } while (tebakan != random);
    }
}