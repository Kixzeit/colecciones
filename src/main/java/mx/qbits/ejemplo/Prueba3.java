package mx.qbits.ejemplo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Prueba3 {
    public static void main(String[] args) {
        Prueba3 p = new Prueba3();
        try {
            p.ok();
        } catch (NoNegativeNumbersException e) {
            System.out.println(
                    e.getMsgString() + 
                    " código de error: " + 
                    e.getCodigoError()
            );
        } catch (IOException e) {
            System.out.println("El archivo no existe:"+e.getMessage());
        }
    }

    public void ok() throws NoNegativeNumbersException, IOException {
        try {
            int r = divide(5,11);
            System.out.println("La suma fue: " +r);
        } catch (ArithmeticException g) {
            System.out.println("División por cero no permitida");
        }
    }

    private int divide(int i, int j) throws NoNegativeNumbersException, IOException {
        int a = -1;
        int b = a + j;
        int c = b / i;
        int d = c +1;
        if(a<0) throw new NoNegativeNumbersException();
        Path p = Paths.get("/Users/garellano/Desktop/java_bnf.txt");
        byte[] f = Files.readAllBytes(p);
        String str = new String(f);
        System.out.println(str);

        return d;
    }
}
