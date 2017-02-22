package design.pattern.factory_method;

public class Customer {
    public BMW getBMW(String name) throws Exception {
        Class<?> clazz = Class.forName(this.getClass().getPackage().getName() + ".Factory" + name);
        FactoryBMW factoryBMW = (FactoryBMW) clazz.newInstance();

        return factoryBMW.buildBMW();
    }

    public static void main(String[] args) throws Exception {
        Customer c = new Customer();
        BMW bmw = c.getBMW("BMW320");
        BMW bmw523 = c.getBMW("BMW523");
    }
}
