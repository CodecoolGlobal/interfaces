public class Mortage extends Credit {

    private int provision = 5000;

    public Mortage(int value) {
        super(value);
    }

    @Override
    public int getBankProvision() {
        return provision;
    }


}
