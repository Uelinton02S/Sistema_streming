public class Documentario extends Conteudo {

    private String tema;

    public Documentario(String titulo, int duracao, int classificacaoIndicativa, String tema) {
        super(titulo, duracao, classificacaoIndicativa);
        this.tema = tema;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Classificação: " + classificacaoIndicativa + " anos");
        System.out.println("Documentário sobre: " + tema);
    }
}
