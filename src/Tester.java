public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName,
                  double baseSalary, boolean automationTester, int scenarioCount){
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    @Override
    public double calculateMonthlyCost(){
        return this.getBaseSalary()*1.6;

    }

    @Override
    public String introduceYourself(){
        return "Hello, I am tester";
    }

    public void runTestingReport(){
        System.out.println("Testing");
    }

    public boolean getAutomationTester(){
        return this.automationTester;
    }

    public int getScenarioCount(){
        return this.scenarioCount;
    }


}
