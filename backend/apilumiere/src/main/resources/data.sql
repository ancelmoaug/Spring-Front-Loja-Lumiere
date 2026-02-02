INSERT INTO enderecos (id, estado, municipio, cep, bairro, rua, numero, complemento)
VALUES (1, 'BA', 'Irecê', '44900-000', 'Centro', 'Rua A', '123', 'Apto 1');

INSERT INTO telefones (id, numero)
VALUES (1, '74999999999');

INSERT INTO dados_bancarios (id, codigoAgencia, numeroConta, codigoBanco)
VALUES (1, '1234', '56789-0', '001');

INSERT INTO usuarios (
    id, nome, sobrenome, senha, data_de_nascimento, cpf, email,
    telefone_id, endereco_id, dados_bancarios_id
) VALUES (
    1, 'Wild', 'Barreto', '123456',
    '1999-05-10', '12345678989', 'wildbarreto@email.com',
    1, 1, 1
);

INSERT INTO clientes (usuario_id)
VALUES (1);