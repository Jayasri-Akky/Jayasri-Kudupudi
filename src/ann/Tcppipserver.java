package ann;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
public class Tcppipserver {
			public static void main(String[] args) throws Exception{
				ServerSocket ss=new ServerSocket(2913);
		        Socket s=ss.accept();
		       
		        DataInputStream din=new DataInputStream(s.getInputStream());
		        DataOutputStream out=new DataOutputStream(s.getOutputStream());
		        int r,i=0;
		        int n=din.readInt();
		        int a[]=new int[n];
		      
		        int count=0;
		       
		        for(i=0;i<n;i++)
		        {
		                    a[i]=din.readInt();
		        }
		       
		        int res = linearSearch(n,a);		        		      		         
		         out.writeInt(res+1);   
		        s.close();
		        ss.close();	
			}

		 static int linearSearch(int n,int[] a) {
			
			for(int i = 0; i < n-1;i++) {
				if(a[n-1] == a[i]) {
					return i;
				}
			}
			return -2;
			
	}
}
