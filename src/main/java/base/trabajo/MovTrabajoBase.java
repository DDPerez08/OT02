package Base.Trabajo;

public abstract class MovTrabajoBase {
    private int p_idMovTrabajo;
    private int p_idTrabajo;
    private int p_idEstado;
    private int p_Fecha;

    public int getP_idMovTrabajo() {
        return p_idMovTrabajo;
    }

    public void setP_idMovTrabajo(int p_idMovTrabajo) {
        this.p_idMovTrabajo = p_idMovTrabajo;
    }

    public int getP_idTrabajo() {
        return p_idTrabajo;
    }

    public void setP_idTrabajo(int p_idTrabajo) {
        this.p_idTrabajo = p_idTrabajo;
    }

    public int getP_idEstado() {
        return p_idEstado;
    }

    public void setP_idEstado(int p_idEstado) {
        this.p_idEstado = p_idEstado;
    }

    public int getP_Fecha() {
        return p_Fecha;
    }

    public void setP_Fecha(int p_Fecha) {
        this.p_Fecha = p_Fecha;
    }
}
