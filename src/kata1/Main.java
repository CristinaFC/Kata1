/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author ju
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Luis Hernande", LocalDate.of(1970, Month.MARCH, 20));
        System.out.println(person.toString());
    }
    
}
