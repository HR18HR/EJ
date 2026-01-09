package Fibonacci;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{
    private int size=0;
    private int []list;
    public Fibonacci(int size){
        this.size=size;
        list=new int[size];
        for(int i=0;i<list.length;i++){
            list[i]=i;

        }
    }
    private int  fib(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        else return fib(n - 1)+fib(n - 2);
    }


    @Override
    public Iterator<Integer> iterator() {
            return new Iterator<Integer>(){
                int res=0;
                int res_1=1;
                int index=0;
                @Override
                public boolean hasNext(){
                    return index<size;
                }
                @Override
                public Integer next(){
                   return fib(index++);
                }
            };

    }
}

