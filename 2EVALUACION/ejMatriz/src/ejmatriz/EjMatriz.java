package ejmatriz;
public class EjMatriz {
    public static void main(String[] args) {
        MetodosMatrices mm = new MetodosMatrices();
        int [][] aux;
        aux=mm.crearArrayMultiversal();
        mm.ver(aux);
        mm.mediaAlumno(aux);
        mm.mediaAlumnado(aux);
        mm.mediaAlumnadoModulo(aux);
        /*
        float [] aux2;
        aux2 = mm.mediaAlumnoModulo(aux);
        mm.ver(aux2);
        */
    }
}