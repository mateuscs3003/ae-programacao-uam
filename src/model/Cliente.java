package model;

public class Cliente {

    private String cpf;
    private String email;
    
    public Cliente (String cpf, String email){
        this.cpf = cpf;
        this.email = email;
    }

    public Cliente(){
        
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

}