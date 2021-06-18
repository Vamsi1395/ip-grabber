import java.net.*;
import java.util.*;
public class grabber
{
    public static void main(String[] agrs)throws Exception {
    Scanner ob=new Scanner(System.in);
    System.out.println("ENTER YOUR HOST");
    String host=ob.nextLine();
   
   InetAddress ip=InetAddress.getByName(host);
   String address = ip.getHostAddress();
   String name=ip.getHostName();
   System.out.println("IP ADDRESS : "+address);
   System.out.println("Name : "+name);
}

}
