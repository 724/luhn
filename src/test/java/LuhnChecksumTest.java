import io.github.the724.LuhnChecksum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class LuhnChecksumTest {

    @Test
    public void nullInputEvaluatesToFalseTest() {
        Assert.assertFalse(LuhnChecksum.evaluate(null));
    }

    @Test
    public void notNullInputWithNonDigitCharactersEvaluatesToFalseTest() {
        Assert.assertFalse(LuhnChecksum.evaluate("234234aav"));
    }

    @Test
    public void notNullAllDigitWrongInputEvaluatesToFalse() {
        Assert.assertFalse(LuhnChecksum.evaluate("6219861036745479"));
    }

    @Test
    public void correctInputEvaluatesToTrueTest() {
        Assert.assertTrue(LuhnChecksum.evaluate("6219861036745478"));
    }

    @Test
    public void correctInputOfArbitraryLengthEvaluatesToTrueTest(){
        Assert.assertTrue(LuhnChecksum.evaluate("621986103674547862198610309042610"));
    }


}
