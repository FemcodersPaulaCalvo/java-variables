public class DrivingLicense {

    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) que contenga los puntos del carnet de conducir que empiece con 0 puntos.
        byte points = 0;
        System.out.println("Has sacado tu carnet de conducir, felicidades tienes 12 puntos");
        // Actualiza los puntos aquí
        points += 12;
        System.out.println("Te has negado a realizar pruebas de alcohol o drogas, pierdes 6 puntos");
        // Actualiza los puntos aquí
        points -= 6;
        System.out.println("Has conducido con cascos o auriculares, pierdes 3 puntos");
        // Actualiza los puntos aquí
        points -= 3;
        System.out.println("Tu coche detecta radares, pierdes 3 puntos");
        // Actualiza los puntos aquí
        points -= 3;
        System.out.println("Te han retiraod el carnet y ahora lo has recuperado, ganas 8 puntos");
        // Actualiza los puntos aquí
        points += 8;
        System.out.println("Has conducido sin haber cometido ninguna infracción en el transcurso de 2 años, ganas 4 puntos");
        // Actualiza los puntos aquí
        points += 4;
        System.out.println("Han pasado 3 años y sigues sin cometer infracciones, ganas 2 puntos");
        // Actualiza los puntos aquí
        points += 2;
        System.out.println("¿Cuántos puntos tienes");
        // Imprimir el total de puntos que tienes actualmente
        System.out.println(points);

    }
    
}