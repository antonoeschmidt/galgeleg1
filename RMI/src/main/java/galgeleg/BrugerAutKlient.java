package galgeleg;

import brugerautorisation.transport.rmi.Brugeradmin;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class BrugerAutKlient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Scanner scan = new Scanner(System.in);

        Brugeradmin brugeradmin = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
        System.out.println("Indtast studienummer: ");
        String studienummer = scan.nextLine();
        System.out.println("Indtast kode: ");
        String kode = scan.nextLine();
        brugeradmin.hentBruger(studienummer,kode);
        System.out.println("Login autoriseret");

    }
}
