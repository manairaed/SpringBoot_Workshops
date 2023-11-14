package tn.esprit.manairaed4sim1.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.manairaed4sim1.entites.Bloc;
import tn.esprit.manairaed4sim1.entites.Foyer;
import tn.esprit.manairaed4sim1.entites.Universite;
import tn.esprit.manairaed4sim1.repositories.IBlocRepository;
import tn.esprit.manairaed4sim1.repositories.IFoyerRepository;
import tn.esprit.manairaed4sim1.repositories.IUniversiteRepository;
import tn.esprit.manairaed4sim1.services.FoyerService;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class FoyerServiceImpl implements FoyerService {

    private final IFoyerRepository foyerRepository;
    private final IUniversiteRepository universiteRepository;

    private final IBlocRepository blocRepository;

    @Override
    public Foyer createFoyer(Foyer F) {
        return foyerRepository.save(F);
    }

    @Override
    public Foyer updateFoyer(Foyer F) {
        return foyerRepository.save(F);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer getFoyer(Long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteFoyer(Long id) {
        foyerRepository.deleteById(id);
    }


    @Transactional
    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        universite.setFoyer(foyer);
        Set<Bloc> listBlocs = foyer.getSetBlocs();
        for (Bloc bloc : listBlocs) {
            bloc.setFoyer(foyer);
            blocRepository.save(bloc);
        }
        return foyer;
    }


}
