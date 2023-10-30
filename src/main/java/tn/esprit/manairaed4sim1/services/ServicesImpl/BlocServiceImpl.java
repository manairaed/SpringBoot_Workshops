package tn.esprit.manairaed4sim1.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.manairaed4sim1.repositories.IBlocRepository;
import tn.esprit.manairaed4sim1.entites.Bloc;
import tn.esprit.manairaed4sim1.services.BlocService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlocServiceImpl implements BlocService {

    private final IBlocRepository blocRepository;

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


}
