package ma.enset.hospitalapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity@Data@NoArgsConstructor@AllArgsConstructor @Getter
@Setter

public class Consultation {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateConsultation;
    private String rapport;
    @OneToOne
    private RendezVous rendezVous;
}
