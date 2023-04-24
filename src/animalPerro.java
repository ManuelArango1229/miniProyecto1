//clase para crear objetos de tipo perro

public class animalPerro extends animalVeterinaria {
    public animalPerro(String color, short edad, Double precio, String origen,String nombre){
        super(precio ,origen,nombre);
        this.colorPelo=color;
        this.edad=edad;
    }
    
  

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getColorPelo() {
        return colorPelo;
    }



    public short getEdad() {
        return edad;
    }

    ////// atributos propios de los perros ----> por definir
    private String colorPelo;
    private short edad;

}
