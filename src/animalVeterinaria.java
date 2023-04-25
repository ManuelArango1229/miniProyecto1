public abstract class animalVeterinaria implements vacunasAnimales{ 


    public animalVeterinaria(Double precio, String origen,String nombre){
        this.cuantoCuesta=precio;
        this.paisOrigen=origen;
        this.nombreDelanimal=nombre;
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
    public String getNombreDelanimal() {
        return nombreDelanimal;
    }


    public void setNombreDelanimal(String nombreDelanimal) {
        this.nombreDelanimal = nombreDelanimal;
    }

    ////// atributos en común
    private String nombreDelanimal;
    private Double cuantoCuesta;
    private String paisOrigen;
    
    //////
    


}