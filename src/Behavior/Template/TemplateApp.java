package Behavior.Template;

public class TemplateApp {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage =new WelcomePage();
        WebsiteTemplate newsPage =new NewsPage();

        welcomePage.showPage();
        System.out.println("==========================");
        newsPage.showPage();
    }
}
