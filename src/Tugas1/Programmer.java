package Tugas1;

/**
 *
 * @author Misbach
 */
public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(int bonus, String nama, int gaji) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int infoGaji() {
        return gaji;
    }

    public int infoBonus() {
        return bonus;
    }
}
