package copa

class Grupo {

    String letra
	
	
	 static hasMany = [selecao:Selecao]
	 
	
	 String toString(){
		this.letra
	}
	 
	static constraints = {
	
	letra(nullable:false, blank:false, unique:true, maxSize:1)
	
    }
}