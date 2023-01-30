package br.com.javatagua.sa1.app4;

import br.com.javatagua.sa1.bo.*;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resp = JOptionPane.showInputDialog("Clientes especiais");
		
		//Convertendo
		int cliente = Integer.parseInt(resp);
		
		//Criando objeto
		ClientesBO abo = new ClientesBO();
		
		JOptionPane.showMessageDialog(null,"Cada pessoa irá receber: " + abo.calcularClientes(cliente));
	}

}
