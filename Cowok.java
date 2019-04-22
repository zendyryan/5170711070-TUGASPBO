package tugaspengganti;

public class Cowok extends Manusia{

    String nm,umur,rambut,n,r;
    int u,t,b;
    @Override
    void nm(){
        System.out.print("Nama : ");
        n = human.next();
    }
    @Override
    protected void umur (){
        System.out.print("Umur : ");
        b = human.nextInt();
    }
    void tinggi(){
        System.out.print("Tinggi Badan : ");
        t = human.nextInt();
    }
    protected void berat (){
        System.out.print("Berat Badan : ");
        b = human.nextInt();
    }
    void rambut(){
        System.out.print("Warna Rambut : ");
        r = human.next();
    }
}
