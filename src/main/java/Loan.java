public class Loan extends Credit {

    private int provision = 100000;

    public Loan(int value) {
        super(value);
    }

    @Override
    public int getBankProvision() {
        return provision;
    }

}
