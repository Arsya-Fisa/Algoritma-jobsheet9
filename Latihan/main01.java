package Latihan;
import java.util.Scanner;
public class main01 {
    public static void main(String[] args) {
        Stacksurat01 stack = new Stacksurat01(5);
        Scanner scan = new Scanner(System.in);
        int pilih = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. proses Surat Izin");
            System.out.println("3. Lihat suarat izin terakhir");
            System.out.println("4. cari surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Surat(I/S): ");
                    char jenisSurat = scan.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    surat01 suratBaru = new surat01(idSurat, namaMahasiswa, kelas, jenisSurat, durasi);
                    stack.push(suratBaru);
                    break;
                case 2:
                    surat01 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat diproses");
                        diproses.tampilkanData();
                    }
                    break;
                case 3:
                    surat01 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        terakhir.tampilkanData();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa untuk mencari surat: ");
                    String namaCari = scan.nextLine();
                    stack.cariSurat(namaCari);
                    break;
                
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                
    }
} while (pilih != 0);
        
} 
}
