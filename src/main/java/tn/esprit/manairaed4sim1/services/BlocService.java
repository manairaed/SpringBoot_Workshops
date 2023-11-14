package tn.esprit.manairaed4sim1.services;

import tn.esprit.manairaed4sim1.entites.Bloc;

import java.util.List;

public interface BlocService {
    public Bloc createBloc (Bloc B);
    public Bloc updateBloc (Bloc B);
    public List<Bloc> getAllBloc ();
    public Bloc getBloc(Long id);
    public void deleteBloc(Long id);

    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) ;
    public Bloc affecterBlocAFoyer (long idBloc, long idFoyer) ;
}
