import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

public class Chain {

    LinkedList<String> list = new LinkedList();


    public Chain()
    {

    }

    public static String ToSHA256(byte[] convertSHA) {
        MessageDigest md = null;
        String hashtext = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            byte[] message = md.digest(convertSHA);
            BigInteger no = new BigInteger(1, message);
            hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashtext;
    }
    public void AddParamSet(ParameterSet ps)
    {
        list.add(ps.HashParameterSet());
    }

    public LinkedList<String> GetList()
    {
        return list;
    }

    public String HashChain()
    {
        String s = ToSHA256(list.toString().getBytes());
        return s;
    }

}
