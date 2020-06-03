package src.main.java;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class LeiaCVS {

    public static void main(String[] args) {

        LeiaCVS obj = new LeiaCVS();
        obj.run();

    }

    public void run() {

        String arquivoCSV = "C:\\Users\\Rafael\\Desktop\\DECOLANDO\\JAVA\\Testes\\KATAS\\pessoas.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));

            List lista = new ArrayList();

            while ((linha = br.readLine()) != null) {

                String[] pais = linha.split(csvDivisor);

                lista.add(pais[pais.length - 2]);
                System.out.println(pais[pais.length - 3] + " " + pais[pais.length - 2]
                        + " " + pais[pais.length - 1]);
            }

            int n=lista.size();
            for(int i=1; i<n; i++){
                System.out.println("lista 2 " + lista.get(i));
            }

            System.out.println("lista 3" + lista);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
