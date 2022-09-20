package day05_arithmetic_operations;

public class Employee {

    public static void main(String[] args) {

        String firstName = "James";
        String lastName = "Bond";
        String companyName = "MI6";
        String jobTitle = "Secret Agent";
        char suite = 'E';
        int employeeID = 7;
        int numOfPTO = 15;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName+lastName;
        String email = firstName + employeeID + "@" + companyName + ".com";
        String benefits = "$ " + salary +" salary a year, "+ numOfPTO +" PTO days and WFH";

        String summary = "Employee Information for "+ fullName + ". "+ jobTitle +
                        " for "+ companyName+ ", based in suite "+suite+ "Mr./Mrs "+ lastName+ " is fulltime: "+isFullTime
                        +" contact Mr/Mrs "+ lastName+ " at "+ email+ ". Current benefits include: "+ benefits
                ;

        System.out.println(summary);


    }

}
