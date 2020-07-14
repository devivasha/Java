package com;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Human father, mother;
    Pet pet;
    String[][] schedule = new String[7][2];
    public Human(){
    }
    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human (String name, String surname, int year, int iq,  Human mother, Human father) {
        this(name, surname, year);
        this.iq = iq;
        this.mother = mother;
        this.father = father;
    }

        public Human (String name, String surname, int year, int iq,  Human mother, Human father, Pet pet) {
        this(name, surname, year, iq, mother, father);
        this.pet = pet;
        this.describePet();
    }

    public void greetPet (){
        System.out.println("Привет, " + pet.nickname);
    }
    public void describePet (){
        System.out.println("У меня есть " + pet.nickname+ ", ему "+pet.age+ " лет, он " + (pet.trickLevel >= 50 ? "очень хитрый"  : "почти не хитрый"));
    }

    @Override
    public String toString() {
        String text = "";
        text += "Human" +  "{name=" + this.name + " " +
                "surname=" + this.surname + ", " +
                "year=" + this.year + '\'' +", " +
                "iq=" + this.iq + "}";
                if(this.mother != null)
                    text += ", mother= " + this.mother.name + " " + this.mother.surname;
                if(this.father != null)
                    text += ", father= " + this.father.name + " " + this.father.surname + "}";
                 if(this.pet != null)
                     text += ", pet= " + this.pet + "}";
                 return text;
    }
}
