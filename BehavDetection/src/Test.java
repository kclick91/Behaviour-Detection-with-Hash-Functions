public class Test {
    public static void main(String[] args)
    {
        BehavDetection bd = new BehavDetection();
        Chain ch = new Chain();
        Chain chtwo = new Chain();
        //Categories that the parameters fit in
        ch.AddParamSet(new ParameterSet("three","three","four"));
        ch.AddParamSet(new ParameterSet("three","three","three"));
        chtwo.AddParamSet(new ParameterSet("three","three","four"));
        chtwo.AddParamSet(new ParameterSet("three","three","two"));

        System.out.println(ch.GetList());
        System.out.println(chtwo.GetList());

        if(bd.CheckChains(ch, chtwo) == false)
        {
            System.out.println(bd.LocateBlock(ch, chtwo));
        }





    }


}
