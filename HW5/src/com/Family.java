package com;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human5 father;
    private Human5 mother;
    private Human5[] children = new Human5[0];
    private Pet5 pet5 = new Pet5();

    public Family(Human5 father, Human5 mother) {
        this.father = father;
        this.mother = mother;
        father.setFamily(this);
        mother.setFamily(this);
    }

    public Human5 getFather() {
        return father;
    }

    public void setFather(Human5 father) {
        this.father = father;
    }

    public Human5 getMother() {
        return mother;
    }

    public void setMother(Human5 mother) {
        this.mother = mother;
    }

    public Human5[] getChildren() {
        return children;
    }

    public void setChildren(Human5[] children) {
        this.children = children;
    }

    public Pet5 getPet5() {
        return pet5;
    }

    public void setPet5(Pet5 pet5) {
        this.pet5 = pet5;
    }
    public void addChild(Human5 child) {
        Human5 [] tempArr = new Human5 [children.length + 1];
        System.arraycopy(children, 0, tempArr, 0, children.length);
        tempArr[tempArr.length - 1] = child;
        child.setFamily(this);
        children = tempArr;
    }

    public void deleteChild(int index){
        if (index < 0 ||index > this.children.length -1 ){
            return;
        }
        Human5 [] tempChildren = new Human5 [this.children.length-1];
        for(int i = 0; i < children.length; i++){
            if(i< index ) {
                tempChildren[i] = this.children[i];
            } else if (i>index){
                tempChildren[i-1] = this.children[i];
            }
        }
        this.children = tempChildren;
    }
    public void countFamily(){
        int countResult = this.children.length + 2;
        System.out.println("Family size " + countResult + "persons");

    }
    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + Arrays.toString(children) +
                ", pet5=" + pet5 +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return father.equals(family.father) &&
                mother.equals(family.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother);
    }
}
