import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculate {

    @Test
    void TestAddMultiplyTwoNumbers() {

        Assertions.assertEquals(add(2,3),5);
        Assertions.assertEquals(mutliply(2,3),6);
    }
}
