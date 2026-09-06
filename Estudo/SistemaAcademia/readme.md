Questão 1 — Sistema de Academia

Desenvolva, em Java, um sistema orientado a objetos para representar o funcionamento de uma academia. O sistema deverá permitir o cadastro e gerenciamento de alunos e instrutores, controle de ficha de treino, frequência, plano, turnos e estado de funcionamento da academia.

Considere as seguintes regras gerais: todos os atributos devem possuir visibilidade private, todos os métodos devem possuir visibilidade public, todas as classes devem possuir construtor, e devem ser implementados getters e setters para os atributos. Utilize apenas vetores normais, não sendo permitido o uso de ArrayList. Em operações de busca, retorne o índice do elemento encontrado ou -1 caso ele não exista. Em operações de remoção, os elementos posteriores devem ser deslocados para que as posições null permaneçam ao final do vetor.

Crie um enum denominado Plano com os valores BASICO, PREMIUM e VIP, e outro enum denominado Turno com os valores MANHA, TARDE e NOITE.

Implemente a classe Pessoa com os atributos nome, idade, matricula e ativo. O atributo ativo deve iniciar com valor true. A classe deve possuir um método alternarAtivo() que altere o valor lógico do atributo. A classe Pessoa deverá funcionar como superclasse.

Implemente a classe FichaTreino com os atributos codigo, um vetor String chamado modalidades com 5 posições, um vetor boolean chamado frequencias com 10 posições e um atributo qtdModalidades. Implemente os métodos buscarModalidade, adicionarModalidade, atualizarModalidade, removerModalidade e registrarFrequencia. O método de busca deverá retornar o índice da modalidade ou -1. Não devem ser permitidas modalidades repetidas. Na remoção, os elementos seguintes devem ser deslocados. O método registrarFrequencia deverá receber um dia entre 0 e 9 e um valor booleano.

Implemente a classe Aluno herdando de Pessoa. Além dos atributos herdados, a classe deve possuir plano, do tipo Plano, vip, do tipo booleano, e ficha, do tipo FichaTreino. O objeto FichaTreino deverá ser criado dentro do construtor de Aluno, caracterizando uma relação de composição. O construtor deverá utilizar super(...). Implemente também o método alterarPlano(Plano novoPlano).

Implemente a classe Instrutor herdando de Pessoa. A classe deve possuir ainda especialidade, um vetor Turno de 3 posições chamado turnos e qtdTurnos. Implemente os métodos buscarTurno, adicionarTurno, atualizarTurno e removerTurno. Não devem ser permitidos turnos repetidos.

Implemente a classe Academia com os atributos nome, aberta, um vetor de 10 objetos do tipo Pessoa e qtdPessoas. O vetor deverá ser capaz de armazenar tanto objetos Aluno quanto objetos Instrutor, utilizando polimorfismo de subtipo. O conteúdo da Aula 5 trabalha justamente essa relação entre superclasse, subclasse e substituição de objetos.

A classe Academia deverá possuir os métodos alternar, buscarPessoa, adicionarPessoa, atualizarPessoa, removerPessoa e listarPessoas. A busca deve ocorrer pela matrícula. Não permita matrículas repetidas. Os métodos de atualização e remoção devem reutilizar o método de busca sempre que possível.

Implemente ainda a classe Treinador, contendo os atributos nome, registro e academia. O objeto Academia deverá ser recebido pelo construtor, caracterizando uma relação de agregação. A classe deverá possuir os métodos iniciarExpediente, registrarTreino, alterarPlanoAluno e finalizarExpediente.

O método iniciarExpediente deverá abrir a academia caso ela esteja fechada. O método registrarTreino deverá receber um objeto Aluno, um dia e um valor booleano, acessando a ficha do aluno para registrar sua frequência. O método alterarPlanoAluno deverá receber um aluno e um novo valor do enum Plano. O método finalizarExpediente deverá encerrar o funcionamento da academia caso ela esteja aberta.