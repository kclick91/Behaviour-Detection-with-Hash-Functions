//import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;

public class BehavDetection {

    private ArrayList<LinkedList<String>> list;
    private ArrayList<LinkedList<String>> listtwo;

    private ArrayList<LinkedList<String>> comparison;

    public BehavDetection()
    {

    }




    public boolean CheckChains(Chain c, Chain cold)
    {

        return c.HashChain() == cold.HashChain();
    }

    /*public void SaveChains(Chain c, Chain cold)
    {

    }*/
    public ArrayList<Integer> LocateBlocks(Chain c, Chain cold)
    {

        ArrayList<Integer> blocksDetected = new ArrayList<>();

       for(int i = 0; i < c.GetList().size(); i++)
       {
           String s = c.GetList().get(i);
           if (!s.equals(cold.GetList().get(i)))
           {
               blocksDetected.add(i);
           }
       }
       return blocksDetected;
    }

}
