package com.github.enesusta.jtuples;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class Tuple2Test {

    static class CaseClass {
        String name;
        String surname;
    }

    @Test
    public void it_should_get_true_type_of_generic() {
        Tuple2<String, Integer> tuple2 = Tuple2.from("Enes", 22);
        assertThat(tuple2._1.getClass(), equalTo(String.class));
    }

    @Test
    public void it_should_return_case_class() {
        CaseClass caseClass = new CaseClass();
        caseClass.name = "enes";
        caseClass.surname = "usta";

        Tuple2<Integer, CaseClass> tuple2 = Tuple2.from(22, caseClass);
        assertThat(tuple2._2.getClass(), equalTo(CaseClass.class));
    }

}