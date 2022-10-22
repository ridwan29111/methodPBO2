import java.util.Scanner;

public class penggajian1 {
    public static void main(String[] args) {
        tetap t = new tetap();
        tidak_tetap tt = new tidak_tetap();
        int lanjut;
        int pilihan;
        System.out.println("+-----------------------------+");
        System.out.println("| Tugas Pemrograman Berorientasi Objeck");
        System.out.println("           Ganjil|Gaji Pegawai        ");
        do {
            Scanner AA = new Scanner(System.in);
            System.out.println("[1] Pegawai Tetap");
            System.out.println("[2] Pegawai Tidak Tetap");
            System.out.println("[3] Exit");
            System.out.println("PILIH MENU>");
            pilihan = AA.nextInt();

            if (pilihan == 1) {
                t.input1();
                t.cetak1();
            } else if (pilihan == 2) {
                tt.input2();
                tt.cetak2();
            } else if (pilihan == 3) {
                System.exit(0);
            } else {
                System.out.println("Data Tidak Ada");
            }
            System.out.println("Lanjutkan ? YA(1)/ Tidak(2) = ");
            lanjut = AA.nextInt();
            System.out.println("");
        } 
        while (lanjut == 1);
        System.out.println("TERIMA KASIH");
    }
}

class Pegawai {
    String NIP, Nama;

    public void input() {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Nama\t: ");
        Nama = a.nextLine();
        System.out.print("Masukkan NIP\t: ");
        NIP = a.nextLine();
    }

    public void cetak() {
        System.out.println("Nama\t: " + Nama);
        System.out.println("NIP\t: " + NIP);
    }
}

class tetap extends Pegawai {
    char Gol;
    int J_masuk, Gj_pokok, U_transp, total_gaji;

    public void input1() {
        input();
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("========================");

        System.out.println("Keterangan Golongan = ");
        System.out.println("A\t : Staff");
        System.out.println("B\t : Kepala Bagian");
        System.out.println("C\t : CEO");
        System.out.println("========================");

        System.out.print("Masukkan Golongan = ");
        Gol = b.nextLine().charAt(0);

        System.out.println("Massukan Jam Masuk = ");
        J_masuk = c.nextInt();
    }

    public void cetak1() {
        cetak();
        if (Gol == 'A') {
            Gj_pokok = 3000000;
            U_transp = 30000;
        } else if (Gol == 'B') {
            Gj_pokok = 5000000;
            U_transp = 50000;
        } else if (Gol == 'C') {
            Gj_pokok = 10000000;
            U_transp = 100000;
        } else {
            System.out.println("Tidak Ada");
        }
        total_gaji = Gj_pokok + (J_masuk * U_transp);
        System.out.println("Total Gaji = " + total_gaji);
    }

}

class tidak_tetap extends Pegawai {
    int jml_hadir;
    int gaji = 150000;

    public void input2() {
        input();
        Scanner a = new Scanner(System.in);
        System.out.println("Masukka Jumlah Hadir = ");
        jml_hadir = a.nextInt();
    }

    public void cetak2() {
        int total_gaji2;
        cetak();
        total_gaji2 = jml_hadir * gaji;
        System.out.println("Total Gaji = " + total_gaji2);
    }
}
