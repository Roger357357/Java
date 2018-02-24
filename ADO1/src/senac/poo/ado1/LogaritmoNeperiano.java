package senac.poo.ado1;

public class LogaritmoNeperiano {
    public static double calcular(double x){
        x=x-1;
        double resfinal=0;
		double potencia=0;
        for(int n=1;n<=100;n++){
            potencia=x;
            for(int i=2;i<=n;i++){
                potencia*=x;
            }
            if(n%2==0){
                potencia*=-1;
            }
            resfinal +=potencia/n;
        }
        return resfinal;
    }
}