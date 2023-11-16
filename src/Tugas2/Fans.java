package Tugas2;

/**
 *
 * @author Misbach
 */
public class Fans {
    private String name;

    public Fans() {
        this.name = "noname";
    }

    public Fans(String name) {
        this.name = name;
    }
    
    public void showName(){
        System.out.print(name+": ");
    }

    public void watchingPerformance() {
        showName();
        System.out.println("melihat idolanya dari youtube");
    }

    public void watchingPerformance(Musician musician) {
        showName();
        System.out.print("melihat idolanya");
        musician.perform();
    }
}