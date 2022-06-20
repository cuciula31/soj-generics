import java.util.List;

public class PrimeNumbers <T extends Number>{

    //Declaram o un metoda ce returneaza boolean care verifica daca numerele sunt sau nu prime
    private boolean isPrime(T t){
        int current = t.intValue();

        if (current <= 1){
           return false;
        }else if (current == 2){
            return true;
        } else if (current%2==0) {
            return false;
        }
        for (int i = 3; i<=Math.sqrt(current);i+=2){
            if (current%i == 0) return false;
        }
        return true;
    }

    //Vom parcurge toate elementele listei si vom verifica daca numarul curent este prim.
    //Pentru cazul in care este prim vom afisa acest lucru, iar daca nu e vom afisa faptul ca numarul curent nu este prim.
    public void findPrimeNumber(List<T> list){
        for(T t : list){
            if (isPrime(t)){
                System.out.println(t.intValue() + " este prim");
            }else{
                System.out.println(t.intValue() + " nu este prim");
            }
        }
    }

}
