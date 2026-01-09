package HashTable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class HashTable<K,V>implements Iterable<V> {
    private ArrayList<Coppia<K,V>>[] lista;
    public HashTable(int size){
        lista=new ArrayList[size];
        for(int i=0;i<size;i++){
            lista[i]=new ArrayList<Coppia<K,V>>();
        }
    }

    public void clear(){
        for (int i =0;i<lista.length;i++){
            lista[i].clear();
        }
        lista=null;
    }
    public Coppia<K,V> find(V value){
        for(int i=0;i<lista.length;i++){
            for(Coppia<K,V> c:lista[i]){
                if(c.getValue().equals(value))return c;
            }
        }
        return null;
    }

    public void add(Coppia<K,V> elm){
        lista[Math.abs(elm.getKey().hashCode()%lista.length)].add(elm);
    }

      @Override
    public Iterator<V> iterator() {

            return  new Iterator<V>() {
                int i=0;
                int k=0;
                @Override
                public boolean hasNext() {
                   while(i<lista.length){
                       while(k<lista[i].size()){
                           return true;
                       }
                       k=0;
                       i++;
                   }
                   return false;
                }
                @Override
                public V next() {
                    return lista[i].get(k++).getValue();
                }
            };

      }

}
