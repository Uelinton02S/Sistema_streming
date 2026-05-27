import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
      
        ArrayList<Conteudo> conteudos = new ArrayList<>();


        conteudos.add(new Filme("Vingadores", 150, 12, "Ação"));
        conteudos.add(new Serie("Stranger Things", 50, 16, 4, 8));
        conteudos.add(new Documentario("Planeta Terra", 90, 10, "Natureza"));

        System.out.println("--- EXIBINDO DETALHES DOS CONTEÚDOS ---");
        

        for (Conteudo conteudo : conteudos) {
            conteudo.exibirDetalhes();
            
            conteudo.reproduzir(); 
            
            System.out.println("---------------------------------------");
        }
    }
}
