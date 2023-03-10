package Ex1.Comparator;

import Ex1.Animal;

import java.util.Comparator;

public class SortByWeightDESC implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o2.getWeight() < o2.getWeight()){
            return -1;
        }
        if (o2.getWeight() == o2.getWeight()){
            return 0;
        }
        return 1;
    }
}
