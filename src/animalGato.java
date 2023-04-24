/////clase para crear objetos de tipo gato 

public class animalGato extends animalVeterinaria{
    public animalGato(Double precio, String origen,String nombre,byte ID,String raza,short cantidadDientes){
        super(precio,origen,nombre,ID);
        this.cantidadDientes=cantidadDientes;
        this.raza=raza;
    }

    

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setCantidadDientes(short cantidadDientes) {
        this.cantidadDientes = cantidadDientes;
    }



    private String raza;
    private short cantidadDientes;
}
