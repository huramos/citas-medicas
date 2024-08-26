package exp1.s3.citas_medicas;

public class Paciente {

    private String rutPaciente;
    private String nombrePaciente;
    private String fechaCita;
    private String horaCita;
    
    public Paciente(String rutPaciente, String nombrePaciente, String fechaCita, String horaCita) {
        this.rutPaciente = rutPaciente;
        this.nombrePaciente = nombrePaciente;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public String getRutPaciente() {
        return rutPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getFechaCita() {
        return fechaCita;
    } 

    public String getHoraCita() {
        return horaCita;
    } 
}
