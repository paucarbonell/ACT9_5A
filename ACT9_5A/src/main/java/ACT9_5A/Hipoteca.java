package ACT9_5A;

/**
 *
 * @author Pau
 */
public class Hipoteca extends ProducteBancari{
    protected double comisApertura;
    protected int nombrePeriodes;

    public Hipoteca(double comisApertura, int nombrePeriodes, String codiProducte, String nom, double importContractat, double interesPeriode) {
        super(codiProducte, nom, importContractat, interesPeriode);
        this.comisApertura = comisApertura;
        this.nombrePeriodes = nombrePeriodes;
    }

    @Override
    public double calculaRemuneracio(){
        double remuneracio = 0;       
        remuneracio = remuneracio - ((super.getImportContractat() * super.getInteresPeriode() * this.nombrePeriodes) -comisApertura); 
        return remuneracio;
    }
    
    @Override
    public String toString(){
        return super.toString()+ ". Comissió apertura: " + this.comisApertura + ". Nombre periodes: " + this.nombrePeriodes;
    }
    
    public double getComisApertura() {
        return comisApertura;
    }

    public void setComisApertura(double comisApertura) {
        this.comisApertura = comisApertura;
    }

    public int getNombrePeriodes() {
        return nombrePeriodes;
    }

    public void setNombrePeriodes(int nombrePeriodes) {
        this.nombrePeriodes = nombrePeriodes;
    }  
}
