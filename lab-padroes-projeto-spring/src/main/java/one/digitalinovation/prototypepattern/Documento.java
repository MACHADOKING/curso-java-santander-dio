package one.digitalinovation.prototypepattern;

public class Documento implements Cloneable {
    private String titulo;
    private String conteudo;

    // Construtor
    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    // Método clone para criar uma cópia profunda do documento
    @Override
    public Documento clone() throws CloneNotSupportedException {
        return new Documento(this.titulo, this.conteudo);
    }

    // Getter para o atributo titulo
    public String getTitulo() {
        return titulo;
    }

    // Setter para o atributo titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para o atributo conteudo
    public String getConteudo() {
        return conteudo;
    }

    // Setter para o atributo conteudo
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
