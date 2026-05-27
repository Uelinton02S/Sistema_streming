public class Documentario extends Conteudo {
   private String tema;


   public Documentario(String titulo, int duracao, int classificacaoIndicativa, String tema) {
       super(titulo, duracao, classificacaoIndicativa);
       this.tema = tema;
   }


   @Override
   public void exibirDetalhes() {
       super.exibirDetalhes();
       System.out.println("Documentário sobre: " + tema);
   }


   public String getTema() { 
    return tema; 
}
   public void setTema(String tema) {
     this.tema = tema;
     }
}
