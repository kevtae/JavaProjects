import java.util.Random;
import java.util.Arrays;


public class TBRace {
    public static int tortoise;
    public static int hare;
    public static int time;
    public static Random rand = new Random();
    public static char[] track = new char[80];
    public static char[] track1 = new char[70];

    public static void tortoiseMove() {
        int move;
        int rand_int = rand.nextInt(10);
        if (rand_int <= 4) {
            move = 3;
        } else if (rand_int == 8 || rand_int == 9) {
            move = -6;
        } else {
            move =  1;
        }
        tortoise = tortoise + move < 0 ? 0 : tortoise + move;
    }

    public static void hareMove() {
        int move;
        int rand_int = rand.nextInt(10);

        if (rand_int <= 1) {
            move = 0;
        }
        else if( rand_int >1 && rand_int <= 3){
            move = 9;
        }
        else if(rand_int == 4){
            move = -12;
        }
        else if(rand_int >4 && rand_int <= 7){
            move = 1;
        }
        else{
            move = 2;
        }
        hare = hare + move < 0 ? 0 : hare + move;
    }

    public static boolean raceWon() {return tortoise>69 || hare >69;}

    public static void winner(){
        time--;
        if (tortoise > 69){
            System.out.println("TORTOISE WINS!!! YAY!!");
        }
        else if(hare>69){
            System.out.println("HARE WINS!!! YAY!!");
        }
        System.out.println("Time elapsed = " + time + "Seconds");
    }

    public static void raceDisplay(){
        Arrays.fill(track, ' ');
        track[tortoise] = 'T';
        track[hare] = 'H';
        String bite = "OUCH";

        if(hare == tortoise){
            if(tortoise == 0) {
                track[tortoise] = 'B';
            }
            else{
                for (int i = hare; i <= bite.length(); i++)
                    track[i] = bite.charAt(i-hare);
            }
        }


        for(char t:track){
            System.out.print(t + " ");
        }

        System.out.print("\n");

        for(char k:track1){
            System.out.print("_ ");
        }

        System.out.println("");

    }

    public static void main(String[] args) {
        tortoise = 0;
        hare = 0;
        time =0;
        System.out.println("ON YOUR MARK, GET SET \nBANG!!!!! \nAnd THEY'RE OFF!!!!!" );
        while (!raceWon()) {
                System.out.print("Time:" + time + "\n");
                raceDisplay();
                hareMove();
                tortoiseMove();
                time ++;
        }
        winner();
    }
}
