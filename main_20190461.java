
import java.io.IOException;
import java.util.Scanner;
public class main_20190461 {
    public static void main (String[] args) throws IOException {
        Scanner input  = new Scanner(System.in);
        while (true){
            if(input.nextLine().equals("server")) {

                //server code
                Server_20190461 S = new Server_20190461();


            }else{
                //client code
                Client_20190461 C = new Client_20190461();


            }

        }

    }
}






