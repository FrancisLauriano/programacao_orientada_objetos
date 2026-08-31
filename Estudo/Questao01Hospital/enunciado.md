Exercício 1 — Hospital

Para o presente exercício, implemente apenas as classes, seus atributos e métodos.

Regras gerais
Todos os atributos devem possuir visibilidade private;
Todos os métodos devem possuir visibilidade public;
Todas as classes devem possuir construtor;
Implemente os getters e setters para os atributos;
Utilize vetores normais, não utilize ArrayList;
O hospital poderá possuir no máximo 10 pacientes;
Não permita dois pacientes com o mesmo código.
Classe Prontuario
Atributos
Número - Inteiro;
Observações - String;
Consultas - Vetor booleano de 10 posições.

O vetor consultas representa se o paciente realizou ou não uma consulta em determinado dia.

No construtor, receba:

Número;
Observações.

O vetor consultas deverá ser criado internamente com 10 posições.

Classe Paciente
Atributos
Nome - String;
Idade - Inteiro;
Código - Inteiro;
Prontuário - Objeto do tipo Prontuario.

O prontuário pertence exclusivamente ao paciente. Portanto, deverá existir uma relação de composição entre Paciente e Prontuario.

O objeto Prontuario deverá ser criado dentro do construtor de Paciente.

O construtor deverá receber:

Nome;
Idade;
Código;
Número do prontuário;
Observações.
Classe Hospital
Atributos
Nome - String;
Aberto - Booleano;
Pacientes - Vetor de 10 objetos Paciente;
Quantidade de pacientes - Inteiro.

Inicialmente:

Aberto = false;
Quantidade de pacientes = 0.
Método alternar

Altere o estado de aberto.

Se estiver:

false → true
true  → false
Método buscarPaciente

Receba:

Código do paciente.

Procure o paciente no vetor pelo seu código.

Caso encontre, retorne o índice em que o paciente está armazenado.

Caso não encontre:

return -1;
Método adicionarPaciente

Receba:

Objeto do tipo Paciente.

Utilize buscarPaciente().

Somente adicione o paciente se:

ainda existir espaço no vetor;
não existir outro paciente com o mesmo código.

O paciente deverá ser inserido no final dos pacientes cadastrados.

Caso consiga adicionar:

return true;

Caso contrário:

return false;
Método atualizarPaciente

Receba:

Código do paciente;
Novo nome;
Nova idade.

Utilize buscarPaciente().

Caso o paciente exista, atualize seu nome e sua idade utilizando os métodos setters da classe Paciente.

Caso consiga atualizar:

return true;

Caso não encontre o paciente:

return false;
Método atualizarObservacao

Receba:

Código do paciente;
Nova observação.

Utilize buscarPaciente().

Caso encontre o paciente, obtenha o seu prontuário e atualize as observações utilizando o setter correspondente.

Caso consiga atualizar:

return true;

Caso contrário:

return false;
Método removerPaciente

Receba:

Código do paciente.

Utilize buscarPaciente().

Caso encontre o paciente:

remova-o do vetor;
desloque os pacientes seguintes uma posição para trás;
mantenha as posições null no final do vetor;
diminua a quantidade de pacientes.

Caso consiga remover:

return true;

Caso contrário:

return false;
Classe Medico
Atributos
Nome - String;
CRM - String;
Especialidade - String;
Hospital - Objeto do tipo Hospital.

O objeto Hospital deverá ser recebido no construtor de Medico.

Considere uma relação de agregação entre Medico e Hospital.

Método iniciarAtendimento

Verifique o estado do hospital.

Caso esteja fechado:

informe o nome e o CRM do médico;
informe que os atendimentos foram iniciados;
utilize alternar() para abrir o hospital.

Caso o hospital já esteja aberto, informe que os atendimentos já estão acontecendo.

Método realizarConsultas

Receba:

Vetor booleano de 10 posições;
Dia - Inteiro.

Cada posição do vetor booleano corresponde à posição de um paciente no vetor de pacientes do hospital.

Exemplo:

Paciente[0] → true
Paciente[1] → false
Paciente[2] → true

Significa que os pacientes das posições 0 e 2 realizaram consulta e o paciente da posição 1 não realizou.

O parâmetro dia deverá ser utilizado como índice do vetor consultas existente no prontuário de cada paciente.

Somente aceite valores de dia entre 0 e 9.

Método finalizarAtendimento

Caso o hospital esteja aberto:

informe que os atendimentos foram encerrados;
utilize alternar() para fechar o hospital.

Caso esteja fechado, informe que não existe atendimento acontecendo.