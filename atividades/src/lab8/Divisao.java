package lab8;

import lab8.exception.DivisaoPorZeroException;

public class Divisao implements Strategy {

	@Override
	public int execute(int a, int b) throws DivisaoPorZeroException {

        if (b == 0){
            throw new DivisaoPorZeroException();
        }
		return a / b;
	}

}

