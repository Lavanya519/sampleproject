package task6;

public class CandidateBO {
	public void candidateDetails(Candidate candidate) throws InvalidAgeRangeException
	{
		if(candidate.getAge()>21 && candidate.getAge()<37)
		{
			System.out.print("Hi " +candidate.getCandidateName());
			System.out.println(", you are eligible");
		}
		else
		{
			throw new InvalidAgeRangeException();
		}
	} 

}
