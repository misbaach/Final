package Tugas1;

/**
 *
 * @author Misbach
 */
public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(int tunjangan, String nama, int gaji) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int infoGaji() {
        return gaji;
    }

    public int infoTunjangan() {
        return tunjangan;
    }
}
