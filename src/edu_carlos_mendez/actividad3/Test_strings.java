package edu_carlos_mendez.actividad3;

import edu_carlos_mendez.actividad3.process.Strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_strings {

    Strings programa = new Strings();

    @Test
    public void si_es_palindromo() {
        boolean resultado = programa.palindromo("ana");
        assertTrue(resultado);
    }

    @Test
    public void no_es_palindromo() {
        boolean resultado = programa.palindromo("hola mundo");
        assertFalse(resultado);
    }

    @Test
    public void testvocales() {
        assertEquals(5, programa.contarvocales("Guacamole"));
        assertEquals(5, programa.contarvocales("Murcielago"));
        assertEquals(0, programa.contarvocales("bcdfgrbts"));
    }
    @Test
    public void invertir_cadena() {
        assertEquals("aloha", programa.invertircadena("ahola"));
        assertEquals("sanchez", programa.invertircadena("zehcnas"));
    }
    @Test
    public void buscar_caracter() {
        assertEquals(2, programa.ubicacion_caracter("aloha", 'o'));
        assertEquals(-1, programa.ubicacion_caracter("hola", 'r'));
    }
}
