
package com.example.Ap2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_cliente")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (nullable = false)
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String email;

    @Column (nullable = false)
    private String telefone;
}
