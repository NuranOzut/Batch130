package advanced_practice.practice07;

public class Sirket {

    static int kasa;
    int depButcesi;

    public void kasadanButceyeParaAl(int alinacakPara){
        depButcesi+=alinacakPara;
        kasa-=alinacakPara;
        System.out.println("kasadan "+alinacakPara+ " lira alindi");
    }

    public void paraKazan (int kazanilanPara){
        kasa+=kazanilanPara;
        System.out.println(kazanilanPara+" lira kazanildi");
    }

    public static void kasadanParaHarca(int harcananPara){
        kasa-=harcananPara;
    }

}
