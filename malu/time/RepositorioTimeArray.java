package time;

public class RepositorioTimeArray implements RepositorioTime{
	private Time[] times;
	private int indice;
	
	public RepositorioTimeArray (int tam) {
		this.times = new Time [10];
		this.indice = 0;
	}
	
	public void inserir (Time time) {
		if (times[indice] == null) {
			times [indice] = time;
			indice = indice +1;
		} else {
			Time[] newTimes = new Time [times.length*2];
			for (int i = 0; i < times.length; i++) {
				newTimes[i] = times[i];
	        }
			times = newTimes;
			times [indice] = time;
			indice = indice + 1;
		}
	}
	
	public void remover (String nome) {
		boolean remover = false;
		for (int i = 0; i < times.length && !remover; i++) {
			if (nome.equals(times[i].getNome())){
				remover = true;
				// subscrevendo a informação do proximo para remover o atual
				for (int j = i; i < times.length; j++) {
					times[j] = times [j+1];
				}
				// atualizando o tamanho do array
				Time [] newTimes = new Time [times.length -1];
				for (int k = 0; k < newTimes.length; k++) {
					newTimes[k] = times [k];
				}
				times = newTimes;
				indice = times.length;
			}
		}
	}

	@Override
	public void atualizar(Time time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Time procurar(String nome) {
		boolean achou = false;
		Time returning = null;
		for (int i = 0; i < times.length && achou; i++) {
			if (nome.equals(times[i].getNome())) {
				achou = true;
				returning = times[i];
			}
		} 
		if (achou == false) {
				
		}
		return returning;
	}

	@Override
	public boolean existe(String nome) {
		boolean achou = false;
		for (int i = 0; i < times.length && achou == false; i++) {
			if (nome.equals(times[i].getNome())) {
				achou = true;
			}
		}
		return achou;
		
	}
}
