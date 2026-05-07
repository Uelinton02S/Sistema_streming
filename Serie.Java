public class Serie extends Conteudo {

    private int temporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, int duracao, int classificacaoIndicativa,
                 int temporadas, int episodiosPorTemporada) {

        super(titulo, duracao, classificacaoIndicativa);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Classificação: " + classificacaoIndicativa + " anos");
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por temporada: " + episodiosPorTemporada);
    }
}
