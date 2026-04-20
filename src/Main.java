public static void main(String[] args) {

    Employee e1 = new Employee("C1234", "Ivan", "Asddff", 12000);

    System.out.println(e1.introduceYourself());

    Employee e2 = new Employee("B3455", "Maria", "XCVB", 12000);

    System.out.println(e2.introduceYourself());
    Employee e3 = new Employee("B3455", "Maria", "XCVB", 12000);
    Employee d1 = new Developer("B3455", "Maria", "XCVB", 12000, "PITON", 1000);
    System.out.println( d1.getFirstName());
    System.out.println( e1.getFirstName());
}