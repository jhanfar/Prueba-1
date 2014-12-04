package com.proint1.udea.actividad.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.proint1.udea.actividad.entidades.TipoActividad;
import com.proint1.udea.actividad.ngc.TipoActividadInterfaceDAO;




/**
 * DAO de persistencia para la entyidad {@link TipoActividadInterfaceDAO}
 * TODO FUNCIONALIDAD
 * @author Juan Cardona
 * @since 16/05/2014
 */
public class TipoActividadDAO extends HibernateDaoSupport implements TipoActividadInterfaceDAO{

	
	
	@Override
	public List<TipoActividad> getTipoActividadList() {
		String hql = "Select ta from TipoActividad ta";
		Query query = getSession().createQuery(hql);
		List<TipoActividad> response = (ArrayList<TipoActividad>) query.list();
		return response;
	}
	
	@Override
	public String crearTipoActividad(TipoActividad tipoActividad){
		
		Session session = null;
		Transaction tx = null;
		
		try{
			session = getSession();
			
			tx = session.beginTransaction();
			session.save(tipoActividad);
			
			tx.commit();
			
			return "OK";
		}catch(HibernateException e){
		    tx.rollback();
			throw e;
		}
		
	}

	@Override
	public void eliminarTipoActividad(TipoActividad tipoActividad) {
		String hql = "delete from TipoActividad where nbTacIdn=:parCursoIdn";
		Query query = getSession().createQuery(hql);
		query.setParameter("parCursoIdn", tipoActividad.getNbTacIdn());
		query.executeUpdate();	
		
	}

	@Override
	public void editarTipoActividad(TipoActividad tipoActividad) {
		String hql1 = "update from TipoActividad set nombre = ?, descripcion = ? where nbTacIdn= ?";
		Query query1 = getSession().createQuery(hql1);
		query1.setParameter(0, tipoActividad.getNombre());
		query1.setParameter(1, tipoActividad.getDescripcion());
		query1.setParameter(2, tipoActividad.getNbTacIdn());
		query1.executeUpdate();		
	}
}
