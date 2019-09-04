package com.sujeevan;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
    private String name;
    private int hitpoitns;
    private int stength;
    private String weapon;

    public Player(String name, int hitpoitns, int stength) {
        this.name = name;
        this.hitpoitns = hitpoitns;
        this.stength = stength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoitns() {
        return hitpoitns;
    }

    public void setHitpoitns(int hitpoitns) {
        this.hitpoitns = hitpoitns;
    }

    public int getStength() {
        return stength;
    }

    public void setStength(int stength) {
        this.stength = stength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoitns=" + hitpoitns +
                ", stength=" + stength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitpoitns);
        values.add(2,""+this.stength);
        values.add(3,this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
     if (savedValues!= null&&savedValues.size()>0){
         this.name = savedValues.get(0);
         this.hitpoitns=Integer.parseInt(savedValues.get(1));
         this.stength=Integer.parseInt(savedValues.get(2));
         this.weapon = savedValues.get(3);
     }
    }

















}
