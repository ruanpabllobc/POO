package classes;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegristroAcademico jhoan = new RegristroAcademico("Jhoan", 7, 0.7);
        System.out.println(jhoan);
        System.out.println("Quantidades de matriculas atuais: " + RegristroAcademico.getTotalDeMatriculas());
        System.out.println();

        RegristroAcademico heitor = new RegristroAcademico("Heitor", 7, 0.7);
        System.out.println(heitor);
        System.out.println("Quantidades de matriculas atuais: " + RegristroAcademico.getTotalDeMatriculas());
        System.out.println();

        RegristroAcademico tomaz = new RegristroAcademico("Tomaz", 87, 0.4);
        System.out.println(tomaz);
        System.out.println("Quantidades de matriculas atuais: " + RegristroAcademico.getTotalDeMatriculas());
        System.out.println();

        RegristroAcademico caio = new RegristroAcademico("Caio", 50, 1.7);
        System.out.println(caio);
        System.out.println("Quantidades de matriculas atuais: " + RegristroAcademico.getTotalDeMatriculas());
        System.out.println();
    }
}