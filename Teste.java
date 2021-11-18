public class Teste {
    public static void main(String[] args) {
        Aluno a = new Aluno();

        a.setNome("Carla Martins");
        a.setMatricula(1234);
        a.setCurso("BigData");
        a.setDisciplina("Java, IoT, Projeto Integrador");
        a.setNota1(9);
        a.setNota2(5);
        a.setNota3(8);

        System.out.println("Aluno: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Curso: " + a.getCurso());
        System.out.println("Disciplinas: " + a.getDisciplina());
        System.out.println("Notas nas disciplinas: " + a.getNota1() + ", " + a.getNota2() + ", " + a.getNota3());
        a.verificarNotas();
    }
}