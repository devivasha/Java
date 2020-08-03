import java.util.*;


public class Family8 {
    public Human8 father;
    public Human8 mother;
    public List<Object> children = new ArrayList<>();
    public Set<Object> pet8 = new HashSet<>();


    public Family8(Human8 father, Human8 mother, List<Object> children, Set<Object> pet8) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet8 = pet8;
    }

    public Human8 getFather() {
        return father;
    }

    public void setFather(Human8 father) {
        this.father = father;
    }

    public Human8 getMother() {
        return mother;
    }

    public void setMother(Human8 mother) {
        this.mother = mother;
    }


    public List<Object> getChildren() { return children; }
    public void setChildren(List<Object> children) { this.children = children; }

    public Set<Object> getPet8() { return pet8; }

    public void setPet8(Set<Object> pet8) { this.pet8 = pet8; }

    public void addChild(List<Object> child) {
        List<Object> tempArr = new ArrayList<>(children.size() + 1);
        System.arraycopy(children, 0, tempArr, 0, children.size());
        tempArr.set(tempArr.size() - 1, child);
//        child.setFamily(this);
        children = tempArr;
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
    public void deleteChild(List<Object> child){
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).equals(child)) deleteChild(i);
        }
    }


    public int countFamily(){
        return 2 + children.size();

    }

    @Override
    public String toString() {
        return "Family8{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet8=" + pet8 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family7)) return false;
        Family7 family = (Family7) o;
        return father.equals(family.getFather()) &&
                mother.equals(family.getMother());
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
                ", pet8=" + pet8 +
                '}');
    }

}
