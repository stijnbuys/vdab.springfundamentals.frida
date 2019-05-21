package be.vdab.frida.be.vdab.frida.domain;

public class Saus
{
    private long nummer;
    private String naam;
    private  String[] ingredienten;

    //CONSTRUCTORS
    public Saus(long nummer, String naam, String[] ingredienten) {
        this.nummer = nummer;
        this.naam = naam;
        this.ingredienten = ingredienten;
    }

    //GETTERS & SETTERS
    public long getNummer() {
        return nummer;
    }

    public String getNaam() {
        return naam;
    }

    public String[] getIngredienten() {
        return ingredienten;
    }
}
