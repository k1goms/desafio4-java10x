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
        System.out.printf("FICHA NINJA\n" +
                "* Nome: %s\n" +
                "* Idade: %d\n" +
                "* Habilidade: %s\n" +
                "* Tipo da habilidade: %s\n" +
                "* Especialidade: %s\n" +
                "* Aldeia: %s\n", name, age, habilityName, habilityType.description, specialty.description, village);
    }

    @Override
    public void executeSkill() {
        System.out.printf("\n%s usou sua habilidade %s do tipo %s!\n", name, habilityName, habilityType.description);
    }


}
