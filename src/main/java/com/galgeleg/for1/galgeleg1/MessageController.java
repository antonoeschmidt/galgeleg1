package com.galgeleg.for1.galgeleg1;

import galgeleg.GalgelegInterface;
import galgeleg.Galgelogik;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MessageController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private GalgelegInterface logik;

    public void getInfo() throws RemoteException, NotBoundException, MalformedURLException {
        logik = (GalgelegInterface) Naming.lookup("rmi://localhost:8081/logic");
        logik.nulstil();
    }


    @GetMapping("/newgame")
    public Game getGame() throws RemoteException, NotBoundException, MalformedURLException {
        getInfo();
        System.out.println(logik.erSpilletSlut());
        return new Game(logik.getSynligtOrd(), logik.getAntalForkerteBogstaver(),
                logik.getBrugteBogstaver(), logik.erSpilletSlut(), "-- Nyt spil er startet --");
    }

    @GetMapping("/greeting")
    public Message msg(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println(name);
        return new Message(counter.incrementAndGet(), String.format(template, name), "qwe");
    }

    @PostMapping("/guess")
    public Game guessLetter(@RequestBody String guess) throws RemoteException {
        System.out.println(guess);
        logik.gætBogstav(guess);
        return new Game(logik.getSynligtOrd(), logik.getAntalForkerteBogstaver(),
                logik.getBrugteBogstaver(), logik.erSpilletSlut(), "Du gættede på " + guess);
    }

}

