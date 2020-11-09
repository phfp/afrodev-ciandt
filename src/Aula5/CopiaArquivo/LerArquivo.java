package Aula5.CopiaArquivo;

import java.io.*;

public class LerArquivo {

    void Ler() {

        final String dataFile = "invoicedata";

        double price = 0.0;
        int unit;
        String desc;
        double total = 0.0;

        try {
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
            try {
                while (true) {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();
                    total += unit * price; 
                    if(total > 10){
                        System.out.format("You ordered %d" + " units of %s at $%.2f - produto caro%n", unit, desc, price);
                    } else {
                        System.out.format("You ordered %d" + " units of %s at $%.2f - produto ok%n", unit, desc, price);
                    }
                    total = 0.0;                   
                }
            } catch (IOException e) {
                System.out.println("Fim da leitura!");
            } finally {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }       

    }
}
