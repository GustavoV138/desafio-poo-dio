import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Logica de Programação");
        curso1.setDescricao("Fundamentos sobre algoritmos e como construi-los");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Collections");
        curso2.setDescricao("Descricao Collections");
        curso2.setCargaHoraria(8);

        Curso curso3 = new Curso();
        curso3.setTitulo("SpringBoot");
        curso3.setDescricao("Descricao SpringBoot");
        curso3.setCargaHoraria(8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Titulo mentoria");
        mentoria1.setDescricao("Descricao mentoria");
        mentoria1.setData(LocalDate.of(2001, 8, 9));


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java/Spring Bootcamp");
        bootcamp.setDescricao("Um bootcamp java e spring");
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Gustavo");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        System.out.println("Conteudos inscritos dev1: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos dev1: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("---------");

        Dev dev2 = new Dev();
        dev2.setNome("Papel");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println("Conteudos inscritos dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
