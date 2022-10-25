package fit.domain;

public class Autor {
    private String nome;
    private String genero;
    
    public Autor(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }
    

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getgenero() {
        return genero;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }
}
