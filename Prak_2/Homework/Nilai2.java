/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai2;
    
/**
 *
 * @author L200184090
 */
public class Nilai2 {
    double nilaiUTS;
    double nilaiUAS;
    double nilaiTugas;
    double nilaiTotal;
    
    public void scores(double UTS, double UAS, double Tugas){
        this.nilaiUTS = UTS;
        this.nilaiUAS = UAS;
        this.nilaiTugas = Tugas;
        this.nilaiTotal = (this.nilaiUTS+this.nilaiUAS+this.nilaiTugas)/3;
    }
     public void info(){
        System.out.println("Total Nilai anda adalah"+nilaiTotal);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai2 akhir = new Nilai2();
        akhir.scores(70,65,85);
        akhir.info();
    }
    
}
