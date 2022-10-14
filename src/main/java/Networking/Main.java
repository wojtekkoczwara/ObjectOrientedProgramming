package Networking;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {

//            base URI - leads to the root, main page etc.
            URI baseUri = new URI("http://username:password@mynewserver.com:5000");


            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#smasung");
            uri = new URI("/catalogue/phones?os=android#smasung");
            URI uri2 = new URI("/catalogue/tvs?manufacturer=smasung");
            URI uri3 = new URI("/stores/locations?zip=12345");

            URI resolvedURI = baseUri.resolve(uri);
            URI resolvedURI2 = baseUri.resolve(uri2);
            URI resolvedURI3 = baseUri.resolve(uri3);

            URI uriHello = new URI("hello");

            System.out.println("Scheme = " + uri.getScheme());
            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
            System.out.println("Authority = " + uri.getAuthority());
            System.out.println("USer info = " + uri.getUserInfo());
            System.out.println("Host = " + uri.getHost());
            System.out.println("Port = " + uri.getPort());
            System.out.println("Query = " + uri.getQuery());
            System.out.println("Fragment = " + uri.getFragment());

            System.out.println("\n============================\n");
            System.out.println("Scheme = " + uri2.getScheme());
            System.out.println("Scheme-specific part = " + uri2.getSchemeSpecificPart());
            System.out.println("Authority = " + uri2.getAuthority());
            System.out.println("USer info = " + uri2.getUserInfo());
            System.out.println("Host = " + uri2.getHost());
            System.out.println("Port = " + uri2.getPort());
            System.out.println("Query = " + uri2.getQuery());
            System.out.println("Fragment = " + uri2.getFragment());


//            convert URI to URL
            URL url = resolvedURI.toURL();
            System.out.println("URL = " + url);
            URL url2 = resolvedURI2.toURL();
            System.out.println("URL2 = " + url2);
            URL url3 = resolvedURI3.toURL();
            System.out.println("URL3 = " + url3);


//            relativize
            URI relativizedURI = baseUri.relativize(resolvedURI2);
            System.out.println("Relative URI = " + relativizedURI);
        } catch (URISyntaxException e) {
            System.out.println("URI bad syntax: " + e.getMessage());;
        } catch (MalformedURLException e) {
            System.out.println("\n======\n");
            System.out.println("URL Malformed: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
