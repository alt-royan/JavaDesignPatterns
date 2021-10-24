package Structure.Proxy;

public class YoutubeVideoProxy implements Video {
    private Video video;
    private String url;

    public YoutubeVideoProxy(String url) {
        this.url = url;
        System.out.println("Video created, video="+video);
    }


    @Override
    public void play() {
        if (video ==null){
            video=new YoutubeVideo(url);
        }
        video.play();
    }
}
