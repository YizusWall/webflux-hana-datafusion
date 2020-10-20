package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;

@Document(collection ="products")
public class Product {
   
   @Id
   private String ProductID;
   @NotNull
   private String TypeCode;
   @NotNull
   private String  Category;
   @NotNull
   private String  Name;
   private String  Description; 
   private String  SupplierID;
   private String  MeasureUnit;
   private Integer  WeightUnit;
   @NotNull
   private String CurrencyCode;
   @NotNull
   private Integer  Price;

   public String getProductID() {
       return ProductID;
   }

   public void setProductID(String productID) {
       ProductID = productID;
   }

   public String getTypeCode() {
       return TypeCode;
   }

   public void setTypeCode(String typeCode) {
       TypeCode = typeCode;
   }

   public String getCategory() {
       return Category;
   }

   public void setCategory(String category) {
       Category = category;
   }

   public String getName() {
       return Name;
   }

   public void setName(String name) {
       Name = name;
   }

   public String getDescription() {
       return Description;
   }

   public void setDescription(String description) {
       Description = description;
   }

   public String getSupplierID() {
       return SupplierID;
   }

   public void setSupplierID(String supplierID) {
       SupplierID = supplierID;
   }

   public String getMeasureUnit() {
       return MeasureUnit;
   }

   public void setMeasureUnit(String measureUnit) {
       MeasureUnit = measureUnit;
   }

   public Integer getWeightUnit() {
       return WeightUnit;
   }

   public void setWeightUnit(Integer weightUnit) {
       WeightUnit = weightUnit;
   }

   public String getCurrencyCode() {
       return CurrencyCode;
   }

   public void setCurrencyCode(String currencyCode) {
       CurrencyCode = currencyCode;
   }

   public Integer getPrice() {
       return Price;
   }

   public void setPrice(Integer price) {
       Price = price;
   }

@Override
public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
}


@Override
public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
}
   
}