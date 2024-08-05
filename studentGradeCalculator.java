import java.util.Scanner;
class studentGradeCalculator {
	public void size() throws InterruptedException{
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of an array : ");
	int size = sc.nextInt();
	
	String [] subjectName = new String [size];
	double [] Marks = new double [size];

		for (int i =0 ; i < size ; i++){
		System.out.print("Enter the subject name : ");
		subjectName[i] = sc.next();
		System.out.print("Enter the mark : ");
		Marks[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("Generating the result");
        for (int i = 5; i >= 1; i--) {
            System.out.print(".");
            Thread.sleep(1000); // This can throw InterruptedException
        }
		System.out.println("");
		
		
		
		
		
		
		
		
		for (int i=0;i<subjectName.length ; i++){
			System.out.println(subjectName[i] + ":" +Marks[i]);
		}
		
		
		double sum = 0;
		for (int i= 0 ; i<Marks.length ; i++){
		sum = sum + Marks[i];
		}
		System.out.println("The sum of all marks is : " + sum);
		
		
		
		double averagePercentage;
		averagePercentage = sum / Marks.length;
		System.out.println("The average percentage is :" + averagePercentage + "%");
		
		System.out.print("the Grade is : ");
		if (averagePercentage >= 90){
			System.out.print("A");
		}
		else if (averagePercentage >= 75 ){
			System.out.print("B");
		}
		else if (averagePercentage >= 50){
			System.out.print("C");
		}
		else if (averagePercentage >= 35){
			System.out.print("D");
		}
		else {
			System.out.print("E");
		}
		
}
	public static void main(String[] args )throws InterruptedException {
	   studentGradeCalculator obj = new studentGradeCalculator();
	   obj.size();
	}
}