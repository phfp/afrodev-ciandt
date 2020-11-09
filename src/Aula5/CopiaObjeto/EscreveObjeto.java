package Aula5.CopiaObjeto;

import java.io.*;

public class EscreveObjeto {

    static final String nome = "Olá, eu sou um OBJETO!";

    public void Escrever() {

        final String dataFile = "objeto";        

        try {
            ObjectOutputStream outObj = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

            outObj.writeObject(nome);

            try {
                outObj.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }



    }


}
