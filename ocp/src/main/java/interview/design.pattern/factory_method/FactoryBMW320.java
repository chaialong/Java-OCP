package design.pattern.factory_method;

public class FactoryBMW320 implements FactoryBMW {
    @Override
    public BMW buildBMW() {
        return new BMW320();
    }
}
