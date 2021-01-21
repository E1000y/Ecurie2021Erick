import com.domain.Cavalier;
import com.domain.Horse;
import com.domain.Stable;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        Assertions.assertEquals(stable.containsHorse(horse),true);
    }

    @org.junit.jupiter.api.Test
    void testListHorsesAndLambdas() {
        /*
liste les chevaux feminins : gaby, elodie, carla
liste les chevaux qui ont moins de 10 ans strictement : elodie, carla
liste les chevaux donc le cavalier est pierre : gaby, elodie
liste les chevaux dont le cavalier est paul et dont le nom commence par "j" : jolly
liste les chevaux dont dont le cavalier n'est ni paul, ni pierre : henry

si t'arrives à faire ça t'auras fait un pas sur l'apprentissage des listes et des lambdas

chaque exemple c'est un test a part entier

         */

        Cavalier paul = new Cavalier(1,"Paul");
        Cavalier pierre = new Cavalier (2,"Pierre");
        Cavalier jacques = new Cavalier(3,"Jacques");

        Horse horse1 = new Horse(1,"Jolly",30,paul,'M');
        Horse horse2 = new Horse(2,"Gaby",18,pierre,'F');
        Horse horse3 = new Horse(3,"Henry",10,jacques,'M');
        Horse horse4 = new Horse(4,"Elodie",2,pierre,'F');
        Horse horse5 = new Horse(5,"Carla",5,paul,'F');

        List<Horse> horses = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        horses.add(horse4);
        horses.add(horse5);


        Assertions.assertEquals("Gaby",horses.get(1).getHorseName());
        Assertions.assertEquals("Elodie",horses.get(3).getHorseName());
        Assertions.assertEquals("Carla",horses.get(4).getHorseName());


        List<Horse> femaleHorses = new ArrayList<>();
        femaleHorses.add(horse2);
        femaleHorses.add(horse4);
        femaleHorses.add(horse5);

        Stream<Horse> stream = horses.stream().filter(element -> element.getGender() == 'F');

        Assertions.assertEquals(stream.collect(Collectors.toList()), femaleHorses);



    }
}
