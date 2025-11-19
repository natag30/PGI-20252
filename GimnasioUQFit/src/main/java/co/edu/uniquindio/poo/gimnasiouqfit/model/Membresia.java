package co.edu.uniquindio.poo.gimnasiouqfit.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static co.edu.uniquindio.poo.gimnasiouqfit.model.TipoMembresia.*;

public class Membresia {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private TipoMembresia tipoMembresia;
    private EstadoMembresia estadoMembresia;
    private NivelMembresia nivelMembresia;

    private List<Usuario> listUsuariosMembresia;
    private Recepcionista theRecepcionista;

    public Membresia(LocalDate fechaInicio, LocalDate fechaFin, TipoMembresia tipoMembresia, EstadoMembresia estadoMembresia, NivelMembresia nivelMembresia, Recepcionista theRecepcionista) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoMembresia = tipoMembresia;
        this.estadoMembresia = EstadoMembresia.ACTIVA;
        this.nivelMembresia = nivelMembresia;
        this.listUsuariosMembresia = new ArrayList<>();
        this.theRecepcionista = theRecepcionista;
    }

    /**
     * Metodo para definir si una membresia está activa
     * @return
     */
    public boolean isActiva() {
        return LocalDate.now().isBefore(fechaFin);
    }

    /**
     * Metodo para desactivar una membresía
     */
    public void desactivar() {
        if (!isActiva()) {
            this.estadoMembresia = EstadoMembresia.INACTIVA;
        }
    }

    /**
     * Metodo para calcular el costo de una membresia de un usuario
     * @return
     */
    public double calcularCosto() {
        return switch (tipoMembresia) {
            case MENSUAL -> switch (nivelMembresia) {
                case BASICA -> 60000;
                case PREMIUM -> 80000;
                case VIP -> 130000;
            };
            case TRIMESTRAL -> switch (nivelMembresia) {
                case BASICA -> 160000;
                case PREMIUM -> 220000;
                case VIP -> 360000;
            };
            case ANUAL -> switch (nivelMembresia) {
                case BASICA -> 690000;
                case PREMIUM -> 900000;
                case VIP -> 1450000;
            };
        };

    }

    /**
     * Metodo para calcular el costo final que debe pagar el usuario con los descuentos
     * @param usuario
     * @return
     */
    public double calcularCostoFinal (Usuario usuario){
        double descuento = usuario.calcularDescuento();
        return calcularCosto() * (1.0 - descuento);
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public EstadoMembresia getEstadoMembresia() {
        return estadoMembresia;
    }

    public void setEstadoMembresia(EstadoMembresia estadoMembresia) {
        this.estadoMembresia = estadoMembresia;
    }

    public NivelMembresia getNivelMembresia() {
        return nivelMembresia;
    }

    public void setNivelMembresia(NivelMembresia nivelMembresia) {
        this.nivelMembresia = nivelMembresia;
    }

    public List<Usuario> getListUsuariosMembresia() {
        return listUsuariosMembresia;
    }

    public void setListUsuariosMembresia(List<Usuario> listUsuariosMembresia) {
        this.listUsuariosMembresia = listUsuariosMembresia;
    }

    public Recepcionista getTheRecepcionista() {
        return theRecepcionista;
    }

    public void setTheRecepcionista(Recepcionista theRecepcionista) {
        this.theRecepcionista = theRecepcionista;
    }

    @Override
    public String toString() {
        return "Membresia{" +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", tipoMembresia=" + tipoMembresia +
                ", estadoMembresia=" + estadoMembresia +
                ", nivelMembresia=" + nivelMembresia +
                ", listUsuariosMembresia=" + listUsuariosMembresia +
                ", theRecepcionista=" + theRecepcionista +
                '}';
    }
}