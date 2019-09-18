/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosen;

/**
 *
 * @author rifqy
 */
public class Dosen {
    String name;
    int nik;
    String education;
    String birth;

    void nama(String namaDosen){
        name = namaDosen;
    }
    void nomorInduk(int nikDosen){
        nik = nikDosen;
    }
    void edu(String Pendidikan){
        education = Pendidikan;
    }
    void lahir(String tanggalLahir){
        birth = tanggalLahir;
    }
    void Print(){
        System.out.println(
                "Nama Dosen :"+name+"\n"+
                "NIK:"+nik+"\n"+
                "Pendidikan :"+education+"\n"+
                "Tanggal Lahir Dosen :"+birth+"\n"
        );
    }
    
    
    public static void main(String[] args) {
        // TO run the code of the application's logic here
        Dosen dosen = new Dosen();
        
        dosen.nama("Rifqy Fauzy");
        dosen.nomorInduk(1029384756);
        dosen.edu("Master");
        dosen.lahir("4 August 2000");
        dosen.Print();
        
    
    }
    
}