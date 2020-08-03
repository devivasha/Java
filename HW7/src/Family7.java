import java.util.Arrays;
import java.util.Objects;


public class Family7 {
    private Human7 father;
    private Human7 mother;
    private Human7[] children = new Human7[0];
    private Pet7 pet7 = new Pet7() {
        @Override
        public void respond() {
        }
    };

    public Family7(Human7 father, Human7 mother, Human7[] children, Pet7 pet7) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        for (Human7 child : children) {
            if (child.getFamily() != null) {
                child.getFamily().deleteChild(child);
            }
            child.setFamily(this);
        }

        father.setFamily(this);
        mother.setFamily(this);
        this.pet7 = pet7;
    }

    public Human7 getFather() {
        return father;
    }

    public void setFather(Human7 father) {
        this.father = father;
    }

    public Human7 getMother() {
        return mother;
    }

    public void setMother(Human7 mother) {
        this.mother = mother;
    }

    public Human7[] getChildren() {
        return children;
    }

    public void setChildren(Human7[] children) {
        this.children = children;
    }

    public Pet7 getPet7() {
        return pet7;
    }

    public void setPet7(Pet7 pet7) {
        this.pet7 = pet7;
    }
    public void addChild(Human7 child) {
        Human7[] tempArr = new Human7[children.length + 1];
        System.arraycopy(children, 0, tempArr, 0, children.length);
        tempArr[tempArr.length - 1] = child;
        child.setFamily(this);
        children = tempArr;
    }

    public void deleteChild(int index){
        if (index < 0 ||index > this.children.length -1 ){
            return;
        }
        Human7[] tempChildren = new Human7[this.children.length-1];
        for(int i = 0; i < children.length; i++){
            if(i< index ) {
                tempChildren[i] = this.children[i];
            } else if (i>index){
                tempChildren[i-1] = this.children[i];
            }
        }
        children = tempChildren;
    }
    public void deleteChild(Human7 child){
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
                ", pet7=" + pet7 +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family7)) return false;
        Family7 family = (Family7) o;
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
                ", pet7=" + pet7 +
                '}');
    }

}
