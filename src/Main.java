public class Main {
	public static void main(String[] args) {
		String string = "I Like to code near the Lake with my friend Luke";

		string=string.replaceAll("(?i)(?<!friend\s)l\\w*ke", "BLA");
		System.out.println(string);
	}
}