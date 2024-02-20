package ACT9_5A;

/**
 *
 * @author Pau
 */
public class Credit extends Tarjeta{
    protected double importEnNegatiu;

    public Credit(String codiTarjeta, double comisUs, double importMaximCaixer, double importMaximCompra) {
        super(codiTarjeta, comisUs, importMaximCaixer, importMaximCompra);
    }

    public double getImportEnNegatiu() {
        return importEnNegatiu;
    }

    public void setImportEnNegatiu(double importEnNegatiu) {
        this.importEnNegatiu = importEnNegatiu;
    }
 
    
}
