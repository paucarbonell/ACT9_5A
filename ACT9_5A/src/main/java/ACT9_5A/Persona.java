package ACT9_5A;

import java.util.ArrayList;

/**
 *
 * @author Pau
 */
public class Persona {
    protected String nom;
    protected int edat;
    protected ArrayList<ProducteBancari> productesBancaris;

    public Persona(String nom, int edat, ArrayList<ProducteBancari> productesBancaris) {
        this.nom = nom;
        this.edat = edat;
        this.productesBancaris = productesBancaris;
    }  

    @Override
    public String toString(){
        return "Nom: " + this.nom + ". Edat: " + this.edat + ". Remuneració: " + calculaRemuneracioTotal();
    }
    
    public double calculaRemuneracioTotal() {
        double remuneracio = 0;
        for (ProducteBancari p : productesBancaris){
            remuneracio = remuneracio + p.calculaRemuneracio();
        }
        return remuneracio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public ArrayList<ProducteBancari> getProductesBancaris() {
        return productesBancaris;
    }

    public void setProductesBancaris(ArrayList<ProducteBancari> productesBancaris) {
        this.productesBancaris = productesBancaris;
    }   
}
