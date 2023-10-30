package tn.esprit.manairaed4sim1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.manairaed4sim1.entites.Chambre;
import tn.esprit.manairaed4sim1.services.ChambreService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("chambre")
@RestController
public class ChambreRestController {

    private final ChambreService chambreService;

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.createChambre(chambre);
    }

    @GetMapping("/all")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambre();
    }

    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable("id") Long id) {
        return chambreService.getChambre(id);
    }

    @PutMapping("/{id}")
    public Chambre updateChambre(@PathVariable("id") Long id, @RequestBody Chambre updatedChambre) {
        return chambreService.updateChambre(updatedChambre);
    }

    @DeleteMapping("/{id}")
    public void deleteChambre(@PathVariable("id") Long id) {
        chambreService.deleteChambre(id);
    }
}