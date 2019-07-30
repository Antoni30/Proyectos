
package modelo;

public class UsuarioVO {
    
    private int id;
    private String user;
    private String password;
    private String nombre;
    private String telefono;
    private String direccion;

    public UsuarioVO(int id, String user, String password, String nombre, String telefono, String direccion) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
public UsuarioVO() {
        this.id = 0;
        this.user = "";
        this.password = "";
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String usuario) {
        this.user = usuario;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    

}
