package day24accessmodifiersinheritance;

public class Student {
    public String name="tom Hanks";
    String stdId="TH2023HU12001";
    protected int accountNum=76512345;
    private int balance=123000;
    /*
    //name herkes tarafindan bilinebilir, o yuzden public yaptim
    public String name="Tom Hanks";

    //student Id okul yonetimindeki insanlar tarafindan bilinebilir, o yuzden "default" yaptim.
    String stdId="TH2023HU12001";

    //account number, ben ,esim ve cocuklarim tarafindan bilinebilir, o yuzden "protected" yaptim.
    int AccountNum=76512345;

    //hesabimdaki para miktari sadece benim tarafimdan bilinmelidir, bu yuzden "private" yaptim
    private int balance=123000;

    // myStd.stdId      //default olan variable'lar ayni "Package" adindan ulasilabilir oldugundan bu class da gorulebilir
// myStd.accountNumber // ayni package ile bir grup ve cocuklari tarafindan gorulebilir oldugu icin gorulur
// "balance" Private oldugundan baska class da gorulemez .Student classin icindeki balance variable a bu class dan ulasamayiz.


    Access Modifier :Variable lara, class lara,  method lara ulasmayi duzenler


Access modifierlar genisten dara dogru;
        public > protected > default > private
Class'lar protected ve private olamazlar. Sadece public ve default olabilirler.

Access Modifier'lar ne ise yarar?
    -Variablelara methodlara classlara ulasmayi duzenler.
Kac tane access modifier var ? 4. public > protected > default > private

publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
private

protected ile defaultun farki nedir ?
Package disina ciktigimizda childlardan protectedlara ulasabiliriz. Defaultlarda ulasamayiz.

1)Access modifier'lar genis'den dara; public > protected > default > private
2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
3)Access Modifier'lar ne ise yarar?
        Variablelara methodlara classlara ulasmayi duzenler.
4)Kac tane access modifier var ?
        public > protected > default > private
        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
        v) "protected" ile "default"un farki nedir ?
           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.


    */
}
