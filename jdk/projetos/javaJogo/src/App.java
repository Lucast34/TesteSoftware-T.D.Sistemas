public class App {
    public static void main(String[] args) throws Exception {
        
        Genero gen1 = new Genero("Terror", "Jogos com foco em suspense para amendrondar e assustar o jogador");
        
        System.out.println(gen1.getNome());

        System.out.println(gen1.getDescricao());

        Genero gen2 = new Genero("Visual Novel","Visual novel, são jogos com foco em narrativo, podendo ou não conter gameplay");
    }
}
