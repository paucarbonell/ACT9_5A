package ACT9_5A;

/**
 *
 * @author Pau
 */
public abstract class Tarjeta {
    protected String codiTarjeta;
    protected double comisUs;
    protected double importMaximCaixer;
    protected double importMaximCompra;

    public Tarjeta(String codiTarjeta, double comisUs, double importMaximCaixer, double importMaximCompra) {
        this.codiTarjeta = codiTarjeta;
        this.comisUs = comisUs;
        this.importMaximCaixer = importMaximCaixer;
        this.importMaximCompra = importMaximCompra;
    }
 
    public String getCodiTarjeta() {
        return codiTarjeta;
    }

    public void setCodiTarjeta(String codiTarjeta) {
        this.codiTarjeta = codiTarjeta;
    }

    public double getComisUs() {
        return comisUs;
    }

    public void setComisUs(double comisUs) {
        this.comisUs = comisUs;
    }

    public double getImportMaximCaixer() {
        return importMaximCaixer;
    }

    public void setImportMaximCaixer(double importMaximCaixer) {
        this.importMaximCaixer = importMaximCaixer;
    }

    public double getImportMaximCompra() {
        return importMaximCompra;
    }

    public void setImportMaximCompra(double importMaximCompra) {
        this.importMaximCompra = importMaximCompra;
    }
    
    
}
