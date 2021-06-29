package lab8;

public class Subtracao implements Strategy {

	@Override
	public int execute(int a, int b) {
		return a - b;
	}

}