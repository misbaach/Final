package Tugas2;

/**
 *
 * @author Misbach
 */
public class KpopFans extends Fans {
    
    public KpopFans(){
        super();
    }
    
    public KpopFans(String name) {
        super(name);
    }

    public void watchingPerformance(Musician musician, String expression) {
        showName();
        System.out.print(expression + " melihat idolanya");
        musician.perform();
        if (musician instanceof Singer) {
            System.out.println(" ");
        } else if (musician instanceof Kpop) {
            System.out.println(" dengan bernyanyi dan ngedance");
        }
    }
}