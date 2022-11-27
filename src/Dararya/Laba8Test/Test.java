package Dararya.Laba8Test;

import Dararya.Laba8.Doctor;
import Dararya.Laba8.Neurosurgeon;

public class Test {
    public static void main(String[] args) {
        Doctor Mihail = new Neurosurgeon();
        Mihail.lechit();
        Neurosurgeon Konstantin = new Neurosurgeon("brain", 12);
        System.out.println(Konstantin.getExperience());
        System.out.println(Konstantin.getSpecialization());
    }
}
