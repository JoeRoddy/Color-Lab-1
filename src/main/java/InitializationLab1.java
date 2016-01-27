/**
 * Created by Joe on 1/20/16.
 */
public class InitializationLab1 {

    public static void main(String[] args) {
        BoringThing bs1 = new BoringThing();
        BoringThing bs2 = new BoringThing();
        BoringThing bs3 = new BoringThing();
        BoringThing bs4 = new BoringThing();
        BoringThing bs5 = new BoringThing();
        ColorfulThing cs1 = new ColorfulThing(ColorfulThing.Colors.BLUE);
        ColorfulThing cs2= new ColorfulThing(ColorfulThing.Colors.YELLOW);
        ColorfulThing cs3 = new ColorfulThing(ColorfulThing.Colors.RED);

        System.out.println(cs1.getColor());
        System.out.println(cs2.getColor());
        System.out.println(cs3.getColor());

    }
}


