public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme("Vingadores", 150, 12, "Ação");
        Serie serie = new Serie("Stranger Things", 50, 16, 4, 8);
        Documentario documentario = new Documentario("Planeta Terra", 90, 10, "Natureza");

        filme.exibirDetalhes();
        filme.reproduzir();

        System.out.println();

        serie.exibirDetalhes();
        serie.reproduzir();

        System.out.println();

        documentario.exibirDetalhes();
        documentario.reproduzir();
    }
}
