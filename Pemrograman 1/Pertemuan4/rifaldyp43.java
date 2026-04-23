import java.util.Scanner;
public class rifaldyp43 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int usdCurrency; int idrCurrency;
        System.out.print("Hello! Rifaldyimania!\n\n");
        System.out.print("-------Konversi Uang dari USD to IDR-------");
        System.out.print("\n1 USD = Rp. 16.0000\n");
        System.out.print("Masukan Jumlah USD = $");
        usdCurrency = input.nextInt();
        idrCurrency = usdCurrency*16000;
        System.out.print("\n\n-------Hasil Konversi USD To IDR-------");
        System.out.print("\nJumlah USD = $"+usdCurrency+"\n");
        System.out.print("Jumlah IDR = Rp. "+idrCurrency);
    }
}
