package tn.esprit.manairaed4sim1.services;

import tn.esprit.manairaed4sim1.entites.Foyer;

import java.util.List;

public interface FoyerService {
    public Foyer createFoyer (Foyer F);
    public Foyer updateFoyer (Foyer F);
    public List<Foyer> getAllFoyer ();
    public Foyer getFoyer(Long id);
    public void deleteFoyer(Long id);
    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;

}
