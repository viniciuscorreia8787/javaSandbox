/**
 * 
 */
package br.com.sandbox;


import com.ibm.mq.samples.jms.JmsPutGet;

/**
 * @author vinic
 *
 */
public class TesteIBMMQ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JmsPutGet jmsPutGet = new JmsPutGet();
		
		System.out.println("inicio do teste");

		String retorno = JmsPutGet.putMessage("Message");

		System.out.println("teste - Retorno: ");
		System.out.println(retorno);
		
		System.out.println("fim do teste");
		
	}

}
