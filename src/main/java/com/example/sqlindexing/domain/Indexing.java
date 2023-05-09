package com.example.sqlindexing.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "indexing", indexes = {
        @Index(columnList = "firstName"),
        @Index(name = "fn_index", columnList = "firstName"),
        @Index(name = "mulitIndex1", columnList = "firstName, lastName"),
        @Index(name = "mulitIndex2", columnList = "lastName, firstName"),
        @Index(name = "mulitSortIndex", columnList = "firstName, lastName DESC"),
        @Index(name = "uniqueIndex", columnList = "firstName", unique = true),
        @Index(name = "uniqueMulitIndex", columnList = "firstName, lastName", unique = true)
    }
)
public class Indexing {
    @Id
    Long id;
    private String firstName;
    private String lastName;
    private String born;
    private String address;
}
