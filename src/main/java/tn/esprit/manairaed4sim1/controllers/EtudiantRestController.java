package tn.esprit.manairaed4sim1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.manairaed4sim1.entites.Etudiant;
import tn.esprit.manairaed4sim1.services.EtudiantService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("etudiant")
@RestController
public class EtudiantRestController {

    private final EtudiantService etudiantService;

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }

    @GetMapping("/all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiant();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long id) {
        return etudiantService.getEtudiant(id);
    }

    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@PathVariable("id") Long id, @RequestBody Etudiant updatedEtudiant) {
        return etudiantService.createEtudiant(updatedEtudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable("id") Long id) {
        etudiantService.deleteEtudiant(id);
    }
}