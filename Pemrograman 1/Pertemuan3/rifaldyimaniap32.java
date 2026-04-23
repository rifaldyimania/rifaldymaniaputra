import java.util.Scanner;
public class rifaldyimaniap32 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Masukan harga barang: ");
        int harga = input.nextlnt();
        System.out.print("Masukan jumlah beli: ");
        int jumlah = input.nextlnt();
        int total = harga * jumlah;
        double diskon = 0;

        if (total > 100000){
            diskon = total * 0.1;
        }
        double totalBayar = total - diskon;

        System.out.println("\n=== STRUK BELANJA KITA ===");
        System.out.println("Barang: " +namaBarang);
        System.out.println("Total: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);
        input.close();
    }

}
