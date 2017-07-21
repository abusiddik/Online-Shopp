/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.AddDao;
import dao.ListDao;
import entity.Catagory;
import entity.SubCatagory;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author Nayeem
 */
public class SubCatagoryMB {
    SubCatagory subcat = new SubCatagory();
    String catname;
    List<Catagory> listcat;

    public List<Catagory> getListcat() {
        return listcat;
    }

    public void setListcat(List<Catagory> listcat) {
        this.listcat = listcat;
    }

    public SubCatagory getSubcat() {
        return subcat;
    }

    public void setSubcat(SubCatagory subcat) {
        this.subcat = subcat;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
     public String addSubCatagory() {
        listcat = new ListDao().catListByName(catname);
        subcat.setSubCatId(listcat.get(0).getCatId());
        subcat.setSubCatName(subcat.getSubCatName());
        subcat.setSubCatDesc(subcat.getSubCatDesc());
       
        Boolean status = new AddDao().addSubCatagory(subcat);
        
        if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new  FacesMessage(FacesMessage.SEVERITY_INFO, "data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new  FacesMessage(FacesMessage.SEVERITY_WARN, "data not saved", ""));

        }
        return null;

    }
    public List<SelectItem> getCatagoryName(){
    List<SelectItem> catname = new ListDao().catList();
    return catname;
    }
    
}
