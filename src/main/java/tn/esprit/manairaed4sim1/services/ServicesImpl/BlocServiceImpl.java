package tn.esprit.manairaed4sim1.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.manairaed4sim1.entites.Chambre;
import tn.esprit.manairaed4sim1.entites.Foyer;
import tn.esprit.manairaed4sim1.entites.Universite;
import tn.esprit.manairaed4sim1.repositories.IBlocRepository;
import tn.esprit.manairaed4sim1.entites.Bloc;
import tn.esprit.manairaed4sim1.repositories.IChambreRepository;
import tn.esprit.manairaed4sim1.repositories.IFoyerRepository;
import tn.esprit.manairaed4sim1.services.BlocService;

import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BlocServiceImpl implements BlocService {

    private final IBlocRepository blocRepository;

    private final IChambreRepository chambreRepository;

    private final IFoyerRepository foyerRepository;

    @Override
    public Bloc createBloc(Bloc B) {
        return blocRepository.save(B);
    }

    @Override
    public Bloc updateBloc(Bloc B) {
        return blocRepository.save(B);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc getBloc(Long id) {
        return blocRepository.findById(id).get();
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Transactional
    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc= blocRepository.findByNomBloc(nomBloc);
        for (Long num : numChambre){
            Chambre chambre = chambreRepository.findByNumeroChambre(num);
            chambre.setBloc(bloc);
            return bloc;
        }
        return null;
    }

    @Override
    public Bloc affecterBlocAFoyer(long idBloc, long idFoyer) {
        Bloc bloc = blocRepository.findById(idBloc)
                .orElse(null);

        Foyer foyer = foyerRepository.findById(idFoyer)
                .orElse(null);

        bloc.setFoyer(foyer);
        blocRepository.save(bloc);

        return bloc;
    }


}
