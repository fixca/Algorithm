import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        char[] returnString = null;
        for(int i = 0; i < N; i++) {
            String string = br.readLine();
            if(returnString == null) {
                returnString = new char[string.length()];
                for(int j = 0; j < string.length(); j++) {
                    returnString[j] = string.charAt(j);
                }
            }
            else {
                for(int j = 0; j < string.length(); j++) {
                    if(returnString[j] == string.charAt(j)) {
                        continue;
                    }
                    returnString[j] = '?';
                }
            }
        }
        for(char a : returnString) {
            bw.write(String.valueOf(a));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
