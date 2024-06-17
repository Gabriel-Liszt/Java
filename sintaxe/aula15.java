public class aula15{
    public static void main(String[] args){
        
        long totalmili= System.currentTimeMillis() - 10800000;
        long totalseg = totalmili/1000;
        long segatual= totalseg % 60;
        long totalmin = totalseg / 60;
        long minatual = totalmin % 60;
        long totalhora = totalmin / 60;
        long horaatual = totalhora % 24;

        System.out.println("A hora atual é: "+ horaatual+":"+ minatual +":"+ segatual);
    }
}