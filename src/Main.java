import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Logica de Programação");
        curso1.setDescricao("Fundamentos sobre algoritmos e como construi-los");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Titulo mentoria");
        mentoria1.setDescricao("Descricao mentoria");
        mentoria1.setData(LocalDate.of(2001, 8, 9));

        System.out.println();
        System.out.println(curso1);
        System.out.println();
        System.out.println(mentoria1);
    }
}
