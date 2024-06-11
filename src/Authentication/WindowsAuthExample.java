//package server;
//
//import javax.security.auth.Subject;
//import javax.security.auth.login.LoginContext;
//import javax.security.auth.login.LoginException;
//
//import java.security.Principal;
//import java.security.PrivilegedAction;
//import java.util.Set;
//
//public class WindowsAuthExample {
//
//    public static void main(String[] args) {
//        System.setProperty("java.security.auth.login.config", "path/to/jaas.config");
//
//        try {
//            // Create a LoginContext with the specified configuration
//            LoginContext loginContext = new LoginContext("WindowsLogin", new TextCallbackHandler());
//            // Attempt authentication
//            loginContext.login();
//
//            // If successful, get the authenticated subject
//            Subject subject = loginContext.getSubject();
//            System.out.println("Authentication successful!");
//
//            // Execute some privileged action as the authenticated user
//            Subject.doAs(subject, (PrivilegedAction<Void>) () -> {
//                Set<Principal> principals = subject.getPrincipals();
//                for (Principal principal : principals) {
//                    System.out.println("Authenticated user: " + principal.getName());
//                }
//                return null;
//            });
//
//            // Logout
//            loginContext.logout();
//        } catch (LoginException e) {
//            System.out.println("Authentication failed: " + e.getMessage());
//        }
//    }
//}
//
package Authentication;


