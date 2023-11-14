package tn.esprit.manairaed4sim1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.manairaed4sim1.entites.Universite;
import tn.esprit.manairaed4sim1.services.UniversiteService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("universite")
@RestController
public class UniversiteRestController {

    private final UniversiteService universiteService;

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.createUniversite(universite);
    }

    @GetMapping("/all")
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversite();
    }

    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable("id") Long id) {
        return universiteService.getUniversite(id);
    }

    @PutMapping("/{id}")
    public Universite updateUniversite(@PathVariable("id") Long id, @RequestBody Universite updatedUniversite) {
        return universiteService.updateUniversite(updatedUniversite);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable("id") Long id) {
        universiteService.deleteUniversite(id);
    }

    @PostMapping("/affecter-foyer/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAUniversite(@PathVariable("idFoyer") Long idFoyer, @PathVariable("nomUniversite") String nomUniversite) {
        return universiteService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }

    @PostMapping("/{idUniversite}/desaffecter-foyer")
    public ResponseEntity<Universite> desaffecterFoyerAUniversite(@PathVariable("idUniversite") long idUniversite) {
        Universite universiteDesaffectee = universiteService.desaffecterFoyerAUniversite(idUniversite);
        return ResponseEntity.ok(universiteDesaffectee);
    }
}