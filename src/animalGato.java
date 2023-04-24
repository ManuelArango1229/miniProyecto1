/////clase para crear objetos de tipo gato 

public class animalGato extends animalVeterinaria{
    public animalGato(Double precio, String origen,String nombre,String raza,short cantidadDientes){
        super(precio,origen,nombre);
        this.cantidadDientes=cantidadDientes;
        this.raza=raza;
    }

    

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setCantidadDientes(short cantidadDientes) {
        this.cantidadDientes = cantidadDientes;
    }

    public String getRaza() {
        return raza;
    }



    public short getCantidadDientes() {
        return cantidadDientes;
    }


    private String raza;
    private short cantidadDientes;
    
}
