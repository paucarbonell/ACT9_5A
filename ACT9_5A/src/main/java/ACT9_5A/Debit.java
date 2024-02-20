package ACT9_5A;

/**
 *
 * @author Pau
 */
public class Debit extends Tarjeta{
    protected double importCompraMinim;

    public Debit(double importCompraMinim, String codiTarjeta, double comisUs, double importMaximCaixer, double importMaximCompra) {
        super(codiTarjeta, comisUs, importMaximCaixer, importMaximCompra);
        this.importCompraMinim = importCompraMinim;
    }

    public double getImportCompraMinim() {
        return importCompraMinim;
    }

    public void setImportCompraMinim(double importCompraMinim) {
        this.importCompraMinim = importCompraMinim;
    }
}
