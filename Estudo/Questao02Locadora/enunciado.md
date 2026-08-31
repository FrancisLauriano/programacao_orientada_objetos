Exercício 2 — Locadora

Para o presente exercício, implemente apenas as classes, seus atributos e métodos.

Regras gerais
Todos os atributos devem possuir visibilidade private;
Todos os métodos devem possuir visibilidade public;
Todas as classes devem possuir construtor;
Implemente os getters e setters;
Utilize vetores normais, não utilize ArrayList;
A locadora poderá possuir no máximo 10 filmes e 10 clientes;
Um cliente poderá possuir no máximo 5 filmes alugados;
Não permita filmes com códigos repetidos;
Não permita clientes com CPFs repetidos.
Classe Filme
Atributos
Título - String;
Código - Inteiro;
Valor - Double;
Disponível - Booleano.

O atributo disponivel deverá começar com:

true
Classe Carteira
Atributos
Número - Inteiro;
Saldo - Double;
Histórico - Vetor booleano de 10 posições.

O vetor historico representa se o cliente realizou ou não uma locação em determinado dia.

No construtor, receba:

Número;
Saldo.

O vetor historico deverá ser criado internamente com 10 posições.

Classe Cliente
Atributos
Nome - String;
CPF - String;
VIP - Booleano;
Carteira - Objeto do tipo Carteira;
Filmes - Vetor de 5 objetos Filme;
Quantidade de filmes - Inteiro.

A Carteira pertence exclusivamente ao cliente. Portanto, considere uma relação de composição entre Cliente e Carteira.

A carteira deverá ser criada dentro do construtor de Cliente.

O vetor de filmes também deverá ser criado no construtor.

Inicialmente:

Quantidade de filmes = 0.
Método buscarFilme

Receba:

Código do filme.

Procure o filme dentro do vetor de filmes alugados pelo cliente.

Caso encontre, retorne seu índice.

Caso não encontre:

return -1;
Método adicionarFilme

Receba:

Objeto do tipo Filme.

Somente adicione o filme se:

existir espaço no vetor de filmes do cliente;
o filme estiver disponível.

Ao adicionar o filme:

Disponível = false.

Aumente a quantidade de filmes.

Caso consiga adicionar:

return true;

Caso contrário:

return false;
Método removerFilme

Receba:

Código do filme.

Utilize buscarFilme().

Caso encontre:

altere a disponibilidade do filme para true;
remova o filme;
desloque os filmes seguintes uma posição para trás;
mantenha as posições null no final;
diminua a quantidade de filmes.

Caso consiga remover:

return true;

Caso contrário:

return false;
Classe Locadora
Atributos
Nome - String;
Aberta - Booleano;
Filmes - Vetor de 10 objetos Filme;
Clientes - Vetor de 10 objetos Cliente;
Quantidade de filmes - Inteiro;
Quantidade de clientes - Inteiro.

Inicialmente:

Aberta = false;
Quantidade de filmes = 0;
Quantidade de clientes = 0.
Método alternar

Altere o estado de aberta:

false → true
true  → false
Método buscarFilme

Receba:

Código do filme.

Procure o filme no vetor.

Caso encontre, retorne seu índice.

Caso não encontre:

return -1;
Método adicionarFilme

Receba:

Objeto do tipo Filme.

Utilize buscarFilme().

Não permita adicionar caso:

o vetor esteja cheio;
já exista um filme com o mesmo código.

Caso consiga adicionar:

return true;

Caso contrário:

return false;
Método atualizarFilme

Receba:

Código do filme;
Novo título;
Novo valor.

Utilize buscarFilme().

Caso encontre, atualize o título e o valor utilizando os setters do objeto Filme.

Caso consiga atualizar:

return true;

Caso contrário:

return false;
Método buscarCliente

Receba:

CPF do cliente.

Procure o cliente pelo CPF.

Caso encontre, retorne seu índice.

Caso não encontre:

return -1;
Método adicionarCliente

Receba:

Objeto do tipo Cliente.

Utilize buscarCliente().

Não permita adicionar caso:

o vetor esteja cheio;
já exista um cliente com o mesmo CPF.

Caso consiga adicionar:

return true;

Caso contrário:

return false;
Método atualizarCliente

Receba:

CPF do cliente;
Novo nome;
Novo estado VIP.

Utilize buscarCliente().

Caso encontre o cliente, atualize:

Nome;
VIP.

Utilize os setters correspondentes.

Caso consiga atualizar:

return true;

Caso contrário:

return false;
Método atualizarSaldoCliente

Receba:

CPF do cliente;
Novo saldo.

Utilize buscarCliente().

Caso encontre, acesse a carteira pertencente ao cliente e atualize seu saldo.

Caso consiga atualizar:

return true;

Caso contrário:

return false;
Método removerCliente

Receba:

CPF do cliente.

Utilize buscarCliente().

Caso encontre:

remova o cliente;
desloque os clientes seguintes uma posição para trás;
mantenha as posições null no final;
diminua a quantidade de clientes.

Caso consiga remover:

return true;

Caso contrário:

return false;
Método removerFilme

Receba:

Código do filme.

Utilize buscarFilme().

Caso encontre:

remova o filme;
desloque os filmes seguintes uma posição para trás;
mantenha as posições null no final;
diminua a quantidade de filmes.

Caso consiga remover:

return true;

Caso contrário:

return false;
Classe Funcionario
Atributos
Nome - String;
Matrícula - Inteiro;
Locadora - Objeto do tipo Locadora.

O objeto Locadora deverá ser recebido no construtor de Funcionario.

Considere uma relação de agregação entre Funcionario e Locadora.

Método iniciarExpediente

Caso a locadora esteja fechada:

informe o nome e a matrícula do funcionário;
informe que o expediente foi iniciado;
utilize alternar() para abrir a locadora.

Caso já esteja aberta, informe que o expediente já está acontecendo.

Método alugarFilme

Receba:

CPF do cliente;
Código do filme;
Dia - Inteiro.

O método deverá:

Utilizar buscarCliente() da locadora;
Utilizar buscarFilme() da locadora;
Verificar se o cliente existe;
Verificar se o filme existe;
Verificar se o filme está disponível;
Adicionar o filme ao vetor de filmes alugados pelo cliente;
Registrar true na posição correspondente ao dia no vetor historico da carteira do cliente.

Somente aceite valores de dia entre 0 e 9.

Caso alguma condição não seja atendida, informe que não foi possível realizar a locação.

Método devolverFilme

Receba:

CPF do cliente;
Código do filme.

O método deverá:

buscar o cliente pelo CPF;
verificar se o cliente existe;
utilizar o método removerFilme() do cliente;
ao realizar a devolução, o filme deverá voltar a ficar disponível.
Método finalizarExpediente

Caso a locadora esteja aberta:

informe que o expediente foi encerrado;
utilize alternar() para fechar a locadora.

Caso esteja fechada, informe que não existe expediente acontecendo.