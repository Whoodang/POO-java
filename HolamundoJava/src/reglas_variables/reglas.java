package reglas_variables;

public class reglas {
    public static void main (String args[]) {

        //Define the variable and assign the value
        int miVariableEntera = 20;
        System.out.println(miVariableEntera);
        //I modify the value of the variable
        miVariableEntera = 8;
        System.out.println(miVariableEntera);

        //Define the variable and assign the value
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        //I modify the value of the variable
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        // var - type inference in Java
        // we use the reserved word 'var' to refer to a variable
        // that may contain the data types assigned '=' in the literal,
        // it is simpler and allows us to make a cleaner code.

        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);

        var miVariableString2 = "Hola bebe";
        System.out.println("miVariableString2 =" + miVariableString2);

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 2; no se permite utilizar caracteres especiales
    }
}
