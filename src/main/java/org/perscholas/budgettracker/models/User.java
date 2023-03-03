package org.perscholas.budgettracker.models;

import jakarta.persistence.*;
import lombok.*;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;
import java.util.TreeSet;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Slf4j



@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

   @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "user")
   private Set<Group> groups = new TreeSet<>();

}
