import java.util.*;
public class Message
{
  public  int initiator=0;
    public  int from=0;
    public  int to=0;
    Message(int i,int j,int k)
    {
        initiator=i;
        from=j;
        to=k;
    }
    public String toString()
    {
        return "("+initiator+","+from+","+to+")";
    }
 }