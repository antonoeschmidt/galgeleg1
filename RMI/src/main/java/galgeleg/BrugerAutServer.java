package galgeleg;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class BrugerAutServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        GalgelegInterface glI = new Galgelogik();
        Naming.rebind("rmi://localhost:1099/galgeservice",glI);
        System.out.println("BrugerAutService registreret.");
    }

}
