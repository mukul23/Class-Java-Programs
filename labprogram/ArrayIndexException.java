public class ArrayIndexException{

	public static void main(String[] args) {
		try{
			int a[] = new int[10];
			a[11]  = 9 ;

		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("you are accesssing index not present in the array");
		}
	}
}