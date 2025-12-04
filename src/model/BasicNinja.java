package model;

import enums.HabilityType;

public class BasicNinja extends Ninja {

    public BasicNinja(String name, int age, String village, String habilityName, HabilityType habilityType) {
        super(name, age, village, habilityName, habilityType);
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
