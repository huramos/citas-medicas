package exp1.s3.citas_medicas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitaController {

    private List<HoraMedica> horaMedicas = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();

    public CitaController() {

        horaMedicas.add(new HoraMedica("24-08-2024", "09:00", "DISPONIBLE"));
        horaMedicas.add(new HoraMedica("24-08-2024", "10:00", "DISPONIBLE"));
        horaMedicas.add(new HoraMedica("24-08-2024", "11:00", "NO_DISPONIBLE"));
        horaMedicas.add(new HoraMedica("24-08-2024", "12:00", "NO_DISPONIBLE"));
        horaMedicas.add(new HoraMedica("24-08-2024", "13:00", "NO_DISPONIBLE"));
        horaMedicas.add(new HoraMedica("24-08-2024", "14:00", "NO_DISPONIBLE"));

        pacientes.add(new Paciente("11111-1", "Tomas Soto", "24-08-2024", "11:00"));
        pacientes.add(new Paciente("22222-2", "Javiera Sepulveda", "24-08-2024", "12:00"));
        pacientes.add(new Paciente("33333-3", "Luis Pozo", "24-08-2024", "13:00"));
        pacientes.add(new Paciente("44444-4", "Jaime Torres", "24-08-2024", "14:00"));

    }

    @GetMapping("/horas")
    public List<HoraMedica> getHoraMedicas() {
        return horaMedicas;
    }

    @GetMapping("/paciente")
    public List<Paciente> getPaciente() {
        return pacientes;
    }

    @GetMapping("/horas/{disponibilidad}")
    public List<HoraMedica> getHorasMedicasByDisponibilidad(@PathVariable String disponibilidad) {
        List<HoraMedica> horasFiltradas = new ArrayList<>();
        for (HoraMedica horaMedica : horaMedicas) {
            if (horaMedica.getDisponibilidad().equals(disponibilidad.toUpperCase())) {
                horasFiltradas.add(horaMedica);
            }
        }
        return horasFiltradas;
    }

    @GetMapping("/paciente/citaAgendada/{rut}")
    public Paciente getCitaAgendadByRut(@PathVariable String rut) {
        for (Paciente paciente : pacientes) {
            if (paciente.getRutPaciente().equals(rut)) {
                return paciente;
            }
        }
        return null;
    }
}
