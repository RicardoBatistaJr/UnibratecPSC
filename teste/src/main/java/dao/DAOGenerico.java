package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import teste.UtilJPA;
import Interfaces.InterfaceDAO;
import Interfaces.InterfaceEntidade;


public abstract class DAOGenerico<T extends InterfaceEntidade> 
	implements InterfaceDAO {
    
    private static EntityManager Em = UtilJPA.getEntityManager();
    
    public T findById(Class<T> classe, int id){
             return Em.find(classe, id);
    }
    
    
    public void saveOrUpdate(T obj){
        try
        {
            Em.getTransaction().begin();
            if(obj.getPK()  == null){
                Em.persist(obj);
            }
            else
            {
                Em.merge(obj);
            }
            Em.getTransaction().commit();
            }catch(Exception e){
                    Em.getTransaction().rollback();
                    //throw e;
            }
    }

    public void remove(Class<T> classe, int id){
        T t = findById(classe, id);
        try{
            Em.getTransaction().begin();
            Em.remove(t);
            Em.getTransaction().commit();
        }catch (Exception e) {
            Em.getTransaction().rollback();
        }
    }
    
    public Object consultarTodos(){
        EntityManager em = UtilJPA.getEntityManager();
        
        Object list ;
        
        try{
           String  query = "";
           
           Query q;
            q = em.createNamedQuery("Aluno.selectAll");
          list = q.getResultList();
            
        }catch(Exception ex){
            list = new ArrayList();
        }finally{
            em.close();
        }
        return list;
    }
    
    public void excluirPorObjeto(InterfaceEntidade pEntidade) {
    	
    }
    		
    
}
