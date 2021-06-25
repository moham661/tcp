
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
 class Server_20190461 {

    public Server_20190461() {
        try{


            int x[]=new int[10];
            ServerSocket server = new ServerSocket(6786);



            while(true){
                Socket client = server.accept();
                System.out.println("client is connected.....");
                DataInputStream clientReadSource = new DataInputStream(client.getInputStream());
                DataOutputStream ClientWriteSource = new DataOutputStream(client.getOutputStream());
                for(int i=0;i<10;i++) {
                    x[i] = clientReadSource.readInt();
                }
                Arrays.sort(x);
                for (int i = 0; i < x.length; i++) {
                    ClientWriteSource.writeInt(x[i]);
                }
            }



        }catch (IOException e){
            System.out.println("error");
        }
    }

}

