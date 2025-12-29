package Nodo;

public class Nodo<T>{
    T valore;
    Nodo<T> prossimo;
    public Nodo(T valore){
        this.valore = valore;
    }
    public T getValore() {
        return valore;
    }

}
