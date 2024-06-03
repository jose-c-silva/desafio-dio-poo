import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Um curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Js");
        curso2.setDescricao("Um curso de Js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Uma mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev();
        devJose.setNome("José Antônio");
        devJose.inscreverBootcamp(bootcamp);

        System.out.println(devJose.getConteudosInscritos());
        System.out.println(devJose.getConteudosConcluidos());
        System.out.println(devJose.calcularTotalXp());

        devJose.progredir();

        System.out.println(devJose.getConteudosInscritos());
        System.out.println(devJose.getConteudosConcluidos());
        System.out.println(devJose.calcularTotalXp());
    }
}
