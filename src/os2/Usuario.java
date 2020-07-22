/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

/**
 *
 * @author Heitor
 */
public class Usuario {
       private int id;
       private String NameUser;
       private String Password;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the NameUser
     */
    public String getNameUser() {
        return NameUser;
    }

    /**
     * @param NameUser the NameUser to set
     */
    public void setNameUser(String NameUser) {
        this.NameUser = NameUser;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
}
