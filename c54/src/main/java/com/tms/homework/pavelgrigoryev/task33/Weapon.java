package com.tms.homework.pavelgrigoryev.task33;

import java.util.Objects;

public record Weapon(String weaponName, Double damage) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapons = (Weapon) o;
        return Objects.equals(weaponName, weapons.weaponName) && Objects.equals(damage, weapons.damage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weaponName, damage);
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "weaponName='" + weaponName + '\'' +
                ", damage=" + damage +
                '}';
    }
}
