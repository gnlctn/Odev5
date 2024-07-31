package org.example;

public class MuhasebeDepartmani {
    int calisilangunsayisi;
    int temelalinangunsayisi = 25;
    int gunlukmaas = 1675;
    int primmaas = 1000;
    int ToplamMaas;


    public void setCalisilangunsayisi(int calisilangunsayisi){
        this.calisilangunsayisi=calisilangunsayisi;
    }
    public void setTemelalinangunsayisi(int temelalinangunsayisi){
        this.temelalinangunsayisi=temelalinangunsayisi;
    }
    public int getToplamMaas(){
        return ToplamMaas;
    }

    public void Maashesabi(String kisi) {
        int Temelmaas = gunlukmaas * temelalinangunsayisi;
        if (calisilangunsayisi > temelalinangunsayisi && calisilangunsayisi <= 31) {
            ToplamMaas = Temelmaas + ((calisilangunsayisi - temelalinangunsayisi) * primmaas);

        }
        else if (calisilangunsayisi <= temelalinangunsayisi && calisilangunsayisi > 0) {
            ToplamMaas = Temelmaas;
        }
        else {
            ToplamMaas=0;
        }
    }
}



