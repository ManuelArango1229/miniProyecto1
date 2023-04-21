public abstract class animalVeterinaria{ //se crea la superclase como plantilla para los animales


    public animalVeterinaria(int vacunas, Double precio, String origen){
        this.vacunasAplicadas=vacunas;
        this.cuantoCuesta=precio;
        this.paisOrigen=origen;
    }

    
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }
    public void setVacunasAplicadas(int vacunasAplicadas) {
        this.vacunasAplicadas = vacunasAplicadas;
    }
    public Double getCuantoCuesta() {
        return cuantoCuesta;
    }
    public void setCuantoCuesta(Double cuantoCuesta) {
        this.cuantoCuesta = cuantoCuesta;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }


    ////// atributos en común
    private int vacunasAplicadas;
    private Double cuantoCuesta;
    private String paisOrigen;
    //////


}