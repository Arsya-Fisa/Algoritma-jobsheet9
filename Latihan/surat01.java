package Latihan;

public class surat01 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisSurat;;
    int durasi;

    public surat01(){}
    public surat01(String idSurat, String namaMahasiswa, String kelas, char jenisSurat, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisSurat = jenisSurat;
        this.durasi = durasi;
    }
    public void tampilkanData() {
        System.out.println("ID Surat: " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jenis Surat(I/S): " + jenisSurat);
        System.out.println("Durasi: " + durasi + " hari");
    }
}
