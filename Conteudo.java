public abstract class Conteudo {


   // Atributos privados (Encapsulamento)
   private String titulo;
   private int duracao; // em minutos
   private int classificacaoIndicativa;


   // Construtor
   public Conteudo(String titulo, int duracao, int classificacaoIndicativa) {
       this.titulo = titulo;
       this.duracao = duracao;
       this.classificacaoIndicativa = classificacaoIndicativa;
   }


   // Método para ser reaproveitado pelas subclasses
   public void exibirDetalhes() {
       System.out.println("Título: " + titulo);
       System.out.println("Duração: " + duracao + " minutos");
       System.out.println("Classificação: " + classificacaoIndicativa + " anos");
   }


   // Método concreto
   public void reproduzir() {
       System.out.println("Reproduzindo: " + titulo);
   }


   // Getters e Setters (Acesso seguro)
   public String getTitulo() {
     return titulo;
     }
   public void setTitulo(String titulo) { 
    this.titulo = titulo; 
}


   public int getDuracao() {
     return duracao; 
    }
   public void setDuracao(int duracao) { 
    this.duracao = duracao;
 }
}

