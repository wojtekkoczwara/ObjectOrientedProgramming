package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrlConnectionWrong {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org/example");
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.setRequestMethod("GET");
            httpConnection.setRequestProperty("User-Agent", "Chrome");
            httpConnection.setReadTimeout(30000);

            int responseCode = httpConnection.getResponseCode();
            System.out.println("Response code: " + responseCode);
            if(responseCode != 200){
                System.out.println("Error reading web page");
                System.out.println(httpConnection.getResponseMessage());
                return;
            }

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));

                        String line = "";
            while((line = inputStream.readLine()) != null){
                System.out.println(line);
            }
            inputStream.close();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
