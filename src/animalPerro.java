//clase para crear objetos de tipo perro

public class animalPerro extends animalVeterinaria {
    public animalPerro(String color, short edad, Double precio, String origen,String nombre){
        super(precio ,origen,nombre);
        this.colorPelo=color;
        this.edad=edad;
        id=_id;
        _id++;
    }
    
    
    public String getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public short getEdad() {
        return edad;
    }
    public void setEdad(short edad) {
        this.edad = edad;
    }
    public short getId() {
        return id;
    }


    ////// atributos propios de los perros ----> por definir
    private String colorPelo;
    private short edad;
    private short id;
    private static short _id=2000;

}
