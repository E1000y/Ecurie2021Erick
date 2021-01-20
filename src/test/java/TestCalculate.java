import com.domain.InterfaceFonctionnelle1;
import com.domain.InterfaceFonctionnelle2;
import com.domain.Launcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculate{
    @Test
    void testresultoftwoPlusThreeAndTwoMultiplybyThree() {

       Launcher launcher = new Launcher();
        InterfaceFonctionnelle1 add = (int x, int y)->x+y;
        InterfaceFonctionnelle1 multiply = (int x, int y) ->x*y;

        int resultAdd = launcher.operate(2,3,add);
        int resultMultiply = launcher.operate(2,3,multiply);

        Assertions.assertEquals(resultAdd,5);
        Assertions.assertEquals(resultMultiply,6);
        
    }

    @Test
    void testResultSayHelloWorld() {



        InterfaceFonctionnelle2 helloworld = (message)->"Hello"+message;

        Assertions.assertEquals(helloworld.sayMessage("World"),"HelloWorld");
    }
}
