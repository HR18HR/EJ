package StudenteUniversitario;

public class Studente {
    String Nome,Cognome;
    int matricola,crediti,VotoInformatica,VotoMatematica,VotoFisica;

    public Studente(String Nome,String Cognome,int matricola,int crediti,int VotoInformatica,int VotoMatematica,int VotoFisica){
        if(Integer.valueOf(matricola).toString().length()<6)throw new IllegalArgumentException();
        if(crediti<0||VotoInformatica<0||VotoMatematica<0||VotoFisica<0)throw new IllegalArgumentException();
        this.Nome=Nome;
        this.Cognome=Cognome;
        this.matricola=matricola;
        this.crediti=crediti;
        this.VotoInformatica=VotoInformatica;
        this.VotoMatematica=VotoMatematica;
        this.VotoFisica=VotoFisica;
    }


    public int getMedia(){
        return (VotoFisica+VotoMatematica+VotoInformatica)/3;
    }

}
