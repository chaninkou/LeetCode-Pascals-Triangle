package leetcode118;

public class Main {
	public static void main(String[] args) {
		int numRows = 6;
		
		System.out.println("Input: " + numRows);
		
		FindPascalsTriangleFunction solution = new FindPascalsTriangleFunction();
		
		System.out.println("Solution: " + solution.generate(numRows));
	}
}
