import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ParameterSet {

    private static String action;
    private static String condition;
    private static String result;

    public ParameterSet(String a,String c,String r)
    {
        action = a;
        condition = c;
        result = r;
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
    public String HashParameterSet()
    {
        String s = action + condition + result;
        return ToSHA256(s.getBytes());
    }

}
