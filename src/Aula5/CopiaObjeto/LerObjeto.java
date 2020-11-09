package Aula5.CopiaObjeto;

import java.io.*;

public class LerObjeto {

    void Ler() {

        final String dataFile = "objeto";

        ObjectInputStream inObj;
        try {
            inObj = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

            try {
                System.out.println("String data: " + inObj.readObject());
            } catch (ClassNotFoundException e) {
                System.out.println("Objeto nao encontrado.");
                e.printStackTrace();
            }

        } catch (IOException e1) {
            System.out.println("Erro na leitura do arquivo");
            e1.printStackTrace();
        }
        
    }
    
}
