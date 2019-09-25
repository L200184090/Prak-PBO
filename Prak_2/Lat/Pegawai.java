/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

/**
 *
 * @author L200184090
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    public void biodata(String name, int num, double salary){
        this.nama = name;
        this.nip = num;
        this.gaji = salary;
    }
    public void info(){
        System.out.println("Nama Pegawai: "+nama+ "\n" +
                "Nomor Induk Pegawai: "+nip+ "\n" +
                "Gaji Pegawai: "+gaji);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai p1 = new Pegawai();
        p1.biodata("M. Rifqy Fauzy", 200184090, 3500000);
        p1.info();
    }
    
}
