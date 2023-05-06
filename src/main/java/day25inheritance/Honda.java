package day25inheritance;

public class Honda extends Car {

    public Honda(){
        this("R8", 2023);
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        super("Audi");
        System.out.println("Honda 2: " + model + " - " + year);
    }

}
/*
    super(); ne ise yarar ?
    Note: "super()" parent'teki constractor'i calistirmaya yarar.
        "super()" keyword'unu parent'taki parametresi belli olan constractur'lar
    icin kesinlikle kullanılmalıdır.

 */