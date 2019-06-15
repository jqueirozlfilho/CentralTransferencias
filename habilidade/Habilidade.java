package habilidade;

public class Habilidade {
	
		private double notaTotal;
		private int finalizacao;
		private int passe;
		private int interceptacao;
		
		public Habilidade() {			

			this.finalizacao = 0;
			this.passe = 0;
			this.interceptacao = 0;
		}
		
		
		public int getfinalizacao() {
	        return finalizacao;
	    }
		
		public void setfinalizacao(int finalizacao) {
	        this.finalizacao=finalizacao;
	    }
		
		public int getinterceptacao() {
			return this.interceptacao;
		}
		
		public void setinterceptacao (int interceptacao) {
			this.interceptacao = interceptacao;
		}
		
		public int getpasse() {
			return passe;
		}

	    public void setpasse(int passe) {
	        this.passe = passe;
	    }	
		
		public double notaTotal(int interceptacao, int passe, int finalizacao) {
			
			notaTotal=((interceptacao+passe+finalizacao)/3);
			
			return notaTotal;
		
	}
}
