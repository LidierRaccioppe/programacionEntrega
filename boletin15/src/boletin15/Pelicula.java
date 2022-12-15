package boletin15;
public class Pelicula extends Multimedia{
    private String actor;
    private String actris;
    public Pelicula(){
        super();
    }
    public Pelicula(String actor, String actris, String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
        this.actris = actris;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActris() {
        return actris;
    }

    public void setActris(String actris) {
        this.actris = actris;
    }

    @Override
    public String toString() {
        return super.toString() + "actor=" + actor + ", actris=" + actris;
    }
}