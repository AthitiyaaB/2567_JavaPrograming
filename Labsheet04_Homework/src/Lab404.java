import java.util.*;

public class Lab404 {

    public static void main(String[] args) {
        inputStudent();
    }

    public static void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        String studentId, subjectCode;
        boolean isStudentIDValid, isSubjectCodeValid;
        
        while (true) {
            System.out.print("Enter student Id: ");
            studentId = scanner.nextLine();

            System.out.print("Enter subject code: ");
            subjectCode = scanner.nextLine();

            isStudentIDValid = isLength(studentId, 10);
            isSubjectCodeValid = isLength(subjectCode, 7);

            if (isStudentIDValid && isSubjectCodeValid) {
                boolean isITStudent = isITStudent(studentId);
                boolean isITSubject = isITSubject(subjectCode);

                displayData(studentId, isITStudent, isITSubject);
                break;
            }
        }
        scanner.close();
    }

    public static boolean isLength(String input, int requiredLength) {
        return input.length() == requiredLength;
    }

    public static boolean isITStudent(String studentID) {
    	String itStudentId = studentID.substring(0, 6);
    	return itStudentId.equals("211311") ;
    }

    public static boolean isITSubject(String subjectCode) {
        if (subjectCode.length() == 7) {
            String facultyCode = subjectCode.substring(0, 2);
            char year = subjectCode.charAt(4);
            return facultyCode.equals("21") && year == '1';
        }
        return false;
    }

    public static void displayData(String studentId, boolean isITStudent, boolean isITSubject) {
    	System.out.println();
        System.out.print("Student id: " + studentId);
        if (isITStudent) {
            System.out.println(" 1st year student in IT");
        } else {
            System.out.println(" is not 1st year student in IT");
        }
        
        if (isITSubject && isITStudent) {  
            System.out.println("Enroll in courses for Year 1");
        } 
        else if (isITStudent && !isITSubject) {
            System.out.println("not enroll in courses for Year 1");
        }
        else if (!isITStudent && isITSubject) {
        	System.out.println("Enroll in courses for Year 1");
        } 
               
    }
}

