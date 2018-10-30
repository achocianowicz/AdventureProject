package com.example.joydr.adventure;

public class CurrentCharacter {
    private  String characterName = null;
    private String characterClass = null;

    private double baseHP = -1, currentHP = -1, baseMP = -1, currentMP = -1, currentBlock = -1,
            currentEXP = -1, overallEXP = -1, expMultiplier =-1;
    private double strength = -1, intelligence = -1, dodge = -1, speed = -1, dexterity = -1;
    private int gold = -1 , currentLevel = -1, nextLevel =-1;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public double getBaseHP() {
        return baseHP;
    }

    public void setBaseHP(double baseHP) {
        this.baseHP = baseHP;
    }

    public double getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(double currentHP) {
        this.currentHP = currentHP;
    }

    public double getBaseMP() {
        return baseMP;
    }

    public void setBaseMP(double baseMP) {
        this.baseMP = baseMP;
    }

    public double getCurrentMP() {
        return currentMP;
    }

    public void setCurrentMP(double currentMP) {
        this.currentMP = currentMP;
    }

    public double getCurrentBlock() {
        return currentBlock;
    }

    public void setCurrentBlock(double currentBlock) {
        this.currentBlock = currentBlock;
    }

    public double getCurrentEXP() {
        return currentEXP;
    }

    public void setCurrentEXP(double currentEXP) {
        this.currentEXP = currentEXP;
    }

    public double getOverallEXP() {
        return overallEXP;
    }

    public void setOverallEXP(double overallEXP) {
        this.overallEXP = overallEXP;
    }

    public double getExpMultiplier() {
        return expMultiplier;
    }

    public void setExpMultiplier(double expMultiplier) {
        this.expMultiplier = expMultiplier;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public double getDodge() {
        return dodge;
    }

    public void setDodge(double dodge) {
        this.dodge = dodge;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDexterity() {
        return dexterity;
    }

    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
    }
}
