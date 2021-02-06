package annn;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;
public class Tcpipclient {
			public static void main(String[] args) throws UnknownHostException,IOException{
				 Socket s=new Socket("localhost",2913);
		        
		         System.out.println("Enter size of array:");
		         Scanner scanner=new Scanner(System.in);
		         int n=scanner.nextInt();
		         int a[]=new int[n];
		         System.out.println("Enter elements of the array and the key:");
		         DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		         dout.writeInt(n);
		         for(int i=0;i<n;i++)
		         {
		                     int r=scanner.nextInt();;
		                     dout.writeInt(r);
		         }
		        
		         DataInputStream din=new DataInputStream(s.getInputStream());
		         int r;
		      
		                r=din.readInt();
		                     System.out.print(r+" ");
		         
		         s.close();
				
	}

}
