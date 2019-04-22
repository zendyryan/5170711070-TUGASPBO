package tugaspengganti;

import java.util.Scanner;

public class Manusia {
    Scanner human = new Scanner (System.in);
    void nm(){
        System.out.print("Nama : ");
        String n = human.next();
    }
    protected void umur (){
        System.out.print("Umur : ");
        int b = human.nextInt();
    }
 }
