//import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
public class Action
{
    private int value;
    private boolean isGoodAction;
    public Action(int val)
    {
        value = val;
    }

    public int SwitchValue(int val)
    {
        if (!isGoodAction)
        {
            value = val;
        }

        return value;
    }

    public boolean SetIsGoodAction(boolean b)
    {
        isGoodAction = b;
        return isGoodAction;
    }
}