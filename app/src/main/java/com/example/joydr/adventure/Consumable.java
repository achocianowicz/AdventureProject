package com.example.joydr.adventure;

public class Consumable extends Item {
    private double effectHP =-1, effectSTR =-1,effectMagic =-1,effectINTELL =-1,effectDodge =-1,
            effectSpeed =-1, effectDEX =-1, effectEXP =-1, effectReward =-1;

    public Consumable () {}

    public double getEffectHP() {
        return effectHP;
    }

    public void setEffectHP(double effectHP) {
        this.effectHP = effectHP;
    }

    public double getEffectSTR() {
        return effectSTR;
    }

    public void setEffectSTR(double effectSTR) {
        this.effectSTR = effectSTR;
    }

    public double getEffectMagic() {
        return effectMagic;
    }

    public void setEffectMagic(double effectMagic) {
        this.effectMagic = effectMagic;
    }

    public double getEffectINTELL() {
        return effectINTELL;
    }

    public void setEffectINTELL(double effectINTELL) {
        this.effectINTELL = effectINTELL;
    }

    public double getEffectDodge() {
        return effectDodge;
    }

    public void setEffectDodge(double effectDodge) {
        this.effectDodge = effectDodge;
    }

    public double getEffectSpeed() {
        return effectSpeed;
    }

    public void setEffectSpeed(double effectSpeed) {
        this.effectSpeed = effectSpeed;
    }

    public double getEffectDEX() {
        return effectDEX;
    }

    public void setEffectDEX(double effectDEX) {
        this.effectDEX = effectDEX;
    }

    public double getEffectEXP() {
        return effectEXP;
    }

    public void setEffectEXP(double effectEXP) {
        this.effectEXP = effectEXP;
    }

    public double getEffectReward() {
        return effectReward;
    }

    public void setEffectReward(double effectReward) {
        this.effectReward = effectReward;
    }
}
