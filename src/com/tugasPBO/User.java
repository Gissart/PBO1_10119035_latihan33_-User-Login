package com.tugasPBO;
/* Nama     : Argya Aulia Fauzandika
   NIM      : 10119035
   Kelas    : PBO1 / IF-1
   Deskripsi: program login username dan password
* */

public class User {
    private static final String username = "Argya";
    private static final String password = "greatgyas";
    private boolean statusAkun = true;

    private boolean cekAkun(String UserName, String password){
        if(username.equals(UserName)){
            return false;
        }else{
            return true;
        }
    }

    private void hasilLogin(boolean status, String UserName){
        String hasil = status?  "oops, username atau password anda salah"
                : "**** Hello " + UserName + " **** \n Selamat datang di Aplikasi ini";
        System.out.println(hasil);
    }

    public void pengecekanLogin(String UserName, String Password){
        User user = new User();
        statusAkun = cekAkun(UserName,Password);
        user.hasilLogin(statusAkun,UserName);
    }


}
