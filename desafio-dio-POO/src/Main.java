import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descricao de curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("descricao de curso javascript");
        curso2.setCargaHoraria(14);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descricao de mentoria java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(mentoria1);
//        System.out.println(curso1);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrica("Descrevendo o bootcamp Java dev");
        Bootcamp.getConteudos().add(curso1);
        Bootcamp.getConteudos().add(curso2);
        Bootcamp.getConteudos().add(mentoria1);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Anderson: " +devAnderson.getConteudosInscritos());
    }
}