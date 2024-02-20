package ACT9_5A;

import java.util.ArrayList;

/**
 *
 * @author Pau
 */
public class CompteEstalvis extends ProducteBancari{
    protected double comisMantCompte;
    protected ArrayList<Tarjeta> tarjetes;

    public CompteEstalvis(double comisMantCompte, ArrayList<Tarjeta> tarjetes, String codiProducte, String nom, double importContractat, double interesPeriode) {
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisMantCompte = comisMantCompte;
        this.tarjetes = tarjetes;
    }

    @Override
    public double calculaRemuneracio(){
        double remuneracio = 0;
        for (Tarjeta t : tarjetes) {
            remuneracio -= (comisMantCompte - t.getComisUs());
        }
        return remuneracio; 
    }
    
    @Override
    public String toString(){
        return super.toString() + ". Comissió manteniment: " + this.comisMantCompte;
    }
}
