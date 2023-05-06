package day21statickeyword;

public class StdRunner {
    public static void main(String[] args) {
//Class member staticke ona sadece class ismi yazarak ulasabiliriz.
        System.out.println(Student.stdName);
//age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz.
        Student std1 = new Student();
        System.out.println(std1.age);
        Student std2 = new Student();



    }

}
