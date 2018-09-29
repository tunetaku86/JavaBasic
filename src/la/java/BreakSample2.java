package la.java;

public class BreakSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][]m = {{1,2,3},{10,20,30},{100,200,300,400}};
		
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[i].length; j++) {
			if (m[i][j] == 10) {
				System.out.println("10が見つかったので中止します。");
				break;
			}
		System.out.println("m[" + i + "]" + "[" + j +"]=" + m[i][j]);
		}

	}

	}

}
