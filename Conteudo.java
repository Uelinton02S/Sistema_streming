// Classe abstrata Conteudo
public abstract class Conteudo {

    // Atributos
    protected String titulo;
    protected int duracao; // em minutos
    protected int classificacaoIndicativa;

    // Construtor
    public Conteudo(String titulo, int duracao, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    // Método abstrato
    public abstract void exibirDetalhes();

    // Método concreto
    public void reproduzir() {
        System.out.println("Reproduzindo: " + titulo);
    }
}
