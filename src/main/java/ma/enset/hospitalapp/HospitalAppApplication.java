package ma.enset.hospitalapp;

import ma.enset.hospitalapp.entities.Patient;
import ma.enset.hospitalapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalAppApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Ajouter des patients
        patientRepository.save(new Patient(null,"hamza",new Date(),false,20));
        patientRepository.save(new Patient(null,"david",new Date(),true,20));
        patientRepository.save(new Patient(null,"hassan",new Date(),false,20));
        //Consulter tous les patients
        System.out.println("listes des patients");
        patientRepository.findAll().forEach(System.out::println);
        System.out.println("-------------------------");
        //Consulter un patient
        System.out.println("Consulter le patient 1");
        System.out.println(patientRepository.findById(Long.valueOf(1)).get());
        System.out.println("-------------------------");
        //Chercher des patients
        System.out.println("Chercher des patients");
        patientRepository.findByNomContains("h").forEach(System.out::println);
        System.out.println("-------------------------");
        //Mettre à jour un patient
        System.out.println("Mettre à jour un patient");
        Patient patient = patientRepository.findById(Long.valueOf(1)).get();
        patient.setScore(patient.getScore()+20);
        patientRepository.save(patient);
        System.out.println(patientRepository.findById(Long.valueOf(1)).get());
        System.out.println("-------------------------");
        //supprimer un patient
        System.out.println("supprimer un patient");
        patientRepository.deleteById(Long.valueOf(2));
        patientRepository.findAll().forEach(System.out::println);




    }
}
