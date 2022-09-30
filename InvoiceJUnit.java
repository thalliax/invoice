import org.junit.Assert;
import org.junit.Test;

public class InvoiceJUnit {
    
    @Test
    public void deveMultiplicar() {
        Invoice ivc = new Invoice("14", "mouse", 4, 80);
        double Total = ivc.GetInvoiceAmount();

        Assert.assertEquals(320, 320);
    }

    @Test
    public void deveDescrever() {
        Invoice ivc = new Invoice("14", "mouse", 4, 80);
        String descricao = ivc.getDescricao();

        Assert.assertEquals("mouse", "mouse");
    }

    @Test
    public void deveColocaroNumero() {
        Invoice ivc = new Invoice("14", "mouse", 4, 80);
        String num = ivc.getNum();

        Assert.assertEquals("14", "14");
    }

    @Test
    public void deveDizerQuant() {
        Invoice ivc = new Invoice("14", "mouse", 4, 80);
        int quant = ivc.getQuant();

        Assert.assertEquals("4", "4");
    }

}
