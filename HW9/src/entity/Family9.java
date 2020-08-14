package entity;

import java.util.*;


public class Family9 {
    public Human9 father;
    public Human9 mother;
    public List<Object> children = new ArrayList<>();
    public Set<Object> pet9 = new HashSet<>();


    public Family9(Human9 father, Human9 mother) {
        this.father = father;
        this.mother = mother;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Human9 getFather() {
        return father;
    }

    public void setFather(Human9 father) {
        this.father = father;
    }

    public Human9 getMother() {
        return mother;
    }

    public void setMother(Human9 mother) {
        this.mother = mother;
    }


    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public void addChild(Human9 child) {
       this.children.add(child);
       child.setFamily(this);
    }

    public void deleteChild(int index){
        if (index < 0 ||index > this.children.size() -1 ){
            return;
        }
        List<Object> tempChildren = new ArrayList<>(this.children.size()-1);
        for(int i = 0; i < children.size(); i++){
            if(i< index ) {
                tempChildren.set(i, this.children.get(i));
            } else if (i>index){
                tempChildren.set(i - 1, this.children.get(i));
            }
        }
        children = tempChildren;
    }
    public void deleteChild(Object child){
        this.children.remove(child);
    }

    public Set<Object> getPets() {
        return pet9;
    }

    public void addPet(Pet9 pet9) {
        this.pet9.add(pet9);
        pet9.setFamily(this);
    }




    public int countFamily(){
        return 2 + children.size();

    }

    @Override
    public String toString() {
        return "Family9{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet9=" + pet9 +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family11)) return false;
        Family11 family9 = (Family11) o;
        return Objects.equals(father, family9.father) &&
                Objects.equals(mother, family9.mother) &&
                Objects.equals(children, family9.children) &&
                Objects.equals(pet9, family9.pet9);
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
                ", children=" + children +
                ", pet9=" + pet9 +
                '}');
    }
}
