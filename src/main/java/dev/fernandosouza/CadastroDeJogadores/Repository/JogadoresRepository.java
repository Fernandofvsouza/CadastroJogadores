package dev.fernandosouza.CadastroDeJogadores.Repository;

import dev.fernandosouza.CadastroDeJogadores.Model.JogadoresModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadoresRepository extends JpaRepository<JogadoresModel, Long> {
}
