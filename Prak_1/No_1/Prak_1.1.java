/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author rifqy
 */
public class Hewan {
    String nama;
    int jumlahKaki;
    String makan;
    String tipe;

    void name(String namaHewan){
        nama = namaHewan;
    }
    void legs(int kakiHewan){
        jumlahKaki = kakiHewan;
    }
    void food(String makanan){
        makan = makanan;
    }
    void type(String tipeHewan){
        tipe = tipeHewan;
    }
    void Print(){
        System.out.println(
                "Nama Hewan :"+nama+"\n"+
                "Jumlah Kaki:"+kaki+"\n"+
                "Makanan :"+makan+"\n"+
                "Tipe Hewan :"+tipe+"\n"
        );
    }
    
    
    public static void main(String[] args) {
        // TO run the code of the application's logic here
        Hewan hewan = new Hewan();
        
        hewan.name("Chicken");
        hewan.legs(4);
        hewan.food("Seeds");
        hewan.type("Herbivore");
        hewan.Print();
        
        hewan.name("Lion");
        hewan.legs(4);
        hewan.foods("Meats");
        hewan.type("Carnivore");
        hewan.Print();
    
    }
    
}