package prova.array;
public class Arraylist <T>{
    private int sz=0;
    private T[] data= (T[]) new Object[100];

    public void add(T item){
        data[sz++]=item;
    }
    public void remove(T item){
        for(int i=0;i<sz;i++){
            if(data[i]!=null&&data[i].equals(item)){
                for(int j=i;j<sz;j++){
                    data[j]=data[j+1];
                }
            }
        }
        T[] aux=(T[]) new Object[sz-1];
        for(int j=0;j<sz-1;++j){
            aux[j]=data[j];
        }
        data=aux;
        sz=sz-1;

    }
    public int size(){
        return sz;
    }
    public T get(int index){
        return data[index];
    }
}
