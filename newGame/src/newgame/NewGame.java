package newgame;

import java.util.Random;

public class NewGame {

    public static void main(String[] args) {
        Game g = new Game();
        Random r = new Random();
        int ran = r.nextInt(g.names.length);
        String str1 = (g.names[ran]);
        System.out.println("name: " + str1);
        boolean[] guessList = new boolean[str1.length()];

        String end = "BITAY";

        do {

            g.displayCurrentWord(str1, guessList);
            if (!g.checkGuess(str1, guessList, g.guess()) && g.life > 0) {
                g.life--;
                if (g.life > 0) {
                    System.out.println("Incorrect guess!! You have " + g.life + " moves left!");
                } else {
                    System.out.println("Game Over!!!");
                }
            }
        } while (g.life > 0);
    }

}
