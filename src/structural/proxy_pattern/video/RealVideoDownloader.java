package structural.proxy_pattern.video;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to http://www.youtube.com/");
        System.out.println("Downloading video");
        System.out.println("Retrieving Video Metadata");
        return new Video(videoName);
    }
}
