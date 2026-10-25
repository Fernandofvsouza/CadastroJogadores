package dev.fernandosouza.CadastroDeJogadores.Service;

import dev.fernandosouza.CadastroDeJogadores.Model.JogadoresModel;
import dev.fernandosouza.CadastroDeJogadores.Repository.JogadoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadoresService {
    private final JogadoresRepository jogadoresRepository;

    public JogadoresService(JogadoresRepository jogadoresRepository) {
        this.jogadoresRepository = jogadoresRepository;
    }

    //Listar todos os jogadores
    public List<JogadoresModel> listarJogadores() {
        return jogadoresRepository.findAll();
    }

    //Listar todos os jogadores por ID
    public JogadoresModel buscarJogadorPorId(long id) {
        return jogadoresRepository.findById(id).orElse(null);
    }

    //Criar um novo jogador
    public JogadoresModel criarJogador(JogadoresModel jogador) {
        return jogadoresRepository.save(jogador);
    }

    //Deletar o ninja
    public void deletarJogador(Long id){
        jogadoresRepository.deleteById(id);
    }

    //Atualizar Ninja
    public JogadoresModel atualizarJogador(Long id, JogadoresModel jogador) {
        Optional<JogadoresModel> jogadores = jogadoresRepository.findById(id);
        if(jogadores.isPresent()) {
            JogadoresModel jogadorExistente = jogadores.get();
            jogadorExistente.setNome(jogador.getNome());
            jogadorExistente.setIdade(jogador.getIdade());
            jogadorExistente.setNacionalidade(jogador.getNacionalidade());
            jogadorExistente.setEquipa(jogador.getEquipa());
            jogadorExistente.setPosicao(jogador.getPosicao());

            return jogadoresRepository.save(jogadorExistente);
        }
        return null;
    }
}
