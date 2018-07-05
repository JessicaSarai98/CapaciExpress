package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class auxtxt {

    public static void escribirtxt(String st) {
        FileWriter archivo = null;
        PrintWriter pw = null;

        try {
            archivo = new FileWriter("archivo.txt");
            pw = new PrintWriter(archivo);

            for (int i = 0; i < 1; i++) {
                pw.println(st);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != archivo) {
                    archivo.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String lecturatxt() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String aux = null;

        try {

            archivo = new File("archivo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                aux = linea;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return aux;
    }
}
