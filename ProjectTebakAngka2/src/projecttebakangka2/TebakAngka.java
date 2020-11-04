/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TebakAngka {
    void input(){
        int random, tebakan, score, jumlah;
        /** Memilih bilangan bulat random 1-100 **/
        random = (int) (Math.random() * 100);
        System.out.println("Hai! Saya telah memilih sebuah bilangan bulat 1 s/d 100. Silahkan ditebak yap!");
        Scanner data = new Scanner(System.in);
        /** Score awal 100 **/
        score = 100;
        jumlah = 0;
 
        do {
            /** Untuk menghitung jumlah berapa kali tebakan sampai benar **/
            jumlah++;
            /** Input data **/
            System.out.print("Masukkan bilangan tebakan Anda: ");
            tebakan = data.nextInt();
 
            /** Jika tebakan lebih besar dari yang dipilih **/
            if (tebakan > random) {
                System.out.println("Bilangan tebakan Anda terlalu besar");
                System.out.println("-----");
                /** Mengurangi 2 score **/
                score -= 2;
            /** Jika tebakan lebih kecil dari yang dipilih **/
            } else if (tebakan < random) {
                System.out.println("Bilangan tebakan Anda terlalu kecil");
                System.out.println("-----");
                /** Mengurangi 2 score **/
                score -= 2;
            /** Jika tebakan tidak lebih besar atau lebih kecil dari yang dipilih **/
            } else {
                System.out.println("Selamat! Bilangan tebakan Anda benar");
                System.out.println("-----");
                System.out.println("Score Anda: " + score);
                if (jumlah < 6) {
                    /** Menambah 50 score **/
                    score += 50;
                    System.out.println("Bonus: 50");
                    System.out.println("Total score: " + score);
                }
            }
        } while (tebakan != random);
    }
}