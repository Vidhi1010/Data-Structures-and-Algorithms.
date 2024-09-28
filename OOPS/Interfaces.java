package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();

        Bear bear = new Bear();
        bear.eatHerb();
        bear.eatFlesh();
    }
}
//Multiple Interface

interface Herbivores {
    void eatHerb();
}
interface Carnivores {
    void eatFlesh();
}

class Bear implements Herbivores, Carnivores {
    public void eatHerb() {
        System.out.println("Eats grass");
    }
    public void eatFlesh() {
        System.out.println("Eats meat");
    }
}

//
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal(by 1 step)");
    }
}