package designPatterns;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emp = new Employees();
        emp.loadData();
        Employees e1 = (Employees)emp.clone();

        emp.empList.add("John");
        e1.empList.add("Mark");
        System.out.println("Original: " + emp.empList);
        System.out.println("Prototype: " + e1.empList);

    }

    static class Employees {
        List<String> empList;

        public Employees() {
          empList =  new ArrayList<>();
        }

        public Employees(List<String> emps) {
            this.empList = emps;
        }

        public void loadData() {
            empList.add("mayank");
            empList.add("ranjan");
            empList.add("prasad");
        }

        protected Object clone() throws ClassCastException {
            List<String> emps = new ArrayList<>();
            for (String s : this.empList) {
                emps.add(s);
            }
            return new Employees(emps);
        }
    }
}
