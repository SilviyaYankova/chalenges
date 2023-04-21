package tasksix;

import java.util.StringJoiner;

class MarketingSpecialist extends Worker {
    private double budget = 5000.00;

    public void spendMoney(double marketingCampaignCost) {
        this.budget -= Math.max(marketingCampaignCost, 0);
    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MarketingSpecialist.class.getSimpleName() + "[", "]")
                .add("budget=" + budget)
                .add("workingShop=" + getWorkingShop().getName())
                .toString();
    }
}
