package Libro;

public final class Libro {
    String Isbn,Titolo,Autore;
    int Copie;

    public Libro(String Isbn, String Titolo, String Autore, int Copie) {
        if(Copie<0)throw new RuntimeException("Copie");
        this.Isbn = Isbn;
        this.Titolo = Titolo;
        this.Autore = Autore;
    }

    public boolean isDisponibile(){
        return Copie>0;
    }

}
