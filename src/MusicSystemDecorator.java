public class MusicSystemDecorator extends BaseCarDecorator{
    public MusicSystemDecorator(Icar car) {
        super(car);
    }

    @Override
    public void description() {
        car.description();
        System.out.println("Installing music system....");

    }
}
