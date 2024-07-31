import org.testng.annotations.DataProvider;
import org.example.MuhasebeDepartmani;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class MuhasebeDataProvider {
    @DataProvider(name="calisanVerileri")
    public Object[][] calisanVerileri(){
        return new Object[][]{
                {"Ayşe Tüter",25,25,25*1675},
                {"Melih Kaya",29,25,25*1675+5*1000},
                {"Gamze Çolak",35,25,0}
        };
    }
    @Test(dataProvider = "calisanVerileri")
    public void testMuhasebe(String isim,int calisilangunsayisi,int temelalinangunsayisi,int beklenenMaas){
        MuhasebeDepartmani muhasebe =new MuhasebeDepartmani();
        muhasebe.setCalisilangunsayisi(calisilangunsayisi);
        muhasebe.setTemelalinangunsayisi(temelalinangunsayisi);
        muhasebe.Maashesabi(isim);

        int gercekMaas=muhasebe.getToplamMaas();
        assertEquals(isim + " için maaş hatalı hesaplandı.",gercekMaas,beklenenMaas);
    }

}
