package org.example;

public class MuhasebeDepartmani {
    int calisilangunsayisi;
    int temelalinangunsayisi = 25;
    int gunlukmaas = 1675;
    int primmaas = 1000;
    int Toplammaas;

    void Maashesabi(String kisi) {
        int Temelmaas = gunlukmaas * temelalinangunsayisi;
        if (calisilangunsayisi > temelalinangunsayisi && calisilangunsayisi <= 31) {
            Toplammaas = Temelmaas + ((calisilangunsayisi - temelalinangunsayisi) * primmaas);
            System.out.println(kisi + " bu ay prime hak kazanmıştır ve " + Toplammaas + " TL maaş alacaktır.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
        }
        else if (calisilangunsayisi <= temelalinangunsayisi && calisilangunsayisi > 0) {
            Toplammaas = Temelmaas;
            System.out.println(kisi + " bu ay prim elde etmemiştir ve " + Toplammaas + " TL maaş alacaktır.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
        }
        else {
            String uyari= calisilangunsayisi<=0 || calisilangunsayisi>31 ?(" adlı çalısanın çalışılan gün sayısı 1'den küçük veya 31'den büyük girilmiştir,hesaplama yapılamaz."):("İstenilen aralıkta veri girişi yapılmıştır");
            System.out.println(kisi+uyari);
        }
    }
}



