package gerador;

public class principal {
	
	
		//*******************************************************************************//
		//                                BPMN-Core                                      //
		//*******************************************************************************//
		//  Nome autor: Paulo Castro                                                     //
		//  Descricao: Metodo que compoe a classe geradora de aplicativos dinamicos.     //
		//  Metodos estaticos onde ficarao todas as regras de negocios.                  // 
		//*******************************************************************************//
		//                        Endereco Repositorio GitHub                            // 
		//*******************************************************************************//
		//    GitHub:																     //
	    //    Data primeiro commit:                                                      // 	
		//*******************************************************************************//
		//*******************************************************************************//
		//    GitHub:https:																 //
	    //    Data ultimo commit:                                                        // 	
		//*******************************************************************************//
		//*******************************************************************************//
		//Caminho da Classe: Caminho onde as classes serao criadas Ex: (C:\\testeNSA\\classe\\)
		//Caminho: Caminho do diagrama BPMN Ex: (C:\\testeNSA\\nome.xml)
		//Tag: Indica de onde as informa«ıes ser„o tiradas do diagrama BPMN Ex: (bpmn2:dataStoreReference)
		//Atributo:Tag que ser· buscada no arquivo que contem o diagrama BPMN Ex: (NAME)
		//Ex:objeto.criarClasse("C:\\testeNSA\\classe\\", "C:\\testeNSA\\nome.xml", "bpmn2:dataStoreReference", "name");
		//Desenolvedor: Paulo Castro 02/11/2017
	    //*******************************************************************************//

	public static void main(String[] args) {
		
		//geradorClasseBpmn objeto = new geradorClasseBpmn();
		//objeto.criarClasse("C:\\testeNSA\\classe\\", "C:\\testeNSA\\testeClasse.xml", "bpmn2:gerarClasse", "name");
		
		        geradorClasseAPI objeto = new geradorClasseAPI();
				objeto.criarClasse("C:\\testeNSA\\domain\\", "C:\\testeNSA\\testeClasse.xml", "bpmn2:gerarClasse", "name","br\\com\\cadastro","Validacao campo\nValidacao campo2","[cadastro:Cadastro]");

	}

}
