package BEAN;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

public class Alta {
	//private Integer tipoCategoria = 0;
	//LIGAR TODOS CON SUS RESPECTIVOS CAMPOS ICEFACES
	private Integer categoria;
	private Integer modelo;
	private Integer marca;
	private String serie;
	private String codigoBarras;
	private Integer catidad;
	//VAL DE POUPOP 
	private Boolean poupop;
	//ITEM DE SELECCION
	private List<SelectItem> itemCategoria = new ArrayList<SelectItem>();
	private List<SelectItem> itemMarca = new ArrayList<SelectItem>();
	private List<SelectItem> itemModelo= new ArrayList<SelectItem>();
	//CategoriaDAO categoriaDAO = new CategoriaDAO;
	
	public Alta(){
		List<Categoria> listCategoria = categoriaDAO.findAll();
		for(Categoria cat : listCategoria){
			itemCategoria.add(new SelectItem(cat.getIdCategoria, cat.getNombre));
		}
	}
	
	
	//LIMPIAR TODOS LOS CAMPOS
	public void limpiarCampos(){
		categoria = 0;
		modelo = 0;
		marca = 0;
		serie = "";
		codigoBarras = "";
		catidad = 0;
		poupop = null;
	}
	
	//SELECCIONA CATEGORIA
	public void selectCategoria(ValueChangeEvent event) throws Exception{
		try{
			categoria = Integer.parseInt(event.getNewValue().toString());

			
		
		}catch(Exception e){
			
		}
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public Integer getMarca() {
		return marca;
	}

	public void setMarca(Integer marca) {
		this.marca = marca;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Integer getCatidad() {
		return catidad;
	}

	public void setCatidad(Integer catidad) {
		this.catidad = catidad;
	}

	public Boolean getPoupop() {
		return poupop;
	}

	public void setPoupop(Boolean poupop) {
		this.poupop = poupop;
	}

	public List<SelectItem> getItemCategoria() {
		return itemCategoria;
	}

	public void setItemCategoria(List<SelectItem> itemCategoria) {
		this.itemCategoria = itemCategoria;
	}

	public List<SelectItem> getItemMarca() {
		return itemMarca;
	}

	public void setItemMarca(List<SelectItem> itemMarca) {
		this.itemMarca = itemMarca;
	}

	public List<SelectItem> getItemModelo() {
		return itemModelo;
	}

	public void setItemModelo(List<SelectItem> itemModelo) {
		this.itemModelo = itemModelo;
	}	

}
