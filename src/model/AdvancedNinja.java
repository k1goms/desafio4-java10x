package model;

import enums.HabilityType;
import enums.Specialty;

public class AdvancedNinja extends Ninja {
    Specialty specialty;

    public AdvancedNinja() {}

    public AdvancedNinja(String name, int age, String village, String habilityName, HabilityType habilityType, Specialty specialty) {
        super(name, age, village, habilityName, habilityType);
        this.specialty = specialty;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("* Especialidade: %s\n", specialty.description);
    }
}
