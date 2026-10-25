package dev.fernandosouza.CadastroDeJogadores.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_jogadores")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JogadoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_jogadores")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "idade")
    private int idade;

    @Column (name = "Nacionalidade")
    private String nacionalidade;

    @Column (name = "Equipa")
    private String equipa;

    @Column (name = "posicao")
    private String posicao;
}
