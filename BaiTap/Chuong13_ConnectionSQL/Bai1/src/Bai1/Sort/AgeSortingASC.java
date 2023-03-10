package Bai1.Sort;

import Bai1.Cat;

import java.util.Comparator;

public class AgeSortingASC implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() - o2.getAge();
    }
}
