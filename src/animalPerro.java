public class animalPerro extends animalVeterinaria {
    public animalPerro(String color, short edad,int vacunas, Double precio, String origen){
        super(vacunas,precio ,origen );
        this.colorPelo=color;
        this.edad=edad;
    }
    
    private String colorPelo;
    private short edad;
}
