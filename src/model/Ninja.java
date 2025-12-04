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
    public void showInfo() {
        System.out.printf("FICHA NINJA\n" +
                        "* Nome: %s\n" +
                        "* Idade: %d\n" +
                        "* Habilidade: %s\n" +
                        "* Tipo da habilidade: %s\n" +
                        "* Aldeia: %s\n", name, age, habilityName, habilityType.description, village);
    }

    @Override
    public void executeSkill() {
        System.out.printf("\n%s usou sua habilidade %s do tipo %s!\n", name, habilityName, habilityType.description);
    }
}
