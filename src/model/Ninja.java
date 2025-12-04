package model;

import enums.HabilityType;
import interfaces.Skills;

public abstract class Ninja implements Skills {
    String name;
    int age;
    String village;
    String habilityName;
    HabilityType habilityType;

    public Ninja() {}

    public Ninja(String name, int age, String village,String habilityName, HabilityType habilityType) {
        this.name = name;
        this.age = age;
        this.village = village;
        this.habilityName = habilityName;
        this.habilityType = habilityType;
    }

    @Override
    public abstract void showInfo();

    @Override
    public abstract void executeSkill();
}
