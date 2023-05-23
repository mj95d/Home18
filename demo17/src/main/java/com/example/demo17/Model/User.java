package com.example.demo17.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name cannot be null")
    @Size(min = 4, message = "Name must be at least 4 characters")
    private String name;

    @NotNull(message = "Username cannot be null")
    @Size(min = 4, message = "Username must be at least 4 characters")
    @Column(unique = true)
    private String username;

    @NotNull(message = "Password cannot be null")
    private String password;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Invalid email address")
    @Column(unique = true)
    private String email;

    @NotNull(message = "Role cannot be null")
    @Pattern(regexp = "(user|admin)", message = "Role must be user or admin")
    private String role;

    @NotNull(message = "Age cannotbe null")
    @Min(value = 0, message = "Age must be a positive integer")
    private Integer age;
}