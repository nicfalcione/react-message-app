package com.nic.falcione.reactspringbootapp.objects;

import java.util.Objects;

/**
 * Basic {@link Message} object to enable communication between users.
 * 
 * @author Nic Falcione
 */
public class Message {

    private final String userName;

    private final String messageContent;

    /**
     * Basic Message object
     * 
     * @param userName       - the user name
     * @param messageContent - the content of the message
     */
    public Message(String userName, String messageContent) {
        this.userName = userName;
        this.messageContent = messageContent;
    }

    /**
     * @return the user name
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return the content of the message
     */
    public String getMessageContent() {
        return this.messageContent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Message)) {
            return false;
        }
        Message message = (Message) o;
        return Objects.equals(userName, message.userName) && Objects.equals(messageContent, message.messageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, messageContent);
    }

    @Override
    public String toString() {
        return "{" +
                " userName='" + getUserName() + "'" +
                ", messageContent='" + getMessageContent() + "'" +
                "}";
    }
}
