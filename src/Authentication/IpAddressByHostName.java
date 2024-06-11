package Authentication;

// Java program to obtain IP Address from a given host 

import java.net.*; 

//getHostName(): This function retrieves the standard hostname 
//for the local computer.
//getHostByName(): This function retrieves host information corresponding
//to a hostname from a host database.
public class IpAddressByHostName {
 public static void main(String[] args) 
 { 
       // Host 
     String host = "www.nirvanacollege.edu.np"; 
     
     // Using try Logic So that if there is an error then 
     // easily get the error 
     try { 
         
         // calling the function which gives the IP 
         // Address from the given host 
         InetAddress[] iaddress 
             = InetAddress.getAllByName(host); 

         for (InetAddress ipaddresses : iaddress) { 
             System.out.println(ipaddresses.toString()); 
         } 
     } 
     catch (UnknownHostException e) { 
         System.out.println(e); 
     } 
 } 
}
