package Modelo;

public class usuario {

    private int id;
    private String matricula;
    private String password;
    private String nombre;
    private String last_session;
    private int id_tipo;
    private int key;
    private int num_conexion;
    private int primer_puntuacion;
    private int segunda_puntuacion;
    private String nombre_tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getNum_conexion() {
        return num_conexion;
    }

    public void setNum_conexion(int num_conexion) {
        this.num_conexion = num_conexion;
    }

    public int getPrimer_puntuacion() {
        return primer_puntuacion;
    }

    public void setPrimer_puntuacion(int primer_puntuacion) {
        this.primer_puntuacion = primer_puntuacion;
    }

    public int getSegunda_puntuacion() {
        return segunda_puntuacion;
    }

    public void setSegunda_puntuacion(int segunda_puntuacion) {
        this.segunda_puntuacion = segunda_puntuacion;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
    
}
