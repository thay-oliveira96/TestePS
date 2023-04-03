package br.com.elawtasks.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.elawtasks.dao.TasksDAO;
import br.com.elawtasks.entity.Tasks;

@ManagedBean
@SessionScoped
public class TasksController implements Serializable{
	private static final long serialVersionUID = 1L;
	private TasksDAO tasksDAO = new TasksDAO();
	 
	 public List<Tasks> listarCompromissos(Tasks tasks, Date data) {
	        return tasksDAO.listar();
	}
}
