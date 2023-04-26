import java.util.ArrayList;

public abstract class animalVeterinaria{ 


    public animalVeterinaria(Double precio, String origen,String nombre){
        this.cuantoCuesta=precio;
        this.paisOrigen=origen;
        this.nombreDelanimal=nombre;
    }

    public animalVeterinaria(){}
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

    public void agregarVacuna(String n) {
        vacunas.add(n);
    }

    public ArrayList<String> getVacunas(){
        return vacunas;
    }
    public String busqueda(String name){
        for(String vacuna : this.vacunas){
            if(vacuna.equals(name)){
                return vacuna;
            }
        }return null;
    }

    ////// atributos en común
    private String nombreDelanimal;
    private Double cuantoCuesta;
    private String paisOrigen;
    private ArrayList<String> vacunas= new ArrayList<String>();
    //////
    


}