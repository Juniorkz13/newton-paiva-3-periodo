package prova1;

public class Filme {

		private String titulo;
		private int ano;
		private String atorPrincipal;
		private String atorSecundario;
		private float nota;
		
		
		public Filme(String titulo, int ano, String atorPrincipal, String atorSecundario, float nota) {
		
			this.titulo = titulo;
			this.ano = ano;
			this.atorPrincipal = atorPrincipal;
			this.atorSecundario = atorSecundario;
			this.nota = nota;
		}
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public String getAtorPrincipal() {
			return atorPrincipal;
		}
		public void setAtorPrincipal(String atorPrincipal) {
			this.atorPrincipal = atorPrincipal;
		}
		public String getAtorSecundario() {
			return atorSecundario;
		}
		public void setAtorSecundario(String atorSecundario) {
			this.atorSecundario = atorSecundario;
		}
		public float getNota() {
			return nota;
		}
		public void setNota(float nota) {
			this.nota = nota;
		}
		
		
}
