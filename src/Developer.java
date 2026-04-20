public class Developer extends Employee {
    private final String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName,
                     double baseSalary, String mainLanguage, int repositoryCount) {
        super(firstName, lastName, employeeId, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    @Override
    public double calculateMonthlyCost(){
        return 2.28;

    }

    @Override
    public String introduceYourself(){
        return "Hello, I am " + this.getFirstName() + " " + this.getLastName()
                + "I code in "+ this.mainLanguage;
    }

    public void printTechnologies(){
        System.out.println("Technologies");
    }



}
