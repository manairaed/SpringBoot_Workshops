package tn.esprit.manairaed4sim1.services;

import tn.esprit.manairaed4sim1.entites.Universite;

import java.util.List;

public interface UniversiteService {
    public Universite createUniversite (Universite U);
    public Universite updateUniversite (Universite U);
    public List<Universite> getAllUniversite ();
    public Universite getUniversite(Long id);
    public void deleteUniversite(Long id);
}
