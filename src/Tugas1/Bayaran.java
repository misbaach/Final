package Tugas1;

/**
 *
 * @author Misbach
 */
public class Bayaran {
    public int hitungbayaran(Pegawai peg){
        int uang = peg.infoGaji();    
        if (peg instanceof Manajer)
            uang += ((Manajer) peg).infoTunjangan();
        else if (peg instanceof Programmer)
            uang += ((Programmer) peg).infoBonus();
        return uang;
    }

    public static void main(String args[]){ 
        Manajer man = new Manajer(800, "Agus", 50);
        Programmer prog = new Programmer(600,"Budi", 30);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran untuk Manajer : " +
            hr.hitungbayaran(man));
        System.out.println("Bayaran untuk Programmer : " +
            hr.hitungbayaran(prog));
    }
}  