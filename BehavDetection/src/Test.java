public class Test {
    public static void main(String[] args)
    {
        BehavDetection bd = new BehavDetection();
        Chain ch = new Chain();
        Chain chtwo = new Chain();
        ch.AddParamSet(new ParameterSet("three","three","four"));
        ch.AddParamSet(new ParameterSet("three","three","three"));
        chtwo.AddParamSet(new ParameterSet("three","three","four"));
        chtwo.AddParamSet(new ParameterSet("three","three","two"));

        System.out.println(ch.GetList());
        System.out.println(chtwo.GetList());

        System.out.println(bd.CheckChains(ch, chtwo));
        System.out.println(bd.LocateBlock(ch, chtwo));




    }


}
