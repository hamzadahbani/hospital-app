package ma.enset.hospitalapp.repository;

import ma.enset.hospitalapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    public List<Patient> findByNomContains(String c);

}
