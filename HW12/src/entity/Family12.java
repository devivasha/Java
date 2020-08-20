package entity;

import java.util.*;


public class Family12 {
    public Human12 father;
    public Human12 mother;
    public List<Human12> children = new ArrayList<>();
    public Set<Pet12> pet12 = new HashSet<>();


    public Family12(Human12 father, Human12 mother) {
        this.father = father;
        this.mother = mother;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }


    public Human12 getFather() {
        return father;
    }

    public void setFather(Human12 father) {
        this.father = father;
    }

    public Human12 getMother() {
        return mother;
    }

    public void setMother(Human12 mother) {
        this.mother = mother;
    }


    public List<Human12> getChildren() {
        return children;
    }

    public void setChildren(List<Human12> children) {
        this.children = children;
    }

    public void addChild(Human12 child) {
       this.children.add(child);
       child.setFamily(this);
    }

    public void deleteChild(int index){
        if (index < 0 ||index > this.children.size() -1 ){
            return;
        }
        List<Human12> tempChildren = new ArrayList<>(this.children.size()-1);
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

    public Set<Pet12> getPets() {
        return pet12;
    }

    public void addPet(Pet12 pet12) {
        this.pet12.add(pet12);
        pet12.setFamily(this);
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
                ", pet9=" + pet12 +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family12)) return false;
        Family12 family12 = (Family12) o;
        return Objects.equals(father, family12.father) &&
                Objects.equals(mother, family12.mother) &&
                Objects.equals(children, family12.children) &&
                Objects.equals(pet12, family12.pet12);
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
                ", pet9=" + pet12 +
                '}');
    }


    public String prettyFormat() {
        StringBuilder str = new StringBuilder();
        str.append("family:")
                .append('\n');
        if (this.mother != null) {
            str.append('\t')
                    .append("mother: ")
                    .append(this.mother.prettyFormat())
                    .append(",")
                    .append('\n');
        }
        if (this.father != null) {
            str.append('\t')
                    .append("father: ")
                    .append(this.father.prettyFormat())
                    .append(",")
                    .append('\n');
        }
        if (this.children.size() > 0) {
            str.append('\t')
                    .append("children: ")
                    .append('\n');
            for (Human12 child : this.children) {
                String childType = child instanceof Man12 ? "boy: " : "girl: ";
                str.append('\t')
                        .append('\t')
                        .append('\t')
                        .append(childType)
                        .append(child.prettyFormat())
                        .append('\n');
            }
        }
        str.append('\t')
                .append("pets: [");
        for (Pet12 pet12 : pet12 ) {
            str.append("{")
                    .append(pet12.prettyFormat())
                    .append("},");
        }
        if (this.pet12.size() > 0) {
            str.deleteCharAt(str.length() - 1);
        }
        str.append("]");
        return str.toString();
    }
}
