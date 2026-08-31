Escola de Música, Aluno e Professor de Música

Classe AlunoMusica

Atributos:

nome - String
matricula - int
instrumento - String
presencas - Boolean[10]

Classe SalaMusica

Atributos:

numero - int
ocupada - boolean
alunos - AlunoMusica[10]
aula - int começando em 0

Método:

alternar()

Classe ProfessorMusica

Atributos:

nome - String
matricula - int
instrumento - String
sala - SalaMusica

Métodos:

iniciarAula()
chamada(boolean[] chamada)
finalizarAula()