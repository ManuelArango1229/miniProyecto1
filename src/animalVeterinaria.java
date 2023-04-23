public abstract class animalVeterinaria{ //se crea la superclase como plantilla para los animales


    public animalVeterinaria(Double precio, String origen){
        this.cuantoCuesta=precio;
        this.paisOrigen=origen;
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
    private Double cuantoCuesta;
    private String paisOrigen;
    //////


}