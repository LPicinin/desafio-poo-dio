import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        var curso1 = new Curso("Curso java", "Descrição do curso", 44);
        var curso2 = new Curso("Curso javaScript", "Descrição do curso", 88);

        var mentoria1 = new Mentoria("Mentoria Java", "Descriçaõ mentoria", LocalDate.now());
        var mentoria2 = new Mentoria("Mentoria JavaScript", "Descriçaõ mentoria", LocalDate.now().plusDays(45));

        Conteudo curso3 = new Curso("Curso 3", "Descrição do curso", 33);
        Conteudo mentoria3 = new Mentoria("Mentoria 3", "Descriçaõ mentoria", LocalDate.now().plusDays(22));

//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Devloper");
        bootcamp.setDescicao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLuis = new Dev();
        devLuis.setNome("Luis");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Inscrições Luis: \t"+devLuis.getConteudosInscritos());
        devLuis.progredir();
        devLuis.progredir();
        System.out.println("-");
        System.out.println("Inscrições Luis: \t"+devLuis.getConteudosInscritos());
        System.out.println("Concluidos Luis: \t"+devLuis.getConteudosConcluidos());
        System.out.println("XP: "+devLuis.calcularTotalXP());

        System.out.println("----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Inscrições Joao: \t"+devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Inscrições Joao: \t"+devJoao.getConteudosInscritos());
        System.out.println("Concluidos Joao: \t"+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXP());
    }
}
