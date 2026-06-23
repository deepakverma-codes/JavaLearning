package com.deepak.aiml;

public class CH08_01_CustomJavaClass {
   public static void main(String[] args) {
       System.out.println("-----This is my own java custom class------");
       Employee deepak = new Employee();
       Employee harry = new Employee();

        harry.setId(102);
       harry.setName("CodeWithHarry");
       harry.setSalary(20000);


       System.out.println(deepak.toString());
       System.out.println(harry);

    }

    public static class Employee {
        private int id=80;
        private String name;
        private int salary;
        private boolean is_active;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public boolean isIs_active() {
            return is_active;
        }

        public void setIs_active(boolean is_active) {
            this.is_active = is_active;


        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", is_active=" + is_active +
                    '}';
        }
    }
}





