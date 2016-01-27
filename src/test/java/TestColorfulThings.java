import static org.junit.Assert.*;
import org.junit.Test;

public class TestColorfulThings {

    @Test
    public void getColorTest(){
        ColorfulThing ctTester = new ColorfulThing(ColorfulThing.Colors.RED);
        assertTrue("Test failed.  Color not retrieved",ctTester.getColor()==ColorfulThing.Colors.RED);
        System.out.println("Test passed. Color retrieved: "+ctTester.getColor());
    }

}
