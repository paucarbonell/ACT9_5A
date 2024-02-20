package ACT9_5A;

/**
 *
 * @author Pau
 */
public class Deposit extends ProducteBancari{
    protected int nombrePeriodes;

    public Deposit(int nombrePeriodes, String codiProducte, String nom, double importContractat, double interesPeriode) {
        super(codiProducte, nom, importContractat, interesPeriode);
        this.nombrePeriodes = nombrePeriodes;
    }

    @Override
    public double calculaRemuneracio(){
        double remuneracio;       
        remuneracio = super.getImportContractat() * super.getInteresPeriode() * this.nombrePeriodes;
        return remuneracio;
    }
    
    @Override
    public String toString(){
        return super.toString() + ". Nombre periodes: " + this.nombrePeriodes;
    }
    public int getNombrePeriodes() {
        return nombrePeriodes;
    }

    public void setNombrePeriodes(int nombrePeriodes) {
        this.nombrePeriodes = nombrePeriodes;
    }
    
    
}
