/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul11;

/**
 *
 * @author LABRPL-23
 */
public class NestedClass {

    String nama = "M. Rifqy Fauzy";
    String nim = "L200184090";
    
    public void printNama() {
        System.out.println(nama+" : "+nim);
    }
    
    static class StaticNestedClass {
        static String jurusan = "Informatika";
    }
    
    class InnerClass{
        public String getJurusan(){
            return StaticNestedClass.jurusan;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NestedClass nested1 = new NestedClass();
        nested1.printNama();
        NestedClass.InnerClass inner1 = nested1.new InnerClass();
        System.out.println(inner1.getJurusan());
    }
    
}
