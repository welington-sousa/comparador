package br.com.welingtonsousa.comparador;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Comparador {

    public static <E> List<Diferenca> comparar(E velho, E novo)
	    throws Exception {
	List<Diferenca> diferencas = new ArrayList<>();

	Class<?> clazz = velho.getClass();

	for (Method method : clazz.getMethods()) {
	    if (method.getName().startsWith("get")
		    && method.getParameterCount() == 0
		    && method.getReturnType() != void.class) {

		Object valorVelho = method.invoke(velho);
		Object valorNovo = method.invoke(novo);

		if (!valorNovo.equals(valorVelho)) {
		    Diferenca diferenca = new Diferenca(method.getName(),
			    valorNovo, valorVelho);
		    diferencas.add(diferenca);
		}
	    }
	}

	return diferencas;
    }
}
