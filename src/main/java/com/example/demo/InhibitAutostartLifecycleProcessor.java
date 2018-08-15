package com.example.demo;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.context.Lifecycle;
import org.springframework.context.support.DefaultLifecycleProcessor;
import org.springframework.lang.NonNullApi;

public class InhibitAutostartLifecycleProcessor extends DefaultLifecycleProcessor {

    private List<String> disableAutostart = new ArrayList<>();

    public void disableAutostart(List<String> lifecycles) {
        disableAutostart.addAll(lifecycles);
    }

    public void enableAutostart(List<String> lifecycles) {
        disableAutostart.removeAll(lifecycles);
    }

    public void clear() {
        disableAutostart = new ArrayList<>();
    }

    @Override
    protected Map<String, Lifecycle> getLifecycleBeans() {
        Map<String, Lifecycle> lifecycleBeans = super.getLifecycleBeans();
        disableAutostart.forEach(lifecycleBeans::remove);
        return  lifecycleBeans;
    }
}
