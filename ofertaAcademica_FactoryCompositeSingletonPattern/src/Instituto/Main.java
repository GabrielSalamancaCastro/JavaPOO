package Instituto;

public class Main {
    public static void main(String[] args) {
        //======DEFINIENDO UN PROGRAMA INTENSIVO=============
        OfertaAcademica fullStack = new OfertaAcademicaFactory().crearOfertaAcademica("Programa Intensivo");

        //=====DEFINIENDO CURSOS======================
        OfertaAcademica FrontEnd1 = new OfertaAcademicaFactory().crearOfertaAcademica("Curso");
        FrontEnd1.setNombre("Front End");
        FrontEnd1.setDescripcion("Es el curso de Front End");
        ((Curso) FrontEnd1).setValorHora(5000);
        ((Curso) FrontEnd1).setCargaHorariaMensual(32);
        ((Curso) FrontEnd1).setMesesDuaracion(4);

        OfertaAcademica BackEnd1 = new OfertaAcademicaFactory().crearOfertaAcademica("Curso");
        BackEnd1.setNombre("Back End");
        BackEnd1.setDescripcion("Este es el curso de Back End");
        ((Curso) BackEnd1).setValorHora(6000);
        ((Curso) BackEnd1).setCargaHorariaMensual(40);
        ((Curso) BackEnd1).setMesesDuaracion(6);


        ((ProgramaIntensivo) fullStack).agregarCurso((Curso) BackEnd1);
        ((ProgramaIntensivo) fullStack).agregarCurso((Curso) FrontEnd1);

        System.out.println(((ProgramaIntensivo) fullStack).calcularPrecio());

    }
}
