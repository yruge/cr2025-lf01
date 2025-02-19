package exercise.the_bloaters;

public class ExtractSubClass {

    abstract class JobItem {
        public abstract int getUnitPrice();
        public abstract int getTotalPrice();
    }

    class LaborItem extends JobItem {
        private int quantity;
        private Employee employee;

        public LaborItem(int quantity, Employee employee) {
            this.quantity = quantity;
            this.employee = employee;
        }

        @Override
        public int getUnitPrice() {
            return employee.getRate();
        }

        @Override
        public int getTotalPrice() {
            return quantity * getUnitPrice();
        }
    }

    class PartsItem extends JobItem {
        private int quantity;
        private int unitPrice;

        public PartsItem(int quantity, int unitPrice) {
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        @Override
        public int getUnitPrice() {
            return unitPrice;
        }

        @Override
        public int getTotalPrice() {
            return quantity * getUnitPrice();
        }
    }

    class Employee {
        private int rate;

        public Employee(int rate) {
            this.rate = rate;
        }

        public int getRate() {
            return rate;
        }
    }

    public void action() {
        Employee kent = new Employee(50);
        JobItem j1 = new LaborItem(5, kent);
        JobItem j2 = new PartsItem(15, 10);
        int total = j1.getTotalPrice() + j2.getTotalPrice();
        System.out.println(total);
    }

    public static void main(String[] args) {
        new ExtractSubClass().action();
    }
}
