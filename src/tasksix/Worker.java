package tasksix;

import java.util.StringJoiner;

abstract class Worker {
    private Shop workingShop;

    public Shop getWorkingShop() {
        return workingShop;
    }

    public void setWorkingShop(Shop workingShop) {
        this.workingShop = workingShop;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Worker.class.getSimpleName() + "[", "]")
                .add("workingShop=" + workingShop.getName())
                .toString();
    }
}
