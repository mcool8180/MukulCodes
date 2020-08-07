public class MainDecorator {
    public static void main(String args[]){
        Car car = new Car();
        MusicSystemDecorator musicSystemDecorator=new MusicSystemDecorator(car);
        PowerSteeringDecorator powerSteeringDecorator=new PowerSteeringDecorator(musicSystemDecorator);
        powerSteeringDecorator.description();

    }
}
