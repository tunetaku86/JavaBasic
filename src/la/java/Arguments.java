package la.java;

class Arguments {


public static void main(String[] args) {

		System.out.println("コマンドライン引数の数は:" + args.length + "個です。");
		System.out.println("コマンドライン引数の内容は以下の通りです");
	for (int i = 0; i < args.length; i++) {
		System.out.println("args[" + i + "] = " + args[i]);
		}
	}
}