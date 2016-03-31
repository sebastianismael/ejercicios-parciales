package ejercicio5;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestMontacargas {

    private Montacargas montacargas = new Montacargas(100);
    
    @Test(expected=Exception.class)
    public void testPesoMaximo() throws Exception {
        montacargas.cargar(201);
    }
    
    @Test
    public void testObtenerCargaConMontacargasVacio(){
        assertEquals(0, montacargas.obtenerCarga());
    }
    
    @Test
    public void testObtenerCargaConMontacargasConCarga() throws Exception{
        montacargas.cargar(30);
        montacargas.cargar(50);
        assertEquals(80, montacargas.obtenerCarga());
    }
    
    @Test(expected=Exception.class)
    public void testCargarSiMePasoDelPesoMaximo() throws Exception{
        montacargas.cargar(30);
        montacargas.cargar(180);
    }
    
    @Test
    public void testDescargar() throws Exception{
        montacargas.cargar(30);
        montacargas.cargar(50);
        montacargas.descargar();
        assertEquals(0, montacargas.obtenerCarga());
    }
    
    @Test
    public void testObtenerCargaPromedioSinHaberDescargado() throws Exception{
        montacargas.cargar(30);
        montacargas.cargar(50);
        assertEquals(0, montacargas.obtenerCargaPromedio());
    }
    
    @Test
    public void testObtenerCargaPromedioHabiendoDescargado() throws Exception{
        montacargas.cargar(30);
        montacargas.cargar(50);
        montacargas.descargar();
        
        montacargas.cargar(30);
        montacargas.cargar(30);
        montacargas.descargar();
        
        assertEquals(70, montacargas.obtenerCargaPromedio());
    }
    
    @Test
    public void testObtenerCargaPromedioHabiendoDescargadoYVueltoACargar() throws Exception{
        montacargas.cargar(30);
        montacargas.cargar(50);
        montacargas.descargar();
        
        montacargas.cargar(30);
        montacargas.cargar(30);
        montacargas.descargar();
        
        montacargas.cargar(50);
        
        assertEquals(70, montacargas.obtenerCargaPromedio());
    }

}
