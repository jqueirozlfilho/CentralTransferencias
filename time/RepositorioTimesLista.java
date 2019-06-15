package time;

public class RepositorioTimesLista implements RepositorioTimes {
	private Time time;
	private RepositorioTimesLista next;
	
	public RepositorioTimesLista() {
		this.time = null;
		this.next = null;
	}
	
	public void inserir (Time time) {
		if (this.time == null){
			this.time = time;
			this.next = new RepositorioTimesLista();
		} else{
			this.next.inserir(time);
		}
	}
	
	@Override
	public void remover (String nome) {
		if (nome.equals(this.time.getNome())) {
			this.time = this.next.time;
	        this.next = this.next.next;
	        } else {
	          this.next.remover(nome);
	        }
	}
	
	public boolean existe (String nome) {
        if (nome.equals(this.time.getNome())) {
            return true;
        } else if (this.next!= null){
            return this.next.existe(nome);
        } else {
            return false;
        }
    }
	
	public void atualizar (String nome, Time time) {
		if (nome.equals(this.time.getNome())) {
			this.time = time;
		} else {
			this.next.atualizar(nome, time);
		}
	}
	
	public Time procurar (String nome) {
		Time returning = null;
		if (nome.equals(this.time.getNome())) {
			returning = this.time;
		} else {
			this.next.procurar(nome);
		}
		return returning;
	}

	
	
}
