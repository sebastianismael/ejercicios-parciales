package ejercicio5;

public class Montacargas {

    private Integer pesoMaximo = 0;
    private Integer pesoAcumulado = 0;
    private Integer pesoDescargado = 0;
    private Integer cantidadDescargas = 0;

    public Montacargas(Integer pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    
    public void cargar(Integer peso) throws Exception{
        if(pesoAcumulado + peso > pesoMaximo){
            throw new Exception();
        }
        pesoAcumulado += peso;
    }
    
    public int obtenerCarga(){
        return pesoAcumulado;
    }

    public void descargar() {
        pesoDescargado += pesoAcumulado;
        pesoAcumulado = 0;
        cantidadDescargas++;
    }

    public int obtenerCargaPromedio() {
        if(cantidadDescargas != 0){
            return pesoDescargado / cantidadDescargas;
        }
        return 0;
    }









}
