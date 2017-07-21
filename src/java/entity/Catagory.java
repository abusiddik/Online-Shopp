package entity;
// Generated Feb 5, 2017 7:41:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Catagory generated by hbm2java
 */
public class Catagory  implements java.io.Serializable {


     private Integer catId;
     private String catName;
     private String catDesc;
     private Set subCatagories = new HashSet(0);

    public Catagory() {
    }

	
    public Catagory(String catName, String catDesc) {
        this.catName = catName;
        this.catDesc = catDesc;
    }
    public Catagory(String catName, String catDesc, Set subCatagories) {
       this.catName = catName;
       this.catDesc = catDesc;
       this.subCatagories = subCatagories;
    }
   
    public Integer getCatId() {
        return this.catId;
    }
    
    public void setCatId(Integer catId) {
        this.catId = catId;
    }
    public String getCatName() {
        return this.catName;
    }
    
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public String getCatDesc() {
        return this.catDesc;
    }
    
    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }
    public Set getSubCatagories() {
        return this.subCatagories;
    }
    
    public void setSubCatagories(Set subCatagories) {
        this.subCatagories = subCatagories;
    }




}


