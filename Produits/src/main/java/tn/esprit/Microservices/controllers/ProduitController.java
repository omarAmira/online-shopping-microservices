package tn.esprit.Microservices.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Microservices.entities.Produit;
import tn.esprit.Microservices.services.IProduitService;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RequestMapping("/api/produit")
public class ProduitController {

    private IProduitService iProduitService;

    @PostMapping("/addProduit")
    public Produit addProduit(@RequestBody Produit p) {
        return iProduitService.addProduit(p);
    }

    @GetMapping("/getAllProduits")
    public List<Produit> getAllProduits() {
        return iProduitService.getAllProduits();
    }

    @PutMapping("/modifierProduit")
    public Produit updateProduit(@RequestBody Produit p) {
        return iProduitService.updateProduit(p);
    }

    @GetMapping("/getProduit/{idProduit}")
    public Produit findById(@PathVariable long idProduit) {
        return iProduitService.getProduitById(idProduit);
    }

    @DeleteMapping("/supprimerProduit/{idProduit}")
    public void deleteProduit(@PathVariable long idProduit) {
        iProduitService.deleteProduit(idProduit);
    }

}
