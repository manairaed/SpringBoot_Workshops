package tn.esprit.manairaed4sim1.services;

import tn.esprit.manairaed4sim1.entites.Bloc;
import tn.esprit.manairaed4sim1.entites.Chambre;

import java.util.List;

public interface ChambreService {
    public Chambre createChambre (Chambre C);
    public Chambre updateChambre (Chambre C);
    public List<Chambre> getAllChambre ();
    public Chambre getChambre(Long id);
    public void deleteChambre(Long id);
}
