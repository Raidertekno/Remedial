import java.util.Scanner;


public class MenghitungBangunDatar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        char ulangi;
        double panjang, lebar, sisi, jari_jari, alas, tinggi, luas, keliling;
        final double phi = 3.14159;

        do {
            System.out.println("\t\t=== PROGRAM MENGHITUNG BANGUN DATAR ===");
            System.out.println("Pilih bangun datar:");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Persegi");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.print("Masukkan pilihan (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda akan menghitung Luas dan Keliling Persegi Panjang");
                    panjang = inputPositif(scanner, "Masukkan panjang: ");
                    lebar = inputPositif(scanner, "Masukkan lebar: ");
                    luas = panjang * lebar;
                    keliling = 2 * (panjang + lebar);
                    System.out.printf("Luas Persegi Panjang: %.2f\n", luas);
                    System.out.printf("Keliling Persegi Panjang: %.2f\n", keliling);
                    break;

                case 2:
                    System.out.println("Anda akan menghitung Luas dan Keliling Persegi");
                    sisi = inputPositif(scanner, "Masukkan panjang sisi: ");
                    luas = sisi * sisi;
                    keliling = 4 * sisi;
                    System.out.printf("Luas Persegi: %.2f\n", luas);
                    System.out.printf("Keliling Persegi: %.2f\n", keliling);
                    break;

                case 3:
                    System.out.println("Anda akan menghitung Luas dan Keliling Lingkaran");
                    jari_jari = inputPositif(scanner, "Masukkan jari-jari: ");
                    luas = phi * jari_jari * jari_jari;
                    keliling = 2 * phi * jari_jari;
                    System.out.printf("Luas Lingkaran: %.2f\n", luas);
                    System.out.printf("Keliling Lingkaran: %.2f\n", keliling);
                    break;

                case 4:
                    System.out.println("Anda akan menghitung Luas dan Keliling Segitiga");
                    alas = inputPositif(scanner, "Masukkan alas: ");
                    tinggi = inputPositif(scanner, "Masukkan tinggi: ");
                    luas = 0.5 * alas * tinggi;
                    double sisi1 = inputPositif(scanner, "Masukkan sisi pertama: ");
                    double sisi2 = inputPositif(scanner, "Masukkan sisi kedua: ");
                    double sisi3 = inputPositif(scanner, "Masukkan sisi ketiga: ");
                    keliling = sisi1 + sisi2 + sisi3;
                    System.out.printf("Luas Segitiga: %.2f\n", luas);
                    System.out.printf("Keliling Segitiga: %.2f\n", keliling);
                    break;

                default:
                    System.out.println("Pilihan tidak valid (Masukkan Pilihan 1-4)!!!");
                    break;
            }
            System.out.print("Apakah ingin menghitung lagi bangun datarnya? (Y/N): ");
            ulangi = scanner.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        scanner.close();
    }


    public static double inputPositif(Scanner scanner, String prompt) {
        double nilai;
        do {
            System.out.print(prompt);
            nilai = scanner.nextDouble();
            if (nilai < 0) {
                System.out.println("Inputan tidak boleh kurang dari nol.");
            }
        } while (nilai < 0);
        return nilai;
    }
}