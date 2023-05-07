
public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13_676;
        int bonusMile = 20;
        int mile = ticketPrice / bonusMile;

        System.out.println("Начислено миль:" + mile);
    }
}