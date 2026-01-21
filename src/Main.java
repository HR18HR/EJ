

import javax.swing.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main  {

            static public interface F<T,K>{
                K map(T e);
            }


    static <A, B> Iterator<B> map2(Iterator<A> it, Function<A, B> f){
                return new Iterator<B>() {
                    @Override
                    public boolean hasNext() {
                        return it.hasNext();
                    }
                    @Override
                    public B next() {
                        return f.apply(it.next());
                    }
                };
    }


    public static  void main(String[] args){

        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        Iterator<Integer> k=map2(lista.iterator(), (e)->{return e+8;});
        while(k.hasNext()){
            System.out.println(k.next());
        }

    }


            }


