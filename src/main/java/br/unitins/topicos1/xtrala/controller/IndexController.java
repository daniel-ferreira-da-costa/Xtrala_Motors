package br.unitins.topicos1.xtrala.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.topicos1.xtrala.model.Veiculo;

@Named
@ViewScoped
public class IndexController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5339487070103225629L;
	private Veiculo veiculo = null;
	private List<Veiculo> listaVeiculo;
	
	public void incluir() {
		getListaVeiculo().add(getVeiculo());
		limpar();
	}
	
	public void limpar() {
		veiculo = null;
	}

	public void editar(Veiculo vei) {
		setVeiculo(new Veiculo());
		getVeiculo().setMarca(vei.getMarca());
		getVeiculo().setModelo(vei.getModelo());
		getVeiculo().setTipo(vei.getTipo());
		getVeiculo().setValor(vei.getValor());
		getVeiculo().setDescricao(vei.getDescricao());
	}

	public List<Veiculo> getListaVeiculo() {
		if (listaVeiculo == null)
			listaVeiculo = new ArrayList<Veiculo>();
		return listaVeiculo;
	}

	public Veiculo getVeiculo() {
		if (veiculo == null) {
			veiculo = new Veiculo();
		}
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
