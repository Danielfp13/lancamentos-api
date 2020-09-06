CREATE TABLE pessoa(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	ativo BOOLEAN NOT NULL,
	lougradouro VARCHAR(80) NOT NULL,
	numero VARCHAR(80) NOT NULL,
	complemento VARCHAR(80),
	bairro VARCHAR(80) NOT NULL,
	cep VARCHAR(9) NOT NULL,
	cidade VARCHAR(80) NOT NULL,
	estado VARCHAR(2) NOT NULL
);