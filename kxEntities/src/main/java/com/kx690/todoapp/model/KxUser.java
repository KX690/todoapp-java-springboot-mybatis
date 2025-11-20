package com.kx690.todoapp.model;


import java.util.List;
import java.util.Objects;

public class KxUser {

    private Long id;
    private String username;
    private String email;
    private String password;
    private List<KxTask> tasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<KxTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<KxTask> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        KxUser kxUser = (KxUser) o;
        return Objects.equals(id, kxUser.id) && Objects.equals(username, kxUser.username) && Objects.equals(email, kxUser.email) && Objects.equals(password, kxUser.password) && Objects.equals(tasks, kxUser.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, password, tasks);
    }

    @Override
    public String toString() {
        return "KxUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
