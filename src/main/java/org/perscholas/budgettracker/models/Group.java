package org.perscholas.budgettracker.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;


import java.util.Set;
import java.util.TreeSet;

@NoArgsConstructor@AllArgsConstructor
@Setter@Getter

@Slf4j


@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    private User user;


    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy ="group")
    private Set<Category> categories = new TreeSet<>();




}
