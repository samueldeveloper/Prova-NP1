package Dao;

import java.util.ArrayList;

import Model.Usuario;

public class Agenda {

	ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
	
	
	public void cadastrarUsuario(Usuario user){
		listaUsuario.add(user);
		//System.out.println(user.nome);
	}
	
	public ArrayList<Usuario> listar(){
		return listaUsuario;
	}
	
	public void excluirUsuario(Usuario user){
		listaUsuario.remove(user);
	}
	
}
