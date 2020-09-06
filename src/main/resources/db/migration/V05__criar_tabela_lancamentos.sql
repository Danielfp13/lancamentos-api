CREATE TABLE lancamento (
	id SERIAL PRIMARY KEY,
	descricao VARCHAR(50) NOT NULL,
	data_vencimento DATE NOT NULL,
	data_pagamento DATE,
	valor DECIMAL(10,2) NOT NULL,
	observacao VARCHAR(100),
	tipo VARCHAR(20) NOT NULL,
	codigo_categoria BIGINT NOT NULL,
	id_pessoa BIGINT NOT NULL,
	FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo),
	FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
) ;

