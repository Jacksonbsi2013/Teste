package copa

class Jogador {

     String nome
     int idade
	 String nome_camisa
	 
	 static belongsTo = [selecao:Selecao]
	 
	 String toString(){
		this.nome_camisa
	}

	 static constraints = {
	
	nome(nullable:false, blank:false, maxSize:80)
	idade(nullable:false, blank:false)
	nome_camisa(nullable:false, blank:false, unique:true)
	selecao(nullable:false)
		
    }
}
