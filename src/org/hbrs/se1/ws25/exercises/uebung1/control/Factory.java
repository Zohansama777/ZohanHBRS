package org.hbrs.se1.ws25.exercises.uebung1.control;

public class Factory {

    public static Translator createGermanTranslator() {
        GermanTranslator g = new GermanTranslator();
        return g;
    }
}