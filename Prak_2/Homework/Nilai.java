/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

/**
 *
 * @author L200184090
 */
public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    
    public void scores(int UTS, int UAS, int Tugas){
        this.nilaiUTS = UTS;
        this.nilaiUAS = UAS;
        this.nilaiTugas = Tugas;
    }
    
    public void info(){
        System.out.println("Nilai UTS adalah "+nilaiUTS+"\n" +
                "Nilai UAS adalah "+nilaiUAS+"\n" +
                "Nilai Tugas adalah "+nilaiTugas+"\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai akhir = new Nilai();
        akhir.scores(70,65,85);
        akhir.info();
    }
    
}
