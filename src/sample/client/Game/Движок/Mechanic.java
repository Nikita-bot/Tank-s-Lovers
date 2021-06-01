package sample.client.Game.Движок;

public class Mechanic {
    private int x;
    private int y;

    public int moveUp(int y){
        return y-5;
    }
    public int moveDown(int y){
        return y+5;
    }
    public int moveRight(int x){
        return x+5;
    }
    public int moveLeft(int x){
        return x-5;
    }

}
