package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.format.Formats;
import play.data.validation.Constraints;

import com.avaje.ebean.Model.Find;


@Entity
public class Comidas extends com.avaje.ebean.Model{

	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    public String costo;
    public String bebida;
    public String stock;
    
    
   public static Find<Long,Comidas> find = new Find<Long,Comidas>(){};
    
	public static List<Comidas> listadoComi() {
		// TODO Auto-generated method stub
		return find.all();
	}
    

}
