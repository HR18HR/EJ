package Nodo;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Catena <T> implements Iterable<Nodo<T>>{
    Nodo<T> testa= null;


    public void Aggiungi(T valore){
        Nodo<T> k= new Nodo<T>(valore);
        if(testa!=null) {
            Nodo<T> n= testa;
            while (n.prossimo != null) {
                n = n.prossimo;
            }
            n.prossimo = k;
            k.prossimo = null;
        }
        else {
            k.prossimo=null;
            testa=k;
        }
    }
    public Nodo<T> getCoda(){
        Nodo<T> c=testa;
        while(c.prossimo!=null){
            c=c.prossimo;
        }
        return c;

    }

    public Nodo<T> Contains(T valore) {
        Nodo<T> n =testa;
        while(n.prossimo!=null||!(n.valore.equals(valore))){
            n=n.prossimo;
        }
        return n;
    }

    public int  size(){
        Nodo<T>c=testa;
        int i=0;
        while(c!=null){
            c=c.prossimo;
            ++i;
        }
        return i;
    }
    public void Clear(){
       while(testa!=null){
           Nodo<T> c=testa.prossimo;
           testa.prossimo=null;
           testa=c;
       }
    }

    @Override
    public  Iterator<Nodo<T>> iterator() {
        return new Iterator<Nodo<T>>() {
            Nodo<T> c=testa;
            @Override
            public boolean hasNext() {
                return c!=null;
            }
            @Override
            public Nodo<T> next() {
                    Nodo<T>valore=c;
                    c=c.prossimo;
                    return valore;
            }
        };
    }

}
