
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

 class Client_20190461 {

    private static void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Client_20190461()  {
        try {


            int arrayX[]=new int[10];
            int Array[]=new int[10];
            Scanner input= new Scanner(System.in);
            try (Socket server = new Socket("localhost",6786)) {
                DataOutputStream serverReadSource = new DataOutputStream(server.getOutputStream());
                DataInputStream serverWriteSource = new DataInputStream(server.getInputStream());
                System.out.println("enter 10 random numbers (space separated)");
                for(int i=0;i<10;i++)
                    arrayX[i]=input.nextInt();

                for(int i=0;i<10;i++)
                    serverReadSource.writeInt(arrayX[i]);

                for(int i=0;i<10;i++)
                    Array[i]=serverWriteSource.readInt();
                System.out.println("receiving data.....");
                System.out.println("data in ascending order is.... ");

                for (int i = 0; i < Array.length; i++) {
                    System.out.print(Array[i]+" ");
                }
                System.out.println();
                System.out.println("data in descending order is...");
                for (int i=9; i>=0;i--){
                    System.out.print(Array[i]+" ");
                }
                System.out.println();

            }



        } catch (IOException e){
            System.out.println(" ");
        }
    }

}
