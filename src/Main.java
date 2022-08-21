import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Descrição curso Java");
        curso1.setTitulo("Curso Java");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setTitulo("Curso JavaScript");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}