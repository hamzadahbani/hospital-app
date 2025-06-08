package ma.enset.hospitalapp.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.enset.hospitalapp.entities.*;
import ma.enset.hospitalapp.repository.*;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rv) {
        return rendezVousRepository.save(rv);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
