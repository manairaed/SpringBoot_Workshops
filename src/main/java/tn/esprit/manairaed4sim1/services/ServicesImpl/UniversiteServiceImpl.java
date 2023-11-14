package tn.esprit.manairaed4sim1.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.manairaed4sim1.entites.Foyer;
import tn.esprit.manairaed4sim1.entites.Universite;
import tn.esprit.manairaed4sim1.repositories.IFoyerRepository;
import tn.esprit.manairaed4sim1.repositories.IUniversiteRepository;
import tn.esprit.manairaed4sim1.services.UniversiteService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversiteServiceImpl implements UniversiteService {

    private final IUniversiteRepository universiteRepository;

    private final IFoyerRepository foyerRepository;

    @Override
    public Universite createUniversite(Universite U) {
        return universiteRepository.save(U);
    }

    @Override
    public Universite updateUniversite(Universite U) {
        return universiteRepository.save(U);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite getUniversite(Long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }

    @Transactional
    @Override
    public Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).orElse(null);
        Universite universite= universiteRepository.findBynomUniversite(nomUniversite);
        universite.setFoyer(foyer);
        return universite;
    }

    @Transactional
    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite)
                .orElse(null);

        universite.setFoyer(null);
        return universite;
    }


}
