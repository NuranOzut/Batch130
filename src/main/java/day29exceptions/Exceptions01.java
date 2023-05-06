package day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        Object obj = 70;
        try{
            String str = (String) obj;
            System.out.println(str);
        }catch (ClassCastException e){
            System.out.println("Her data type i her data type a cevrilmez");
        }



        //Birbirine donusturulemeyen data type larini donusturmekte
        //israr ederseniz ClassCastException alirsiniz
        //Java byte, short, int, long, float, and double (primitive'ler arasinda) arasinda casting yapabilir.
        // Ama Non-primitivleri ceviremez.
        //Bunu yapmaya calisirsaniz ClassCastException (Run Time Exception) alirsiniz.



    }
}
