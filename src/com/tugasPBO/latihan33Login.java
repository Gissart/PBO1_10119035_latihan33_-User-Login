package com.tugasPBO;
import com.tugasPBO.User;
import java.util.Scanner;

/* Nama     : Argya Aulia Fauzandika
   NIM      : 10119035
   Kelas    : PBO1 / IF-1
   Deskripsi: program login username dan password
* */

public class latihan33Login {
    static Scanner scan = new Scanner(System.in);
    private static final String usName = "Argya";
    private static final String passWord = "greatgyas";


    public static void main(String[] args){
        User obj = new User();
        System.out.print("Masukkan username : ");
        String s_user = scan.next();
        System.out.print("Masukkan password : ");
        String s_pass = scan.next();
        obj.pengecekanLogin(s_user, s_pass);
    }
}
