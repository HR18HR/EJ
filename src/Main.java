import eserci2.Biglietto;
import prova.array.Arraylist;
public class Main {
    public static void main(String[] args) {
        Arraylist<Integer> arraylist = new Arraylist<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.remove(5);
       /* for(int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }*/
        System.out.println(arraylist.get(3));

    }
}