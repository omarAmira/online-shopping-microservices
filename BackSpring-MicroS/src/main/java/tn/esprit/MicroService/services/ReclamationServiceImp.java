package tn.esprit.MicroService.services;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.MicroService.entities.Reclamation;
import tn.esprit.MicroService.repositories.ReclamationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReclamationServiceImp implements IReclamationService  {

    private ReclamationRepository reclamationReposiory;

    public Reclamation addReclamation(Reclamation r) {
        return reclamationReposiory.save(r)  ;
    }

    @Override
    public List<Reclamation> getAllReclamations() {
        return  reclamationReposiory.findAll();
    }

    @Override
    public Reclamation getReclamationById(long idReclamation) {
        return reclamationReposiory.findById(idReclamation).orElse(null);
    }

    @Override
    public void deleteReclamation(long idReclamation) {
        reclamationReposiory.deleteById(idReclamation);
    }

    @Override
    public Reclamation updateReclamation(Reclamation r) {
        return reclamationReposiory.save(r);
    }


}
