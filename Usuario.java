import java.util.ArrayList;
import java.util.List;


public class Usuario {
   private String nome;
   private String email;
   private List<Conteudo> favoritos; // Polimorfismo: aceita Filme, Serie ou Documentario


   // Construtor
   public Usuario(String nome, String email) {
       this.nome = nome;
       this.email = email;
       this.favoritos = new ArrayList<>(); // Inicializa a lista vazia
   }


   // Métodos de negócio
   public void adicionarFavorito(Conteudo conteudo) {
       this.favoritos.add(conteudo);
       System.out.println(conteudo.getTitulo() + " adicionado aos favoritos de " + this.nome + "!");
   }


   public void verFavoritos() {
       System.out.println("--- Favoritos de " + this.nome + " ---");
       if (favoritos.isEmpty()) {
           System.out.println("Nenhum conteúdo favoritado ainda.");
       } else {
           for (Conteudo c : favoritos) {
               System.out.println("- " + c.getTitulo() + " (" + c.getClass().getSimpleName() + ")");
           }
       }
   }


   // Getters e Setters
   public String getNome() { 
    return nome; 
}
   public void setNome(String nome) {
     this.nome = nome; 
    }


   public String getEmail() { 
    return email;
 }
   public void setEmail(String email) { 
    this.email = email;
 }


   public List<Conteudo> getFavoritos() { 
    return favoritos; 
  }
}
