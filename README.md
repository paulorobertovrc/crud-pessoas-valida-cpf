**CRUD JAVA PARA CADASTRO DE PESSOAS**

- O software roda em loop até que o usuário informe que deseja sair da aplicação a partir da opção 5 do menu principal;
- Antes de cadastrar uma pessoa, o software verifica se o nome e o CPF informado são válidos, conforme as regras de negócio (o atributo nome aceita apenas letras maiúsculas ou minúsculas e o CPF aceita apenas números no formado NNNNNNNNNNN ou NNN.NNN.NNN-NN), e somente instancia o objeto após essa validação;
- Do mesmo modo, é previamente realizada a validação do CPF no que diz respeito ao cálculo dos dígitos verificadores. O algoritmo que realiza essa validação foi escrito por mim e  valida apenas matematicamente o número informado;
- Ambas as etapas de validação utilizam-se de expressões regulares (Regex);
- Nas opções de busca e exclusão de uma pessoa, há uma etapa que verifica se o banco de dados está vazio antes de realizar a operação.
- Considerando os fins didáticos e para facilitar a implementação, optou-se por utilizar uma estrutura de dados (array list) para armazenas os objetos.