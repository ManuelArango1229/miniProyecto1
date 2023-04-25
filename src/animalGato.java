/////clase para crear objetos de tipo gato 

public class animalGato extends animalVeterinaria{
    public animalGato(Double precio, String origen,String nombre,String raza,short cantidadDientes){
        super(precio,origen,nombre);
        this.cantidadDientes=cantidadDientes;
        this.raza=raza;
        id=_id;
        _id++;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public short getCantidadDientes() {
        return cantidadDientes;
    }
    public void setCantidadDientes(short cantidadDientes) {
        this.cantidadDientes = cantidadDientes;
    }
    public short getId() {
        return id;
    }

    private String raza;
    private short cantidadDientes;
    private short id;
    private static short _id=1000;
}
