package ejercicio4;

import org.junit.Test;

public class TestObras {

    @Test
    public void testConTryCatch() {
        Catalogo catalogo = new Catalogo();
        try {
            catalogo.agregarObra(new ObraDeArte());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConThrows() throws Exception {
        Catalogo catalogo = new Catalogo();
        catalogo.agregarObra(new ObraDeArte());
    }

}








