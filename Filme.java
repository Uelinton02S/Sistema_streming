public class Filme extends Conteudo {
   private String genero;


   public Filme(String titulo, int duracao, int classificacaoIndicativa, String genero) {
       super(titulo, duracao, classificacaoIndicativa);
       this.genero = genero;
   }


   @Override
   public void exibirDetalhes() {
       super.exibirDetalhes(); 
       System.out.println("Gênero: " + genero);
   }

   public String getGenero() { 
    return genero;
    }
   public void setGenero(String genero) {
     this.genero = genero;
     }
}
