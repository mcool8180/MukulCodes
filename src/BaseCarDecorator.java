public abstract class BaseCarDecorator implements Icar {

    protected Icar car;
    public BaseCarDecorator(Icar car){
        this.car=car;
    }
}
