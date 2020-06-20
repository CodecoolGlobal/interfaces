public abstract class Credit {

    private int value;

    public Credit(int value) {
        this.value = value;
    }

    public int getTotalValueOfCredit() {
        return value + getBankProvision();
    }

    public abstract int getBankProvision();
}
