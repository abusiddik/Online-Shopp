/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.AddDao;
import entity.Catagory;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

/**
 *
 * @author Nayeem
 */
@ManagedBean
@SessionScoped
public class CatagoryMB {

    Catagory catagory = new Catagory();

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    public String addCatagory() {
        catagory.setCatName(catagory.getCatName());
        catagory.setCatDesc(catagory.getCatDesc());
        new AddDao().addCatagory(catagory);
        Boolean status = new AddDao().addCatagory(catagory);
        
        if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new  FacesMessage(FacesMessage.SEVERITY_INFO, "data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new  FacesMessage(FacesMessage.SEVERITY_WARN, "data not saved", ""));

        }
        return null;

    }
}
