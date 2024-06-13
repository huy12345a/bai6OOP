package pointandMoveablepoi;

public class test {
    public static void main(String[] args) {
        MovablePoind mp = new MovablePoind(2,3);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);
        mp.move().move().move();
        System.out.println(mp);
    }
}
