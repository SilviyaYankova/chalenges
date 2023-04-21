package tasksix;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Shop shop = new Shop("test");
        MarketingSpecialist marketingSpecialist = new MarketingSpecialist();
        SalesConsultant salesConsultant = new SalesConsultant();
        shop.addWorker(marketingSpecialist);
        shop.addWorker(salesConsultant);

        marketingSpecialist.spendMoney(1000);
        System.out.println(marketingSpecialist.getBudget());
        System.out.println(marketingSpecialist.getWorkingShop().getName());

        salesConsultant.sellProduct(150);
        System.out.println(salesConsultant.getMoney());
        System.out.println(salesConsultant.getWorkingShop().getName());

        List<Worker> workers = shop.getWorkers();
        workers.forEach(System.out::println);
        System.out.println(shop);
    }
}
