import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost",8080);
    try {
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        out.println("qwerty");
        out.flush();

        InputStreamReader in = new InputStreamReader(clientSocket.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        String otvet = bf.readLine();
        System.out.println(otvet);
    }
    catch (IOException e){
        System.out.println(e);
        }
    //тут не мог понять почему не работает, вот и дописал catch
    //bufferreader и bufferwriter не использовал, вместо них printwriter
    }
}
