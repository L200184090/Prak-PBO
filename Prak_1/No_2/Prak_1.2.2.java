public class Karyawan {
    String name;
    double salary;
    String position;
    String address;

    void nama(String namaKaryawan){
        name = namaKaryawan;
    }
    void gaji(int gajiKaryawan){
        salary = gajiKaryawan;
    }
    void jabatan(String JabatanKaryawan){
        position = JabatanKaryawan;
    }
    void alamat(String alamatRumah){
        address = alamatRumah;
    }
    void Print(){
        System.out.println(
                "Nama Karyawan :"+name+"\n"+
                "Gaji Bulanan:"+salary+"\n"+
                "Jabatan/Posisi :"+position+"\n"+
                "Alamat Karyawan :"+address+"\n"
        );
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan karyawan = new Karyawan();
        
        karyawan.nama("Rifqy Fauzy");
        karyawan.gaji(12000000);
        karyawan.jabatan("HRD");
        karyawan.alamat("Surakarta");
        karyawan.Print();
        
    
    }
    
}