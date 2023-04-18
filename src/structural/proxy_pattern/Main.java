package structural.proxy_pattern;

import structural.proxy_pattern.internet.Internet;
import structural.proxy_pattern.internet.ProxyInternet;
import structural.proxy_pattern.video.ProxyVideoDownloader;
import structural.proxy_pattern.video.VideoDownloader;

public class Main {
    public static void main(String[] args) {
//        Controla el acceso a un objeto en particular realizando algo antes o
//        después de que la solicitud llegue a ese objeto

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("bloqueado.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("memes");
        videoDownloader.getVideo("memes");
        videoDownloader.getVideo("F1");
        videoDownloader.getVideo("F1");
        videoDownloader.getVideo("memes");
    }
}
