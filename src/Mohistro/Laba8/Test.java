package Mohistro.Laba8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        Vehicle tram = new Tram(36, "084");
        tram.signal();
        PublicTransport tram1 = new Tram();
        tram1.setPassengers(30);
        tram1.signal();
        System.out.println(tram1.getNumber());
        tram1.setNumber("333");
        tram1.signal();
    }

}
