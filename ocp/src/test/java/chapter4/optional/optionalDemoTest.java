package chapter4.optional;

import org.junit.Test;

import java.util.Optional;

import static chapter4.optional.optionalDemo.average;
import static org.junit.Assert.*;

public class optionalDemoTest {
    @Test
    public void test_optional_instance_methods() {
        Optional<Double> optional = average();

        System.out.println(optional.orElse(Double.NaN));
        System.out.println(optional.orElseGet(Math::random));
        System.out.println(optional.orElseThrow(IllegalStateException::new));
    }

}