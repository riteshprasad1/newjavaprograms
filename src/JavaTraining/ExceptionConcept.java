package JavaTraining;

public class ExceptionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division();
	}

	public static void division() {
		int i = 10;
		try {
			System.out.println("Inside try block");
			int j = i / 0;
		}

		// catch(ArithmeticException e) {
		// System.out.println(e.getMessage());
		// System.out.println(e.getStackTrace());
		// }
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		} finally {
			System.out.println("Inside finally block");
		}
	}
}
