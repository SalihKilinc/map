package Abstraction;

public class Dikdortgen extends Sekil{


    public  int kk,uk;

    @Override
    public int cevre() {
        return 2*(kk+uk);
    }

    @Override
    public int alan() {
        return kk*uk;
    }
}
