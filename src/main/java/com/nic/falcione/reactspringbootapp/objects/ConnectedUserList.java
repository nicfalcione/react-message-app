package com.nic.falcione.reactspringbootapp.objects;

import java.util.List;
import java.util.Objects;

/**
 * A data structure to house a list of connected Users and perform basic actions on them.
 * 
 * @author Nic Falcione
 */
public class ConnectedUserList {
    
    private List<ConnectedUser> connectedUsers;

    public ConnectedUserList() {
    }

    public ConnectedUserList(List<ConnectedUser> connectedUsers) {
        this.connectedUsers = connectedUsers;
    }

    public List<ConnectedUser> getConnectedUsers() {
        return this.connectedUsers;
    }

    public void setConnectedUsers(List<ConnectedUser> connectedUsers) {
        this.connectedUsers = connectedUsers;
    }

    public ConnectedUserList connectedUsers(List<ConnectedUser> connectedUsers) {
        setConnectedUsers(connectedUsers);
        return this;
    }

    public void handleUser(ConnectedUser user) {
        
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ConnectedUserList)) {
            return false;
        }
        ConnectedUserList connectedUserList = (ConnectedUserList) o;
        return Objects.equals(connectedUsers, connectedUserList.connectedUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(connectedUsers);
    }

    @Override
    public String toString() {
        return "{" +
            " connectedUsers='" + getConnectedUsers() + "'" +
            "}";
    }
}
