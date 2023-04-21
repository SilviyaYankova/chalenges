package tasksix;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

class Shop {
    private String name;
    private List<Worker> workers;

    public Shop(String name) {
        this.name = name;
        this.workers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void addWorker(Worker worker) {
        this.workers.add(worker);
        worker.setWorkingShop(this);
    }

    public double getTurnover() {
        double turnOver = 0.0;
        for (Worker worker : this.workers) {
            if (worker instanceof SalesConsultant) {
                turnOver += ((SalesConsultant) worker).getMoney();
            }
            if (worker instanceof MarketingSpecialist) {
                turnOver += ((MarketingSpecialist) worker).getBudget();
            }
        }
        return turnOver;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Shop.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("workers=" + workers)
                .add("turnover=" + getTurnover())
                .toString();
    }
}
