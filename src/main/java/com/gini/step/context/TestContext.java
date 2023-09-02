package com.gini.step.context;



import java.util.HashMap;
import java.util.Map;

import static java.lang.ThreadLocal.withInitial;

public class TestContext {

    //make this class singleton

    //maeby concurent HashMap?
    private final ThreadLocal<Map<String, Object>> testContexts = withInitial(HashMap::new);

    public <T> T get(String name, Class<T> clazz) {
        return clazz.cast(testContexts.get()
                    .get(name));
    }

    public void set(String name,  Object object) {
        testContexts.get()
                .put(name, object);

    }

}
