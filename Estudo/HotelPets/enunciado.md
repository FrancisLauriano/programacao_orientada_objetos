Hotel para Pets, Pet e Cuidador

Classe Pet

Atributos:

nome - String
codigo - int
especie - String
alimentacoes - Boolean[10]

O vetor começa com null.

Classe EspacoPet

Atributos:

nome - String
ocupado - boolean
pets - Pet[10]
dia - int começando em 0

Método:

alternar()

Classe Cuidador

Atributos:

nome - String
matricula - int
espaco - EspacoPet

Métodos:

iniciarDia()
registrarAlimentacao(boolean[] alimentacoes)
finalizarDia()

Na alimentação, cada posição representa se o pet foi alimentado naquele dia.

Ao finalizar, incremente o dia.