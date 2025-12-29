package Libro;

public class PrestitoLibro implements Prestito {
    String Lettore,data,Isbn;

    PrestitoLibro(String Lettore, String data,String Isbn){
        this.Lettore = Lettore;
        this.data = data;
        this.Isbn=Isbn;
    }
    @Override
    public String Isbn() {
        return Isbn;
    }
    @Override
    public String Nomelettore() {
        return Lettore;
    }


}
