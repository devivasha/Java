package com;

import java.util.Arrays;
import java.util.Objects;


public class Family6 {
    private Human6 father;
    private Human6 mother;
    private Human6[] children = new Human6[0];
    private Pet6 pet6 = new Pet6();

    public Family6(Human6 father, Human6 mother, Human6[] children, Pet6 pet6) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        for (Human6 child : children) {
            if (child.getFamily() != null) {
                child.getFamily().deleteChild(child);
            }
            child.setFamily(this);
        }

        father.setFamily(this);
        mother.setFamily(this);
        this.pet6 = pet6;
    }

    public Human6 getFather() {
        return father;
    }

    public void setFather(Human6 father) {
        this.father = father;
    }

    public Human6 getMother() {
        return mother;
    }

    public void setMother(Human6 mother) {
        this.mother = mother;
    }

    public Human6[] getChildren() {
        return children;
    }

    public void setChildren(Human6[] children) {
        this.children = children;
    }

    public Pet6 getPet6() {
        return pet6;
    }

    public void setPet6(Pet6 pet6) {
        this.pet6 = pet6;
    }
    public void addChild(Human6 child) {
        Human6 [] tempArr = new Human6 [children.length + 1];
        System.arraycopy(children, 0, tempArr, 0, children.length);
        tempArr[tempArr.length - 1] = child;
        child.setFamily(this);
        children = tempArr;
    }

    public void deleteChild(int index){
        if (index < 0 ||index > this.children.length -1 ){
            return;
        }
        Human6 [] tempChildren = new Human6 [this.children.length-1];
        for(int i = 0; i < children.length; i++){
            if(i< index ) {
                tempChildren[i] = this.children[i];
            } else if (i>index){
                tempChildren[i-1] = this.children[i];
            }
        }
        children = tempChildren;
    }
    public void deleteChild(Human6 child){
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) deleteChild(i);
        }
    }


    public int countFamily(){
        return 2 + children.length;

    }
    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + Arrays.toString(children) +
                ", pet6=" + pet6 +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family6)) return false;
        Family6 family = (Family6) o;
        return father.equals(family.father) &&
                mother.equals(family.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println( "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + Arrays.toString(children) +
                ", pet6=" + pet6 +
                '}');
    }

}
