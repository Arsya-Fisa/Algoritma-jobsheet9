import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        StackTugasMahasiswa01 stack = new StackTugasMahasiswa01(5);
        Scanner scan = new Scanner(System.in);
        int pilih =0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas teratas");
            System.out.println("4. Melihat tugas terbawah");
            System.out.println("5. Melihat daftar Tugas");
            System.out.println("6. Melihat jumlah tugas yang dikumpulkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s telah dikumpulkan.\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa01 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d.\n", dinilai.nama,nilai);
                        String biner = stack.konfersiDesimalkeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa01 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa01 lihatBawah = stack.bottom();
                    if (lihatBawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatBawah.nama);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang dikumpulkan: " + stack.jumlahTugas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6); {
        }
    }
}
