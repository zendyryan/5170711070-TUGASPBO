package tugaspengganti;

import java.util.Scanner;

public class TugasPengganti {

    public static void main(String[] args) {
        Scanner tupen = new Scanner (System.in);
        Cewek wm = new Cewek();
        Cowok wk = new Cowok();
        int jk;
        
        System.out.println("1. Cowok");
        System.out.println("2. Cewek");
        System.out.println("Masukan jenis Kelamin : ");
        jk = tupen.nextInt();
        
        switch (jk) {
            case 1:
                wk.nm();
                wk.umur();
                wk.tinggi();
                wk.berat();
                wk.rambut();
                System.out.println("Nama : "+wk.n);
                System.out.println("Umur : "+wk.u);
                System.out.println("Warna Rambut : "+wk.r);
                break;
            case 2:
                wm.nm();
                wm.umur();
                wm.tinggi();
                wm.berat();
                System.out.println("Nama : "+wm.n);
                System.out.println("Umur : "+wm.u);
                break;
            default:
                System.out.println("Tidak di ketahui...");
                break;
        }
    }
}
