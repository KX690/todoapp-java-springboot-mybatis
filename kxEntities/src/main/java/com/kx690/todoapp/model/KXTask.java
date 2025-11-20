package com.kx690.todoapp.model;

import java.util.Objects;

public class KXTask {

    private String id;
    private String userId;
    private String title;
    private String description;
    private boolean completed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        KXTask kxTask = (KXTask) o;
        return completed == kxTask.completed && Objects.equals(id, kxTask.id) && Objects.equals(userId, kxTask.userId) && Objects.equals(title, kxTask.title) && Objects.equals(description, kxTask.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, title, description, completed);
    }

    @Override
    public String toString() {
        return "KXTask{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}
