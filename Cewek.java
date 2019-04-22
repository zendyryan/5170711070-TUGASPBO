package tugaspengganti;

public class Cewek extends Manusia{

    String nm,umur,n;
    int u,t,b;
    @Override
    void nm(){
        System.out.print("Nama : ");
        n = human.next();
    }
    @Override
    protected void umur (){
        System.out.print("Umur : ");
        u = human.nextInt();
    }
    void tinggi(){
        System.out.print("Tinggi Badan : ");
        t = human.nextInt();
    }
    protected void berat (){
        System.out.print("Berat Badan : ");
        b = human.nextInt();
    }
}
