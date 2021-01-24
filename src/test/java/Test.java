import com.domain.Rider;
import com.domain.Horse;
import com.domain.Stable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    Rider paul ;
    Rider pierre;
    Rider jacques;

     Horse horse1;
     Horse horse2;
     Horse horse3;
     Horse horse4;
     Horse horse5;

     List<Horse> horses;


    @BeforeEach
    public void setup() {
        paul =  new Rider(1,"Paul");
        pierre = new Rider(2,"Pierre");
        jacques = new Rider(3,"Jacques");

        horse1 = new Horse(1,"Jolly",30,paul,'M');
        horse2 = new Horse(2,"Gaby",18,pierre,'F');
        horse3 = new Horse(3,"Henry",10,jacques,'M');
        horse4 = new Horse(4,"Elodie",2,pierre,'F');
        horse5 = new Horse(5,"Carla",5,paul,'F');

        horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        horses.add(horse4);
        horses.add(horse5);

    }

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
    void TestListFemaleHorses_GabyElodieCarla() {


            /*
liste les chevaux feminins : gaby, elodie, carla
         */


        Assertions.assertEquals("Gaby", horses.get(1).getHorseName());
        Assertions.assertEquals("Elodie", horses.get(3).getHorseName());
        Assertions.assertEquals("Carla", horses.get(4).getHorseName());


        List<Horse> femaleHorses = new ArrayList<>();
        femaleHorses.add(horse2);
        femaleHorses.add(horse4);
        femaleHorses.add(horse5);


        Stream<Horse> stream = horses.stream().filter(element -> element.getGender() == 'F');
        Assertions.assertEquals(stream.collect(Collectors.toList()), femaleHorses);

    }

    @org.junit.jupiter.api.Test
    void testListHorsesLessThan10YearsOldStrictly_ElodieCarla() {

        /*liste les chevaux qui ont moins de 10 ans strictement : elodie, carla*/

        List<Horse> horseInf10ListStreamed = horses
                .stream()
                .filter(horse -> horse.getAge() < 10).collect(Collectors.toList());

        List<Horse> horseInf10List = new ArrayList<>();
        horseInf10List.add(horse4);
        horseInf10List.add(horse5);

        Assertions.assertEquals(horseInf10List, horseInf10ListStreamed);
    }

    @org.junit.jupiter.api.Test
    void testListHorseWhoseRiderIsPierre_GabyElodie() {

        /*liste les chevaux donc le cavalier est pierre : gaby, elodie*/

        List<Horse> horseRiderPierreStreamed =
                horses
                        .stream()
                        .filter(horse->horse.getRider().getfirstName().equals("Pierre")).collect(Collectors.toList());
        List<Horse> horseRiderPierre = new ArrayList<>();
        horseRiderPierre.add(horse2);
        horseRiderPierre.add(horse4);

        Assertions.assertEquals(horseRiderPierre, horseRiderPierreStreamed);


    }

    @org.junit.jupiter.api.Test
    void testListHorsesWhoseRiderIsPaulAndNameStartsWithJ_Jolly() {

        /*liste les chevaux dont le cavalier est paul et dont le nom commence par "j" : jolly*/

        List<Horse> horseRiderPaulNameJ = horses
                .stream()
                .filter(horse->horse.getRider().getfirstName().equals("Paul")
                        && horse.getHorseName().charAt(0)=='J').collect(Collectors.toList());

        List<Horse> expected = new ArrayList<>();
        expected.add(horse1);

        Assertions.assertEquals(expected,horseRiderPaulNameJ);

    }

    @org.junit.jupiter.api.Test
    void testListHorsesWhoseRiderIsNeitherPaulNorPierre_Henry() {

        /*Liste les chevaux dont le cavalier n'est ni Paul ni Pierre, cad henry*/

        List<Horse> horseRiderNeitherPaulNorPierre = horses
                .stream()
                .filter(horse -> !(horse.getRider().getfirstName().equals("Pierre")
                        ||horse.getRider().getfirstName().equals("Paul"))).collect(Collectors.toList());
        List<Horse> horse3List = new ArrayList<>();
        horse3List.add(horse3);
        Assertions.assertEquals(horse3List,horseRiderNeitherPaulNorPierre);

    }


    }


