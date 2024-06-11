package Authentication;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

public class IPDomainAuthentication {
    private Set<String> allowedIPs;
    //A set containing allowed IP addresses.
    private Set<String> allowedDomains;
    //allowedDomains: A set containing allowed domains

    public IPDomainAuthentication() {
        allowedIPs = new HashSet<>();
        allowedDomains = new HashSet<>();
        
        // Example of adding allowed IP addresses
        allowedIPs.add("192.168.1.100");
        allowedIPs.add("192.168.1.101");
        
        // Example of adding allowed domains
        allowedDomains.add("example.com");
        allowedDomains.add("mydomain.com");
    }

    public boolean authenticate(String ipAddress) {
        if (allowedIPs.contains(ipAddress)) {
            return true;
        } else {
            try {
                InetAddress inetAddress = InetAddress.getByName(ipAddress);
                String domain = inetAddress.getCanonicalHostName();
                return allowedDomains.contains(domain);
            } catch (UnknownHostException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public static void main(String[] args) {
        IPDomainAuthentication auth = new IPDomainAuthentication();
        
        String testIP1 = "192.168.1.100"; // should be allowed
        String testIP2 = "192.168.1.102"; // should not be allowed
        String testIP3 = "93.184.216.34"; // example.com IP address

        System.out.println("Authentication result for IP " 
        + testIP1 + ": " + auth.authenticate(testIP1));
        System.out.println("Authentication result for IP " 
        + testIP2 + ": " + auth.authenticate(testIP2));
        System.out.println("Authentication result for IP " 
        + testIP3 + ": " + auth.authenticate(testIP3));
    }
}

