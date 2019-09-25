/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable;

/**
 *
 * @author L200184090
 */
public class LocalVariable {

    public void hitungUsia(){
        int usia = 0; //local variable
        int tahunSekarang = 2019;
        int tahunLahir = 1993;
    
        usia = tahunSekarang - tahunLahir;
        System.out.println("Usia sekarang adalah "+usia);
    }
    
    public void beratBadan(){
        int beratLahir = 3;
        int beratBadan;
        
        beratBadan = beratLahir + (usia/2);
        //variable usia tidak bisa dipanggil dari method beratBadan karena variable tersebut berada di method yang berbeda, dan bukan termasuk constructor dari class LocalVariable.
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
    }
    
}
