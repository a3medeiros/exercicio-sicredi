# language: pt

Funcionalidade: Sicredi Simulator Scenarios to Test

  Contexto:
    Dado que o navegador esteja na página de simulador da Sicredi

  @teste-exercicio-obrigatorio
  Cenário: Formulário é exibido página do Simulador Sicredi
    Então é possível ver campos do formulário

  @teste-exercicio-obrigatorio
  Esquema do Cenário: Realizar simulação na página do Simulador Sicredi
    Quando o associado preenche o formulário com o "<valor>"
    E com a "<quantidade de tempo>" válidos
    E realizam a simulação
    Então valor a ser poupado no tempo pesquisado é exibido
    E tabela de outras opções é exibida
    Exemplos:
      | valor   | quantidade de tempo |
      | 4000    | 6                   |
      | 2000    | 12                  |
      | 100000  | 24                  |
      | 50000   | 33                  |

  @teste-exercicio-obrigatorio
  Esquema do Cenário: Mensagem de valor inválido do Simulador Sicredi é exibida
    Quando o associado digita o "<valor>" no campo de quantia de aplicação
    E o associado digita o "<valor>" no campo de quantia de poupança
    Então mensagem de valor inválido é exibida
    Exemplos:
      | valor   |
      | 100     |
      | 1000    |
      | 1900    |


  @exercicio-nao-obrigatorio
    Esquema do Cenário: Limpar formulário de simulação na página do Simulador Sicredi
      Quando o associado preenche o formulário com o "<valor>"
      E com a "<quantidade de tempo>" válidos
      E clica em Limpar Formulário
      Então formulario de simulação é exibido vazio
      Exemplos:
        | valor   | quantidade de tempo |
        | 5000    | 7                   |
        | 12000   | 24                  |

   @exercicio-nao-obrigatorio
   Esquema do Cenário: Realizar nova simulação na página do Simulador Sicredi
      Quando o associado preenche o formulário com o "<valor>"
      E com a "<quantidade de tempo>" válidos
      E realiza a simulação
      E após ver os valores deseja realizar uma nova pesquisa voltando para a tela inicial
      Então formulario de simulação é exibido vazio
      Exemplos:
       | valor   | quantidade de tempo |
       | 8000    | 10                   |
       | 17000   | 15                  |