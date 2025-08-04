import br.com.jkalango.dto.Genero;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args)throws Exception{

        List<Genero> listaGenero = new ArrayList<>();

        Genero gen1 = new Genero("GenresTest", "DescTest");
        Genero gen2 = new Genero("Rpg", "DescTest");
        Genero gen3 = new Genero("Rpg", "DescTest");

        //add
        listaGenero.add(gen1);
        listaGenero.add(new Genero("Shooter","Test"));

        System.out.println(listaGenero);

        //Looping, showing elements in the list

        for (Genero genero : listaGenero) {

            System.out.format(
                "Nome:%s %nDescricao: %s %n", 
                    genero.getNome(),
                        genero.getDescricao());
        }
        // remove

        // update
        
        // alter

    }    
}
