package com.example.cloudstash.model;

import org.springframework.stereotype.Component;

@Component
public class Message {
  private String recieverID;
  private String senderPhoneNumber;
  private String messageContent;
  private long timestamp;

  public Message() {
    super();
  }

  public Message(String recieverID, String senderPhoneNumber, String messageContent, long timestamp) {
    this.recieverID = recieverID;
    this.senderPhoneNumber = senderPhoneNumber;
    this.messageContent = messageContent;
    this.timestamp = timestamp;
  }

  /**
   * @return String return the recieverID
   */
  public String getRecieverID() {
    return recieverID;
  }

  /**
   * @param recieverID the recieverID to set
   */
  public void setRecieverID(String recieverID) {
    this.recieverID = recieverID;
  }

  /**
   * @return String return the senderPhoneNumber
   */
  public String getSenderPhoneNumber() {
    return senderPhoneNumber;
  }

  /**
   * @param senderPhoneNumber the senderPhoneNumber to set
   */
  public void setSenderPhoneNumber(String senderPhoneNumber) {
    this.senderPhoneNumber = senderPhoneNumber;
  }

  /**
   * @return String return the messageContent
   */
  public String getMessageContent() {
    return messageContent;
  }

  /**
   * @param messageContent the messageContent to set
   */
  public void setMessageContent(String messageContent) {
    this.messageContent = messageContent;
  }

  /**
   * @return long return the timestamp
   */
  public long getTimestamp() {
    return timestamp;
  }

  /**
   * @param timestamp the timestamp to set
   */
  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

}
