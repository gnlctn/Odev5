import org.example.MuhasebeDepartmani;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.nio.charset.Charset;
import java.util.Random;


public class MuhasabeTestng {
    MuhasebeDepartmani muhasebe = new MuhasebeDepartmani();
    MuhasebeDepartmani muhasebe1=new MuhasebeDepartmani();
    @BeforeClass
    public void beforeClass(){
        muhasebe.setCalisilangunsayisi(25);
        muhasebe.setTemelalinangunsayisi(25);

        muhasebe1.setCalisilangunsayisi(30);
        muhasebe1.setTemelalinangunsayisi(25);
    }

    @Test
    public void testCustomerMaas() {
        muhasebe.Maashesabi("Ayşe Tüter");
        assertEquals(muhasebe.getToplamMaas(),41875 );

        muhasebe1.Maashesabi("Melih Kaya");
        assertEquals(muhasebe1.getToplamMaas(),46875 );
    }

}
