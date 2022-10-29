package agence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deidinecheigeur-pc
 */
public class User {
    String username;
    String password;
    int id;
    public User(int id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;
        
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", id=" + id + '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
    
}
