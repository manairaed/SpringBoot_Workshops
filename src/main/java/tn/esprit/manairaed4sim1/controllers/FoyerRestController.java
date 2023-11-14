package tn.esprit.manairaed4sim1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.manairaed4sim1.entites.Foyer;
import tn.esprit.manairaed4sim1.services.FoyerService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("foyer")
@RestController
public class FoyerRestController {

    private final FoyerService foyerService;

    @PostMapping("/add")
    public Foyer addFoyer (@RequestBody Foyer f){
        return foyerService.createFoyer(f);
    }

    @GetMapping("/all")
    public List<Foyer> getAllFoyer() {
        return foyerService.getAllFoyer();
    }

    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable("id") Long id) {
        return foyerService.getFoyer(id);
    }

    @PutMapping("/{id}")
    public Foyer updateFoyer(@PathVariable("id") Long id, @RequestBody Foyer updatedFoyer) {
        return foyerService.updateFoyer(updatedFoyer);
    }

    @DeleteMapping("/{id}")
    public void deleteFoyer(@PathVariable("id") Long id) {
        foyerService.deleteFoyer(id);

    }

    @PostMapping("/ajouter-et-affecter")
    public ResponseEntity<Foyer> ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer,
                                                                   @RequestParam("idUniversite") long idUniversite) {
        Foyer foyerAjoute = foyerService.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
        return ResponseEntity.ok(foyerAjoute);
    }

}
