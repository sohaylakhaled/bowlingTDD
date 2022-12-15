import org.example.Game;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class test {
    Game game;
    @Test
    void playerWins() {
  /// assertEquals(1,1);
         game = new Game();
        game.roll(0);
        assertEquals(0,game.score());
    }
    @Test
    void openFrameAddPins() {
         game = new Game();
        game.roll(2);
        game.roll(4);
        assertEquals(6,game.score());
    }
    @Test

    void spareAddNextBall() {
        game = new Game();
        game.roll(4);
        game.roll(6);
        game.roll(3);
        game.roll(0);
        assertEquals(16,game.score());
//        game.roll(10);
//        game.roll(3);
//        game.roll(2);
//        assertEquals(20,game.score());

    }
    @Test
    void perfectGameScoreIs300() {
        game= new Game();
      for (int i=0;i<12;i++)
          game.roll(10);
      assertEquals(300,game.score());
    }

}
