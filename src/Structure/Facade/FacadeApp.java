package Structure.Facade;

public class FacadeApp {
    public static void main(String... args){
        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor advisor = new RoadAdvisor();

        GPSFacade gps = new GPSFacade(power, notifier, advisor);

        //Водитель включает навигационную систему
        gps.activate();;
        //Водитель выключает навигационную систему
        power.powerOff();
    }
}
