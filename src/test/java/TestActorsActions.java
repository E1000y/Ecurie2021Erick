import com.domain.Horse;
import com.domain.Stable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestActorsActions {

    Horse horse;
    Stable stable;

    @BeforeEach
    public void setup(){
        horse = new Horse(1,"Jolly Jumper");
        stable = new Stable(1,"GAEC des liserons");

    }


    @org.junit.jupiter.api.Test
    void TestStableManagerAddsAHorseInStable() {

        stable.addHorse(horse);
        Assertions.assertEquals(stable.containsHorse(horse),true);
    }


    @org.junit.jupiter.api.Test
    void TestStableManagerTakesAHorseOffTheStable() {






    }
}
