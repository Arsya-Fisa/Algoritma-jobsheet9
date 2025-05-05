public class Mahasiswa01 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa01(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
    
}