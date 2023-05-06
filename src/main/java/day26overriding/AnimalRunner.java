package day26overriding;
public class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();
        myCat.drink();
    }
}

// override yapip eat methodunu kedilere uyarlamazsak Animals eat yazar.
// Override ettik Cats eat yazdi. Daha guzel ve duzenli oldu.
// Override edilen methodlarin orjinalleri artik obje olusturulan classlar tarafindan kullanilamaz.
// Ama diger classlar orjinal methodu kendi classlarinda override edilmedikleri surece kullanmaya devam eder.

// @ ile baslayan override Annotation'i denir.Ne ise yarar method tepesine koyarsaniz Java override kurallarini kontrol eder.
// Eger kurallar ihlal edilmis ise hata verir.
