package Instituto;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instance;

    public static OfertaAcademicaFactory getInstance(){
        return instance == null ? new OfertaAcademicaFactory() : instance;
    }

    public OfertaAcademica crearOfertaAcademica(String s){
        switch (s){
            case "Curso":
                return new Curso();
            case "Programa Intensivo":
                return new ProgramaIntensivo();
            default:
                return null;
        }



    }


}
