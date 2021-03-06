package models;

import java.util.ArrayList;

public class Travel {
    private String title;
    private String description;
    private static ArrayList<Travel> instances = new ArrayList<>();
    private int id;


    private boolean published;
    private static int increment = 0;


    public Travel(String title, String description){
        this.title = title;
        this.description = description;
        instances.add(this);
        increment++;
        this.id = increment;
        this.published = false;
    }

    public static void clearAllTravel(){
        instances.clear();
        increment = 0;
    }
    public static Travel findById(int id){
        Travel test= null;
        for (Travel instance : instances){
            if(instance.getId() == id){
                test = instance;
            }
        }
        return test;
    }
    public void deleteByID(int id){
        instances.remove(Travel.findById(id));
    }
    public void update(String title, String description) {
        this.title = title;
        this.description = description;
    }


    //GETTERS

    public boolean getPublished() {
        return this.published;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public static ArrayList<Travel> getAll() {
        return instances;
    }
    public int getId() {
        return id;
    }

}
