package exp1.s3.citas_medicas;

public class HoraMedica {
    
    private String fechaCita;
    private String horaCita;
    private String disponibilidad;
    
    public HoraMedica(String fechaCita, String horaCita, String disponibilidad) {
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.disponibilidad = disponibilidad;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

}
