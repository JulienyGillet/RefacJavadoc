import java.util.ArrayList;

public class Assignatura {
    public long id = 0;
    private int hores = 0;
    public int credits = 0;
    private boolean disponible = false;
    private String nom = "";

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getHores() {
        return hores;
    }

    public int getCredits() {
        return credits;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }

}
