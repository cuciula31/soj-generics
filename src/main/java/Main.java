import java.util.Arrays;
import java.util.List;

public class Main {

    private final static  ExchangePosition<Integer> exchangePosition = new ExchangePosition<>();
    private final static PrimeNumbers<Integer> prime = new PrimeNumbers<>();

    //Declaram un array cu care vom proba functionalitatea metodei de interschimbare
    private static Integer array[] = {1,2,3,4,5};
    //Declaram o lista de numere intregi cu care vom proba functionalitatea metodelor de verificare a numerelor prime
    private static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);



    public static void main(String[] args) {
        System.out.println("Interschimbare pozitii");
        exchangePosition.exchange(array,0,1);
        Arrays.asList(array).forEach(System.out::println);
        System.out.println("Outputul este cel asteptat, variablilele de pe pozitiile 0 si 1 si-au schimbat pozitiile intre ele");


        System.out.println("-----------------------------------------------------------------------------------");


        System.out.println("Verificare numere prime");
        prime.findPrimeNumber(numbers);
        System.out.println("Metoda functioneaza corespunzator");
    }
}
