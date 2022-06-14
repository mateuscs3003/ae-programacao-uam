package controller;

import java.util.ArrayList;
import model.Cliente;

public class Cadastro {
    private ArrayList<Cliente> cadastro = new ArrayList<>();
    
    public boolean cadastrar_cliente(Cliente cliente){
        if(cliente != null){
            cadastro.add(cliente);
            return true;
        }else {
            return false;
        }
    }
    
    public ArrayList<Cliente> mostrar_dados(){
        return cadastro;
    }
    
    public void atualizar_dados(String valor){
        for(int i = 0; i < cadastro.size(); i++){
            if(valor.equals(cadastro.get(i).getCpf())){
                cadastro.get(i).setEmail(valor);
            } 
        }
    }
    
    public boolean verificar_cliente(String cpf){
        for(int i = 0; i < cadastro.size(); i++){
            if(cpf.equals(cadastro.get(i).getCpf())){
                return true;
        }
        } return false;
    } 
    
}
