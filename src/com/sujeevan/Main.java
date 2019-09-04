package com.sujeevan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player tim = new Player("Tim" , 10,15);
        System.out.println(tim.toString());
        saveObjects(tim);

        tim.setHitpoitns(8);
        System.out.println(tim.toString());
        tim.setWeapon("StormBringer");
        saveObjects(tim);
        loadObject(tim);
        System.out.println(tim);
    }


    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a String\n "+ "0 to quit");

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObjects(ISavable objectToSave){
        for (int i =0 ; i<objectToSave.write().size();i++){
            System.out.println("Saving " + objectToSave.write().get(i) + "to Storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }














}
