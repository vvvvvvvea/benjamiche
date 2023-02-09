package be.technifutur.benjamiche.form;

import be.technifutur.benjamiche.model.entity.Panier;
import be.technifutur.benjamiche.model.entity.Sandwich;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;


@Data
@AllArgsConstructor
public class PanierForm {
    private long sandwichId;
    private int quantity;

    public Panier toEntity(){
        Panier panier = new Panier();
        Sandwich sandwich = new Sandwich();
        sandwich.setId( this.sandwichId );
        LinkedList<Sandwich> sandwiches = new LinkedList<>();
        sandwiches.add(sandwich);
        panier.setSandwiches(sandwiches);
        panier.setTotal(panier.getTotal() + sandwich.getPrice() * this.quantity);
        return panier;
    }
}
