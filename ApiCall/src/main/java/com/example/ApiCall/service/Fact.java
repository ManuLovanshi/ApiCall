package com.example.ApiCall.service;
import java.time.LocalDateTime;

public class Fact {
    // Unique ID for the Fact
    private String id;

    // Version number of the Fact
    private int version;

    // ID of the User who added the Fact
    private String user;

    // The Fact itself
    private String text;

    // Date when the Fact was last modified
    private LocalDateTime updatedAt;

    // If the Fact is meant for one-time use, this is the date it is used
    private LocalDateTime sendDate;

    // Whether the Fact has been soft-deleted
    private boolean deleted;

    // Source from which the Fact was found (typically a URL)
    private String source;

    // Type of animal the Fact describes (e.g., 'cat', 'dog', 'horse')
    private String type;

    // Status information
    private Status status;
    
    // Reason for the Fact being approved or rejected
    private String feedback;

    // Nested class for Status
    public static class Status {
        // Whether the Fact has been approved or rejected (null indicates pending status)
        private Boolean verified;

        // The number of times the Fact has been sent by the CatBot
        private int sentCount;

        // Getters and setters for Status
        public Boolean getVerified() {
            return verified;
        }

        public void setVerified(Boolean verified) {
            this.verified = verified;
        }

        public int getSentCount() {
            return sentCount;
        }

        public void setSentCount(int sentCount) {
            this.sentCount = sentCount;
        }
    }

    // Getters and setters
    public String getFeedback() {
    	return feedback;
    }
    
    public void setFeedback(String feedback) {
    	this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
