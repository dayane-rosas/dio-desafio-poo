package dio;

import java.time.LocalDate;

import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Conteudo;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso js.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de java.");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDayane = new Dev();
        devDayane.setNome("Dayane");
        devDayane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Roberta:" + devDayane.getConteudosInscritos());
        devDayane.progredir();
        devDayane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dayane:" + devDayane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dayane:" + devDayane.getConteudosConcluidos());
        System.out.println("XP:" + devDayane.calcularTotalXp());

        System.out.println("---------------");

        Dev devGiovane = new Dev();
        devGiovane.setNome("Giovane");
        devGiovane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giovane:" + devGiovane.getConteudosInscritos());
        devGiovane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Giovane:" + devGiovane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Giovane:" + devGiovane.getConteudosConcluidos());
        System.out.println("XP:" + devGiovane.calcularTotalXp());

        System.out.println("---------------");

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Daniel:" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Daniel:" + devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Daniel:" + devDaniel.getConteudosConcluidos());
        System.out.println("XP:" + devGiovane.calcularTotalXp());
    }
}
