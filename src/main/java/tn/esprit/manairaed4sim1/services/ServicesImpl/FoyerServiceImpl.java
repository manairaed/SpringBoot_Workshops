package tn.esprit.manairaed4sim1.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.manairaed4sim1.entites.Foyer;
import tn.esprit.manairaed4sim1.repositories.IFoyerRepository;
import tn.esprit.manairaed4sim1.services.FoyerService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoyerServiceImpl implements FoyerService {

    private final IFoyerRepository foyerRepository;

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
}
