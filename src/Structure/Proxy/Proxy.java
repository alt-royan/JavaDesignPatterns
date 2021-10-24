package Structure.Proxy;

public class Proxy {
    public static void main(String[] args) {
        //without proxy
        System.out.println("without proxy:");
        Video video=new YoutubeVideo("www.youtube.com/watch?v=aaaaaaaaaaa");
        video.play();
        System.out.println();



        //with proxy
        System.out.println("with proxy");
        Video videoProxy=new YoutubeVideoProxy("www.youtube.com/watch?v=aaaaaaaaaaa");
        videoProxy.play();
    }
}
