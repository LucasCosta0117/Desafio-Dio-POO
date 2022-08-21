import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Instanciando novos cursos
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Descrição curso Java");
        curso1.setTitulo("Curso Java");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setTitulo("Curso JavaScript");

        //Instanciando nova mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        //Verificando se os cursos e mentorias foram criados corretamente:
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        //Instanciando um novo Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Boootcamp Java Developer (Usando POO)");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //Instanciando novos dev's para se inscreverem no Bootcamp,
        //verificando seus conteúdos inscritos, concluídos e executando progresso.
        Dev dev1 = new Dev();
        dev1.setNome("Lucas Costa");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Dev: ["+ dev1.getNome() +"]");
        System.out.println("Conteúdos inscritos: "+ dev1.getConteudosIncritos());

        dev1.progredir(); //Concluindo um dos conteúdos inscritos no Bootcamp
        System.out.println("--");

        System.out.println("Conteúdos inscritos: "+ dev1.getConteudosIncritos());
        System.out.println("Conteúdos concluídos: "+ dev1.getConteudosConcluidos());
        System.out.println("XP: "+ dev1.calcularTotalXP());

        System.out.println("=======================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Letícia Costa");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Dev: ["+ dev2.getNome() +"]");
        System.out.println("Conteúdos inscritos: "+ dev2.getConteudosIncritos());

        dev2.progredir(); //Concluindo um dos conteúdos inscritos no Bootcamp
        System.out.println("--");

        System.out.println("Conteúdos inscritos: "+ dev2.getConteudosIncritos());
        System.out.println("Conteúdos concluídos: "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXP());

        dev2.progredir(); //Concluindo um próximo conteúdo inscrito no Bootcamp
        System.out.println("--");

        System.out.println("Conteúdos inscritos: "+ dev2.getConteudosIncritos());
        System.out.println("Conteúdos concluídos: "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXP());
    }
}