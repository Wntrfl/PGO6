import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName){
        this.projectName = projectName;
        employees = new ArrayList<>();

    }

    public void addEmployee (Employee e){
        employees.add(e);
    }
    public void printProjectTeam(){
        System.out.println(employees.toString());
    }

    public double calculateTotalCost(){
        double totalCost = 0;
        for(Employee e: employees){
            totalCost+= e.calculateMonthlyCost();
        }
        return totalCost;
    }

    public Employee findByID(String id){
        for(int i = 0; i < employees.size(); i++){
            if (id == employees.get(i).getEmployeeID()){
                return employees.get(i);
            }
        }
        return null;
    }

    public void printDevelopers(){
        for (int i = 0; i< employees.size(); i++){
            if(employees.get(i) instanceof Developer){
                System.out.println(employees.get(i).toString());
            }
        }

    }

    public void printAutomationTesters(){
        for (int i = 0; i< employees.size(); i++){
            if(employees.get(i) instanceof Tester && ((Tester) employees.get(i)).getAutomationTester()== true ){
                System.out.println(employees.get(i).toString());
            }
        }

    }




}
