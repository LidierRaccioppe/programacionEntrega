package bol21parte2;
public class Metodos {
    public int [] crearArrayInt(){
        int []nota = new int [5];
        int i;
        int numEle = PedirDatos.pedirInt("Cuantos elementos <= de "+nota.length);
        for(i =0;i<numEle;i++){
            if (nota[i]<=10&&nota[i]>=0){
            nota[i]= PedirDatos.pedirInt("notas :");
            }
            else break;
        }
        return nota;
    }
    public void mostrarArray ( int []nota){
        System.out.println("********"+ nota.length);
        for(int i =0;i<=nota.length;i++){
            System.out.println("notas"+i+"--->"+nota[i]);
        }
    }
    public void aprobadosSuspensos(int []nota){
        float aprobados = 0;
        float suspensas = 0;
        System.out.println("*******");
        for(int i=0; i<=nota.length; i++){
            if (nota[i] >5){
                aprobados++;
            }
            if (nota[i] <5){
                suspensas++;
            }
        }
            System.out.println("Notas aprobadas = "+aprobados+", notas suspensas = "+ suspensas);
    }
    public void notaMedia(int []nota ){
        int i=0;
        float media=0;
        for(i=0;i<=nota.length;i++){
            float parte = nota[i];
            media=media+parte;
        }
        media=media/i;
        System.out.println("La nota media es = "+media);
    }
    public void mayorNota (int []nota){
        int mayor = 0;
        for(int i =0; nota.length>i;i++){
            if (nota[i]>mayor){
                mayor=nota[i];
            }
        }
        System.out.println("Nota mayor es = "+ mayor);
    }
}