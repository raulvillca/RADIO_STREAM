package services.crm.com.mcradio.model;

/**
 * Created by Raul on 30/04/16.
 */
public class Item {
    private int id;
    private String locutor;
    private String pais;
    private String genero;
    private String horario;
    private String cancion;
    private String acercaDe;
    private String src;
    private boolean favourite;

    public Item(String locutor, String pais, String genero, String horario, String cancion, String acercaDe, String src) {
        this.locutor = locutor;
        this.pais = pais;
        this.genero = genero;
        this.horario = horario;
        this.cancion = cancion;
        this.acercaDe = acercaDe;
        this.src = src;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocutor() {
        return locutor;
    }

    public void setLocutor(String locutor) {
        this.locutor = locutor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
