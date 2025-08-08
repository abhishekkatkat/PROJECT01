	import java.net.InetAddress;
public class Hostname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	
		 
		        try {
		            String username = System.getProperty("user.name");
		            String hostname = InetAddress.getLocalHost().getHostName();

		            System.out.println("Username: " + username);
		            System.out.println("Hostname: " + hostname);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		
}
