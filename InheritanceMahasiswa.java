public class InheritanceMahasiswa extends InheritancePerson{
    private String nim;
    private String jurusan;

    public InheritanceMahasiswa() {
    }

    public InheritanceMahasiswa(String nim, String nama,String jurusan, String alamat) {
        this.nim = nim;
        this.jurusan = jurusan;
        super.nama = nama;
        super.alamat =  alamat;
    }
    public static void main(String [] args){
        InheritanceMahasiswa mhs = new InheritanceMahasiswa();
        System.out.println("Nim = "+mhs.nim);
        System.out.println("Nama = "+mhs.nama);
        System.out.println("Jurusan = "+mhs.jurusan);
        System.out.println("Alamat = "+mhs.alamat);

        InheritanceMahasiswa mahasiswa1 = new InheritanceMahasiswa ("13020180073","Viranti Ramadina","Teknik Informatika","Palopo");
        System.out.println("Nim = "+mahasiswa1.nim);
        System.out.println("Nama = "+mahasiswa1.nama);
        System.out.println("Jurusan = "+mahasiswa1.jurusan);
        System.out.println("Alamat = "+mahasiswa1.alamat);
    }
}