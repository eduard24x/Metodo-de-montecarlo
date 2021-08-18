package metododemontecarlo;
public class MetodoDeMontecarlo {
    public static void main(String[] args) {
    int total_simulaciones=1000000;
    float suma=0,resultado_simulado=0;
    for(int i=0;i<total_simulaciones;i++){
        suma=(float)(suma+Math.random());
    }
    resultado_simulado=suma/total_simulaciones;
        System.out.println("el resultado de montecarlo fue: "+resultado_simulado);
    }
    
}

