public class PowerSteeringDecorator extends BaseCarDecorator {
    public PowerSteeringDecorator(Icar car) {
        super(car);
    }

    @Override
    public void description() {
        car.description();
        System.out.println("Adding power steering.....");

    }
}
