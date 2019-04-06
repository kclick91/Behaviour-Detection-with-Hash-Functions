public class Test {
    public static void main(String[] args)
    {
        BehavDetection bd = new BehavDetection();
        Chain ch = new Chain();
        Chain chtwo = new Chain();


        //Sample to be implemented
        //Action: shoot: true/false
        //Condition: Distance from goal, int
        //Result: Make: true/false

        boolean didShoot = true;
        int dist = 5;
        boolean didMake = true;

        String distCat;
        String shootCat;
        boolean makeCat;
        if (dist < 10)
        {
            distCat = "one";
        }
        else
        {
            distCat = "two";
        }

        ch.AddParamSet(new ParameterSet(String.valueOf(didShoot), distCat, String.valueOf(didMake)));
        //action, condition, result is all true in second chain
        ch.AddParamSet(new ParameterSet("True","True", "True"));
        int disttwo = 12;
        String distCatTwo;
        if (disttwo < 10)
        {
            distCatTwo = "one";
        }
        else
        {
            distCatTwo = "two";
        }
        chtwo.AddParamSet(new ParameterSet(String.valueOf(didShoot), distCatTwo, String.valueOf(didMake)));
        //action, condition, result is all true in second chain
        chtwo.AddParamSet(new ParameterSet("True", "True", "True"));

        //System.out.println(ch.GetList());
        //System.out.println(chtwo.GetList());
        if(bd.CheckChains(ch, chtwo) == false)
        {
            System.out.println(bd.LocateBlock(ch, chtwo));
        }


    }


}
