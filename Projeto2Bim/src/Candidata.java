public class Candidata {

    public Candidata(int id, String nome, int simpatia, int elegancia, int beleza) {
        this.id = id;
        this.nome = nome;
        this.simpatia = simpatia;
        this.elegancia = elegancia;
        this.beleza = beleza;
        this.setNota();
    }


    private int id;
    private String nome;
    private int simpatia;
    private int elegancia;
    private int beleza;
    private double nota;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSimpatia() {
        return this.simpatia;
    }

    public void setSimpatia(int simpatia) {
        this.simpatia = simpatia;
    }

    public int getElegancia() {
        return this.elegancia;
    }

    public void setElegancia(int elegancia) {
        this.elegancia = elegancia;
    }

    public int getBeleza() {
        return this.beleza;
    }

    public void setBeleza(int beleza) {
        this.beleza = beleza;
    }

    public double getNota(){
        return this.nota;
    }
    public void setNota(){
        this.nota = (this.simpatia+(this.elegancia * 3)+(this.beleza*4)) / 8f;
    }

}
