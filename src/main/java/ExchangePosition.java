import java.lang.reflect.Array;

public class ExchangePosition<T> {


    //Vom declara o metoda generica care interschimba pozitiile a 2 elemente dintr-un array.
    //Se va folosi metoda clasica si simpla, unde folosim o variabila auxiliara.
    public void exchange(T[] array, int indexOfFirst, int indexOfSecond){
        T aux;
        aux = array[indexOfFirst];
        array[indexOfFirst] = array[indexOfSecond];
        array[indexOfSecond] = aux;
    }

}
