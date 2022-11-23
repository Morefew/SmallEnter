package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "recepcion")
public class RecepcionEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recepcion_id", nullable = false, unique = true)
    private Long recepcion_Id;
}
