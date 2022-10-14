package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class NetworkConnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            Map <String, List<String>> headerFields =  urlConnection.getHeaderFields();
            for(Map.Entry<String, List<String>> entry: headerFields.entrySet()){
                String key = entry.getKey();
                List<String> value = entry.getValue();
                System.out.println("-------key = " + key);
                for(String string: value){
                    System.out.println("value = " + value);
                }
            }
//            BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream()));
//
//            String line = "";
//            while(line != null){
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();

//            URI uri = url.toURI();
//
//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("USer info = " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
