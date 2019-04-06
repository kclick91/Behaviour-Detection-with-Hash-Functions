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
    public int LocateBlock(Chain c, Chain cold)
    {
        int ret = -1;
       for(String s : c.GetList())
       {
           if (!s.equals(cold.GetList().get(c.GetList().indexOf(s))))
           {
               ret = c.GetList().indexOf(s);
           }
       }
       return ret;
    }
}
