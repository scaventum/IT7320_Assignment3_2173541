package IT7320;

public class CalcImplementation {
	
	CalcInterface intObj;
	
	public int addTwoNums(int a, int b) {
		return intObj.add(a, b);
	}
	
	public int substractTwoNums(int a, int b) {
		return intObj.substract(a, b);
	}
	
	public int multiplyTwoNums(int a, int b) {
		return intObj.multiply(a, b);
	}
	
	public double divideTwoNums(int a, int b) {
		return intObj.divide(a, b);
	}

	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}
	
}
