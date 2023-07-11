package com.hyak4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void bmiTest(){
        final float weight = 66.5f;
        final float height = 1.7f;
        Person person = new Person(weight, height);
        Assertions.assertEquals( weight /(height * height) , person.bmi());
    }
}
