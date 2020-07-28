package com;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Arrays;

class DemoFamily6Test {
    private Human6 humanChild1;
    private Human6 humanChild2;
    private Human6 humanChild3;
    private Human6 humanChild4;
    public Family6 family7;
    private Pet6 pet;
    private Human6 humanTest2;
    private Human6 humanTest1 ;
    @BeforeEach
    void setUp() {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        String[][] schedule1 = new String[][] {{String.valueOf(friday), "task"},{String.valueOf(sunday), "task2"}};
        String[][] schedule2 = new String[][] {{String.valueOf(wednesday), "task4"},{String.valueOf(monday), "task5"}};
        pet = new Pet6(Species.DOG, "Paddy", 5, 50, new String[]{"eat","run"});
        humanTest2 = new Human6("Elene", "Karleone", 1987, 90, schedule2);
        humanTest1 = new Human6("Michael", "Karleone", 1977,80, schedule1);
        humanChild1 = new Human6("Bob", "Karleone", 2010, 100, schedule2);
        humanChild2 = new Human6("Anna", "Karleone", 2010, 100, schedule2);
        humanChild3 = new Human6("Johan", "Karleone", 2010, 100, schedule2);
        humanChild4 = new Human6("Yan", "Karleone", 2010, 100, schedule2);
        family7 = new Family6(humanTest1, humanTest2, new Human6[]{humanChild1, humanChild2, humanChild3}, pet);
    }
    @Test
    public void testToString() {
        String expected = "Karleone";
        assertEquals(expected, humanTest1.getSurname());
    }
     @Test
     public void addChild(){
         family7.addChild(humanChild4);
         assertEquals(6, family7.countFamily());
     }
     @Test
     public void  countFamily(){
        assertEquals(5, family7.countFamily());
     }
     @Test
        void deleteChildByIndex() {
          family7.deleteChild(0);
          assertNotNull(humanChild1);
          assertEquals(4, family7.countFamily());
      }
     @Test
        void deleteChildByEquals() {
         family7.deleteChild(humanChild2);
         assertNotNull(humanChild2);
         assertEquals(4, family7.countFamily());
      }


}