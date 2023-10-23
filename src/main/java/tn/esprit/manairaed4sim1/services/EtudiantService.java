package tn.esprit.manairaed4sim1.services;

import tn.esprit.manairaed4sim1.entites.Bloc;
import tn.esprit.manairaed4sim1.entites.Etudiant;

import java.util.List;

public interface EtudiantService {
    public Etudiant createEtudiant (Etudiant E);
    public Etudiant updateEtudiant (Etudiant E);
    public List<Etudiant> getAllEtudiant ();
    public Etudiant getEtudiant(Long id);
    public void deleteEtudiant(Long id);
}
