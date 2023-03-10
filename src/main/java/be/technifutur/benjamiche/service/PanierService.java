package be.technifutur.benjamiche.service;

import be.technifutur.benjamiche.form.PanierForm;
import be.technifutur.benjamiche.model.dto.PanierDTO;
import org.springframework.security.core.Authentication;

public interface PanierService {

    void addSandwichToPanier(PanierForm panierForm, Authentication authentication);

    void removeSandwichFromPanier(long sandwichId, int quantity);

    PanierDTO getPanier(Authentication authentication);

    void validatePanier(Authentication authentication);


}
