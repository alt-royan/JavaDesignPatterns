package Structure.Proxy;

public class YoutubeVideo implements Video{
    private String url;

    public YoutubeVideo(String url){
        this.url=url;
        load();
        System.out.println("Video created, video="+this);
    }

    private void load() {
        System.out.println("loading video from "+ url+" ...");
    }

    @Override
    public void play() {
        System.out.println("video is playing");
    }
}
