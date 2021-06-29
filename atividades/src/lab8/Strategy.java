package lab8;

import lab8.exception.DivisaoPorZeroException;

// (2) interface que define a operação do algoritmo
public interface Strategy {

	public int execute(int a, int b) throws DivisaoPorZeroException;
}
