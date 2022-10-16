package concatenacion;

public class cancatenar {

    public static void main(String args[]) {
        var usuario = "toto";
        var titulo = "Certified Tech Dev";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 3;
        var b = 4;

        System.out.println(a + b);// se suman los numeros
        System.out.println(a + b + usuario); //se evalua de izquierda a derecha, realiza suma
        System.out.println(usuario + a + b); //contexto cadena, el resultado es una cadena completa
        System.out.println(usuario + (a + b));//el uso de parentesis modifica la prioridad en la evaluacion

        // OUTPUT
        //union = Certified Tech Dev toto
        //7
        //7toto
        //toto34
        //toto7

    }
}
