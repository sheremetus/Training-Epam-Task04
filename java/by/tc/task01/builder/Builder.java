package by.tc.task01.builder;

import by.tc.task01.entity.Appliance;

public interface Builder {
    Appliance build(String[] parameters);
}
