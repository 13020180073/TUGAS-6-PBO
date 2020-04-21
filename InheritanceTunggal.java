public class InheritanceTunggal{
public static void main(String[] args) {
//Membentuk Objek dari kelas Mobil
InheritanceMobil xenia = new InheritanceMobil("Xenia",6,"Hitam",100);
InheritanceMobil avanza = new InheritanceMobil("Avanza",8,"Putih",150);
//Memenggil Method CetakInfo dari masing-masing objek
xenia.cetakInfo();
avanza.cetakInfo();
}
}