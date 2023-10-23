package tn.esprit.manairaed4sim1.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.manairaed4sim1.entites.Chambre;
import tn.esprit.manairaed4sim1.repositories.IBlocRepository;
import tn.esprit.manairaed4sim1.repositories.IChambreRepository;
import tn.esprit.manairaed4sim1.services.ChambreService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreServiceImpl implements ChambreService {
    private final IChambreRepository chambreRepository;

    @Override
    public Chambre createChambre(Chambre C) {
        return chambreRepository.save(C);
    }

    @Override
    public Chambre updateChambre(Chambre C) {
        return chambreRepository.save(C);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return (List <Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre getChambre(Long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
}
