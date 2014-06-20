package app.test;

import interop.Sample;

import org.junit.Test;

public class InteropTest {

    @Test
    public void testInteropCall() {
        Sample sample = new Sample();
        sample.main(new String[] {"Clojure"});
    }
}