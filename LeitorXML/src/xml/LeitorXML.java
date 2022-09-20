package xml;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class LeitorXML {

	public static void main(String[] args) {
		
		
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
		     try {
				Document doc = builder.parse("C:\\Users\\Maiara\\.ms-ad\\XMLFuncionarios.xml");
				
				NodeList listaDeDATA = doc.getElementsByTagName("ROW");
				
				int tamanhoLista = listaDeDATA.getLength();
				
				for (int i = 0; i < tamanhoLista; i++) {
					
					Node noROW = listaDeDATA.item(i);
					
					
					
					if(noROW.getNodeType() == Node.ELEMENT_NODE) {
						
						Element elementoROW = (Element) noROW;
						
						String IdFuncionario = elementoROW.getAttribute("IdFuncionario");
						
						
						NodeList listaDeFilhosDeROW = elementoROW.getChildNodes();
						
						int tamanhoListaFilho = listaDeFilhosDeROW.getLength();
						
						for (int j = 0; j < tamanhoListaFilho; j++) {
							
							Node nofilho = listaDeFilhosDeROW.item(j);
							
							if (nofilho.getNodeType() == Node.ELEMENT_NODE ) {
								
								Element elementoFilho = (Element) nofilho;
								
							switch (elementoFilho.getTagName()) {
							
							case "IdFuncionario":
								System.out.println("IdFuncionario =" + elementoFilho.getTextContent());
								break;
							
							case "Nome":
								System.out.println("Nome =" + elementoFilho.getTextContent());
								break;
								
							case "Email":
								System.out.println(" Email =" + elementoFilho.getTextContent());
								break;
								
							case "Sexo":
								System.out.println(" Sexo =" + elementoFilho.getTextContent());
								break;
								
							case "Departamento":
								System.out.println(" Departamento =" + elementoFilho.getTextContent());
								break;
								
							case "Admissao":
								System.out.println(" Admissao =" + elementoFilho.getTextContent());
								break;
								
							case "Salario":
								System.out.println(" Salario =" + elementoFilho.getTextContent());
								break;
								
							case "Cargo":
								System.out.println(" Cargo =" + elementoFilho.getTextContent());
								break;
							
							case "IdRegiao":
								System.out.println(" IdRegiao =" + elementoFilho.getTextContent());
								break;
							
							case "Exportado":
								System.out.println(" Exportado =" + elementoFilho.getTextContent());
								break;
							
														
							
							}
								
						}
							
					}
						
				}
					
			}
			
			} catch (SAXException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
		}

	}

}
