package interview.reflection;

import java.lang.reflect.Field;

public class GetPrivateParameter {
    private int count = 1;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(GetPrivateParameter.class.getName());
        Object obj = clazz.newInstance();

        Field[] fields = clazz.getDeclaredFields();


        for (Field field : fields) {
            field.setAccessible(true);

            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getInt(obj));
        }
    }
}
