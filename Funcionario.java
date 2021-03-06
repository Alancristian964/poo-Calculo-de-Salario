
public class Funcionario{
	private String nome;
	private int maxDiarias;
	private int diarias;
    private double salario;
	
	public Funcionario(String nome, int maxDiarias){
		this.nome = nome;
		this.maxDiarias = maxDiarias;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}	

	public int getDiarias(){
		return this.diarias;
	}
	public void setDiarias(int diarias){
		this.diarias = diarias;
	}

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
        
        
	public boolean addDiaria(){
		if(this.diarias >= this.maxDiarias){
			return false;
		}else{
			this.diarias++;
			return true;
		}
	}
	public String toString(){
		String res = "";
		res += "Nome: " + this.nome + "\n" +
				"Diarias: " + this.diarias + "\n" +
                        "Salario: " + this.salario + "\n";
		return res;
	}

}

