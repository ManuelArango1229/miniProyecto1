//clase para crear objetos de tipo perro

public class animalPerro extends animalVeterinaria {
    public animalPerro(String color, short edad, Double precio, String origen){
        super(precio ,origen );
        this.colorPelo=color;
        this.edad=edad;
    }
    
  

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public void setEdad(short edad) {
        this.edad = edad;
    }


    ////// atributos propios de los perros ----> por definir
    private String colorPelo;
    private short edad;

}
