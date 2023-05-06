package Gulce.miniproje.biletFiyatHesaplama;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    public String numberPlate;
    public List<String> seats = new ArrayList<>();

    public Bus(String plaka,List<String> seats){
        this.numberPlate=plaka;
        this.seats=seats;

    }
}

