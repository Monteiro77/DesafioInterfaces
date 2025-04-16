package desafio2.service;

import desafio2.model.Atendimento;
import desafio2.model.Pessoa;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class RelatorioServiceImpl implements RelatorioService {

    @Override
    public void gerarRelatorio(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Tipo de Deficiência: " + pessoa.getTipoDeficiencia());
        System.out.println("Grau: " + pessoa.getGrau());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Atendimentos:");

        List<Atendimento> atendimentos = pessoa.getAtendimentos();
        if (atendimentos.isEmpty()) {
            System.out.println("  Nenhum atendimento registrado.");
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (Atendimento atendimento : atendimentos) {
                System.out.println("  - " + atendimento.getData().format(formatter) +
                        " | " + atendimento.getTipo() +
                        " | Profissional: " + atendimento.getProfissional());
            }
        }
    }
}
