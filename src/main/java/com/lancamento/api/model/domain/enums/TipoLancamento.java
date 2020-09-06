package com.lancamento.api.model.domain.enums;

public enum TipoLancamento {

	RECEITA(1, "RECEITA"), DESPESA(2, "DESPEDA");

	private int cod;
	private String descricao;

	private TipoLancamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static TipoLancamento toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (TipoLancamento x : TipoLancamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}