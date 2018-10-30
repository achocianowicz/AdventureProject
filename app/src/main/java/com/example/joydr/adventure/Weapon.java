package com.example.joydr.adventure;

import java.lang.reflect.Array;

public class Weapon extends Item {

    private boolean isEquip = false, isOneHanded = false, isTwoHanded = false;
    private double physicalBaseDamage = -1, magicBaseDamage =-1 ;

    Array Attacks = null;
    Array Blocks = null;

    public Weapon () {}

    public boolean isEquip() {
        return isEquip;
    }

    public void setEquip(boolean equip) {
        isEquip = equip;
    }

    public boolean isOneHanded() {
        return isOneHanded;
    }

    public void setOneHanded(boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    public boolean isTwoHanded() {
        return isTwoHanded;
    }

    public void setTwoHanded(boolean twoHanded) {
        isTwoHanded = twoHanded;
    }

    public double getPhysicalDamage() {
        return physicalBaseDamage;
    }

    public void setPhysicalDamage(double physicalDamage) {
        this.physicalBaseDamage = physicalDamage;
    }

    public double getMagicDamage() {
        return magicBaseDamage;
    }

    public void setMagicDamage(double magicDamage) {
        this.magicBaseDamage = magicDamage;
    }
}
