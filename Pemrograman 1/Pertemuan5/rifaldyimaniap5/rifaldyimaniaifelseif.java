import java.util.Scanner;
public class rifaldyimaniaifelseif {
    public static void main (String [] args){
        int nilai = 75;

        if (nilai == 100) {
            System.out.println("Kategori Sempurna!");
        } else if (nilai >= 95){
            System.out.println("Kategori Sangat Memuaskan!");
        } else if (nilai >= 85){
            System.out.println("Kategori Bagus!");
        } else {
            System.out.println(" Maaf Anda Belum Lulus Yaa!");
        }
    }
}
