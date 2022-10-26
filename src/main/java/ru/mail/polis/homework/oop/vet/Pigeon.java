package ru.mail.polis.homework.oop.vet;

public class Pigeon extends Animal implements Pet, WildAnimal {
    private String organizationName;

    public Pigeon() {
        super(2);
    }

    @Override
    public String getOrganizationName() {
        return organizationName;
    }

    @Override
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public MoveType moveType() {
        return MoveType.FLY;
    }

    @Override
    public String say() {
        return "curls-curls";
    }
}
