package tasksix;

import java.util.StringJoiner;

class SalesConsultant extends Worker {
    private double earnedMoney;

    public void sellProduct(double price) {
        this.earnedMoney += Math.max(price, 0);
    }

    public double getMoney() {
        return this.earnedMoney;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SalesConsultant.class.getSimpleName() + "[", "]")
                .add("earnedMoney=" + getMoney())
                .add("workingShop=" + getWorkingShop().getName())
                .toString();
    }
}
