package org.perscholas.budgettracker.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;
@NoArgsConstructor@AllArgsConstructor
@Setter@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j


@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Date date;
    BigDecimal total;
    String type;
    String item;

    @ManyToOne
    Category category;
}
