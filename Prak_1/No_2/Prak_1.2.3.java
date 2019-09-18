public class Mahasiswa {
    String name;
    int semester;
    String nim;
    String address;

    void nama(String namaMahasiswa){
        name = namaMahasiswa;
    }
    void semester(int semesterMahasiswa){
        semester = semesterMahasiswa;
    }
    void nim(String Pendidikan){
        nim = Pendidikan;
    }
    void alamat(String alamatRumah){
        address = alamatRumah;
    }
    void Print(){
        System.out.println(
                "Nama Mahasiswa :"+name+"\n"+
                "Semester :"+semester+"\n"+
                "NIM :"+nim+"\n"+
                "Alamat Rumah Mahasiswa :"+address+"\n"
        );
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.nama("M. Rifqy Fauzy");
        mahasiswa.semester(3);
        mahasiswa.nim("L200184090");
        mahasiswa.alamat("Surakarta");
        mahasiswa.Print();
        
    
    }
}