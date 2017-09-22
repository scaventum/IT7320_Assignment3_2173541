package IT7320;

public class CalcImplementation {
	
	CalcInterface intObj;
	
	public int addTwoNums(int a, int b) {
		return intObj.add(a, b);
	}
	
	public int substractTwoNums(int a, int b) {
		return intObj.add(a, b);
	}
	
	public int multiplyTwoNums(int a, int b) {
		return intObj.add(a, b);
	}
	
	public int divideTwoNums(int a, int b) {
		return intObj.add(a, b);
	}

	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}
	
}
