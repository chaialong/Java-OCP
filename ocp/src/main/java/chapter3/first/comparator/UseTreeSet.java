package chapter3.first.comparator;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabbit { int id;

        public Rabbit(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Rabbit{" +
                    "id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {
        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbits.add(new Rabbit(2));
        rabbits.add(new Rabbit(5));
        System.out.println(rabbits);
    }
}
