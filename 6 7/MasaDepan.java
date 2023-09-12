import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MasaDepan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di aplikasi perhitungan tanggal dan waktu!");

        // Mendapatkan tanggal dan waktu saat ini
        Date currentDate = new Date();

        // Menampilkan tanggal dan waktu saat ini dalam format yang sesuai
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Tanggal dan Waktu Saat Ini: " + dateFormat.format(currentDate));

        // Menghitung tanggal setelah ditambahkan 100 hari dari saat ini
        Calendar calendar100 = Calendar.getInstance();
        calendar100.setTime(currentDate);
        calendar100.add(Calendar.DAY_OF_YEAR, 100);
        Date futureDate100 = calendar100.getTime();
        System.out.println("Tanggal dan Waktu Setelah 100 Hari: " + dateFormat.format(futureDate100));

        // Meminta input dari pengguna untuk jumlah hari yang ingin ditambahkan
        int jumlahHari = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Masukkan jumlah hari yang ingin ditambahkan dari  "+ dateFormat.format(currentDate));
                System.out.print("minus jika kembali ke tanggal sebelumnya): ");
                jumlahHari = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Masukkan angka yang valid.");
                scanner.nextLine(); // Membersihkan buffer input
            }
        }

        // Menghitung tanggal setelah ditambahkan hari yang dimasukkan oleh pengguna
        Calendar calendarInput = Calendar.getInstance();
        calendarInput.setTime(currentDate);
        calendarInput.add(Calendar.DAY_OF_YEAR, jumlahHari);
        Date TanggalMasa = calendarInput.getTime();
        System.out.println("Tanggal dan Waktu Setelah " + jumlahHari + " Hari adalah: " + dateFormat.format(TanggalMasa));

        scanner.close();
    }
}
