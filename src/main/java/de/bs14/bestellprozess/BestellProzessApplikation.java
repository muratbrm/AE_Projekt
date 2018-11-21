/**
 * @author muratbrm
 * Diese Klasse ist der Einstiegspunkt der Anwendung.
 */

package de.bs14.bestellprozess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"de.bs14.bestellprozess.controller, de.bs14.bestellprozess.entity, de.bs14.bestellprozess.service"})
public class BestellProzessApplikation { 

    public static void main(String[] args) {
        SpringApplication.run(BestellProzessApplikation.class, args);
    }
}
