package org.hbrs.se1.ws25.exercises.uebung1.view;

import org.hbrs.se1.ws25.exercises.uebung1.control.Translator;
import org.hbrs.se1.ws25.exercises.uebung1.control.Factory;

public class Client  {

    private final Translator translator;

    /**
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
        public Client(){
            this.translator = Factory.createGermanTranslator();
        }
        public void translateNumber(int zahl){
            String result  = this.translator.translateNumber(zahl);
        }

		 public void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung (nur) gegen das Interface Translator gewuenscht!


			 System.out.println("Das Ergebnis der Berechnung: " + translator.translateNumber(aNumber));
		 }
}





