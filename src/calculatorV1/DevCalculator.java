package calculatorV1;

public class DevCalculator {

	public static void main(String[] args) {
		EmployeeCalculatorV51 davCal = new EmployeeCalculatorV51();
		davCal.wellCome();
		for(int i=0;i<4;i++) {
		davCal.getInput();
		davCal.calculateSalary();
		davCal.displayOutput();
		if(!davCal.doYouWantToContinue()) {
			break;
		}
		}
	davCal.exitProgram();
		


    }
}