package ejercicio3;

import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {

    @Test
    public void testComparable() {
        Persona p1 = new Persona();
        p1.setEdad(20);
        p1.setNombre("maria");

        Persona p2 = new Persona();
        p2.setEdad(12);
        p2.setNombre("paula");

        TreeSet<Persona> lista = new TreeSet<Persona>();
        lista.add(p1);
        lista.add(p2);
        
        Assert.assertTrue(lista.iterator().next().getNombre().equals("maria"));
    }
    
    @Test
    public void testComparator() {
        Persona p1 = new Persona();
        p1.setEdad(20);
        p1.setNombre("maria");

        Persona p2 = new Persona();
        p2.setEdad(12);
        p2.setNombre("paula");

        TreeSet<Persona> lista = new TreeSet<Persona>(new EdadPersonaComparator());
        lista.add(p1);
        lista.add(p2);
        
        Assert.assertTrue(lista.iterator().next().getNombre().equals("paula"));
    }


}
