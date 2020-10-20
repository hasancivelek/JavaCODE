package Week_11;

public class GCConcept {

	public static void main(String[] args) {
		
/*Garbage means unreferenced objects
 * 3 ways to be eligible for Garbage Collection
 * 
 */
// Nulling the reference
		GCConcept s1= new GCConcept();// object will be collected by GC
		s1=null;
		
		//Assigning references to each other
		GCConcept s2= new GCConcept();
		GCConcept s3= new GCConcept();
		
		s2=s3;
		
		//Anonymous objects
		new GCConcept();
		
		Integer num= new Integer(99);//garbage
		
		num=new Integer(4298);//garbage
		System.out.println(num);
		num=null;
	}

}
