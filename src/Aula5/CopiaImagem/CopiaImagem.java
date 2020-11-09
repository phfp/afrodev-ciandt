package Aula5.CopiaImagem;

import java.io.*;

public class CopiaImagem {

    public void Copiar() {

        File imgIn = new File("/home/paulo/Imagens/img.jpg");
        File imgOut = new File("/home/paulo/Afrodev/afrodev-ciandt/src/Aula5/CopiaImagem/imgCopia.jpg");

        try {

            InputStream in = new FileInputStream(imgIn);
            OutputStream out = new FileOutputStream(imgOut);

            byte []buffer = new byte[1024];            

            try {

                int tamanhoPacote;

                while ((tamanhoPacote = in.read(buffer)) != -1) {
                    out.write(buffer, 0, tamanhoPacote);            
                }

                in.close();
                out.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
