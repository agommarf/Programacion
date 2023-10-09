public class Time {
    public static void main(String[] args) {
    
    int hour = 20;
    int minute = 45;
    int second=00;
    
    int calc1= hour * 3600;
    int calc2= minute * 60;

    int resultseg= calc1 + calc2 + second;

    System.out.println("Número de segundos desde media noche " + resultseg);
    


    int calc3 = (24 - hour) * 3600;

    int calc4 = minute * 60;

    int resultseg2 = calc3 + calc4 + second;

    System.out.println("Número de segundos que quedan en el dia " + resultseg2);

    double division = resultseg / (24*3600.0);
    double resultporc = division * 100;

    System.out.println("Porcentaje del día que ha pasado " + resultporc);

    
    int houract = 21;

    
    System.out.println("Han pasado " + (houract-20) + " horas desde que comenzó el ejercicio");



    }
}
