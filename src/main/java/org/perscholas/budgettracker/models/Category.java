package org.perscholas.budgettracker.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;

import java.util.Set;
import java.util.TreeSet;



@NoArgsConstructor@AllArgsConstructor
@Setter @Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j


@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    BigDecimal budget;
    String name;
    Date startDate;
    Date endDate;

    @ManyToOne
    Group group;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
    Set<Transaction> transactions = new TreeSet<>();

}
