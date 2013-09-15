package copa

class Selecao {

     String nome
	 
	  
	  static hasMany = [jogador:Jogador]
	  static belongsTo = [grupo:Grupo]
	 
	 
	 String toString(){
		this.nome
	}

    static constraints = {
	
	nome(nullable:false, blank:false, unique:true, maxSize:30)
	grupo(nullable:false)
	
    }
}
