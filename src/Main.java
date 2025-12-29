import Nodo.*;

class Main {
    public static void main(String[] args) {
    Catena<Integer>catena=new Catena<Integer>();
    catena.Aggiungi(4);
    catena.Aggiungi(3);
    catena.Aggiungi(8);
    for(Nodo<Integer> i:catena){
        System.out.print(i);
        System.out.print("----");
        System.out.println(i.getProssimo());
    };


    }

}
