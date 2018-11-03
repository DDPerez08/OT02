package Base.Trabajo;

public abstract class TrabajoBase {

private int p_idTrabajo;
private int p_CodigoCliente;
private String P_Descripcion;
private int p_CodigoMaterial;
private float p_Metros2;
private int p_idPrioridad;

    public int getP_idTrabajo() {
        return p_idTrabajo;
    }

    public void setP_idTrabajo(int p_idTrabajo) {
        this.p_idTrabajo = p_idTrabajo;
    }

    public int getP_CodigoCliente() {
        return p_CodigoCliente;
    }

    public void setP_CodigoCliente(int p_CodigoCliente) {
        this.p_CodigoCliente = p_CodigoCliente;
    }

    public String getP_Descripcion() {
        return P_Descripcion;
    }

    public void setP_Descripcion(String p_Descripcion) {
        P_Descripcion = p_Descripcion;
    }

    public int getP_CodigoMaterial() {
        return p_CodigoMaterial;
    }

    public void setP_CodigoMaterial(int p_CodigoMaterial) {
        this.p_CodigoMaterial = p_CodigoMaterial;
    }

    public float getP_Metros2() {
        return p_Metros2;
    }

    public void setP_Metros2(float p_Metros2) {
        this.p_Metros2 = p_Metros2;
    }

    public int getP_idPrioridad() {
        return p_idPrioridad;
    }

    public void setP_idPrioridad(int p_idPrioridad) {
        this.p_idPrioridad = p_idPrioridad;
    }
}

