package tn.esprit.manairaed4sim1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.manairaed4sim1.entites.Bloc;
import tn.esprit.manairaed4sim1.services.BlocService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("bloc")
@RestController
public class BlocRestController {

    private final BlocService blocService;

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.createBloc(bloc);
    }

    @GetMapping("/all")
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBloc();
    }

    @GetMapping("/{id}")
    public Bloc getBlocById(@PathVariable("id") Long id) {
        return blocService.getBloc(id);
    }

    @PutMapping("/{id}")
    public Bloc updateBloc(@PathVariable("id") Long id, @RequestBody Bloc updatedBloc) {
        return blocService.createBloc(updatedBloc);
    }

    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable("id") Long id) {
        blocService.deleteBloc(id);
    }
}