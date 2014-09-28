package id.atiatulmaula.doubledemo;

/*
 * @author atiatulmaula.wordpress.com
 */
public class Main {

	public static void main(String[] args) {
		double nonHexa = 1.18798047987776;
		double insideHexa = 1.1879804E7;
		System.out.println("double nonHexa : " + nonHexa + "-->"
				+ (int) nonHexa);
		System.out.println("double insideHexa : " + parseDouble(insideHexa)
				+ "-->" + (int) parseDouble(insideHexa));
	}

	/**
	 * @param long double value from distance
	 * @return double value with 2 decimal
	 */
	private static double parseDouble(double param) {
		String paramStr = String.valueOf(param);
		int index = 0;
		String resultStr = paramStr;
		for (int i = 0; i < paramStr.length(); i++) {
			if (paramStr.charAt(i) == '.') {
				index = i;
				if (index + 3 < paramStr.length()) {
					resultStr = paramStr.substring(0, index + 3);
				} else {
					resultStr = paramStr.substring(0, paramStr.length());
				}
				break;
			}
		}
		double result = Double.valueOf(resultStr);
		return result;
	}
}