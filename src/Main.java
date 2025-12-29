import Nodo.*;

class Main {
    public static void main(String[] args) {
    Catena<Integer>catena=new Catena<Integer>();
    catena.Aggiungi(4);
    catena.Aggiungi(3);
    catena.Aggiungi(8);
    for(Integer i:catena){
        System.out.println(i);
    };


    }

}
