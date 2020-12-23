package task6;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter candidate aadhar ID");
		long aadharId=sc.nextLong();
		System.out.println("Enter candidate name");
		String candidateName=sc.next();
		System.out.println("Enter candidate age");
		Integer age=sc.nextInt();
		
		try
		{
		Candidate candidate=new Candidate();
		candidate.setCandidateName(candidateName);
		candidate.setAadharId(aadharId);
		candidate.setAge(age);
		CandidateBO candidate1=new CandidateBO();
		candidate1.candidateDetails(candidate);
		}
		catch(InvalidAgeRangeException e)
		{
			System.out.println(e);
			System.out.println(e.getClass().getSimpleName());
		}		
sc.close();

	}

}
