Hospital, Paciente e Enfermeiro

Classe Paciente

Atributos:

nome - String
codigo - int
idade - int
medicacoes - Boolean[10]

O vetor deve começar com null.

Classe Enfermaria

Atributos:

numero - int
emAtendimento - boolean
pacientes - Paciente[10]
turno - int começando em 0

Método:

alternar()

Inverte emAtendimento.

Classe Enfermeiro

Atributos:

nome - String
coren - String
enfermaria - Enfermaria

Métodos:

iniciarTurno()

Caso não exista atendimento em andamento, iniciar e alterar o estado.

registrarMedicacoes(boolean[] medicacoes)

Cada posição representa se o paciente recebeu ou não medicação naquele turno.

Use turno como índice do vetor de cada paciente.

finalizarTurno()

Finalize apenas se houver atendimento em andamento, altere o estado e incremente turno.