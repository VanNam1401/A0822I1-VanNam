package Case_study_new.libs;

public class CatchRegexIntegerImpl implements CatchRegexInteger{

    @Override
    public int regexInteger() {
        boolean checkSalary = true;
        int salary = 0;
        while (checkSalary){
            try {
                salary = Integer.parseInt(scanner.nextLine());
                checkSalary = false;
            }catch (RuntimeException ex){
                System.out.println("Nhập số vào: ");
            }
        }
        return salary;
    }
}
