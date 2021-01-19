import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    void TestThatFails() {
        Assertions.assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void TestStableManagerAddsAHorseInStable() {

        Horse horse = new Horse(1,"Jolly Jumper");
        Stable stable = new Stable(1,"GAEC des liserons");
        stable.addHorse(horse);
        Assertions.assertEquals(stable.containsHorse(horse.getname()),"Jolly Jumper");
    }
}
