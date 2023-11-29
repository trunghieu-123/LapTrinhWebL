package com.example.ban_hai_san.Model;

public class Products {
    private String id, idImage, idSupplier, idCategories, nameOfProduct;
    private int view;

    public Products(String id, String idImage, String idSupplier, String idCategories, String nameOfProduct, int view) {
        this.id = id;
        this.idImage = idImage;
        this.idSupplier = idSupplier;
        this.idCategories = idCategories;
        this.nameOfProduct = nameOfProduct;
        this.view = view;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdImage() {
        return idImage;
    }

    public void setIdImage(String idImage) {
        this.idImage = idImage;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(String idCategories) {
        this.idCategories = idCategories;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", idImage='" + idImage + '\'' +
                ", idSupplier='" + idSupplier + '\'' +
                ", idCategories='" + idCategories + '\'' +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", view=" + view +
                '}';
    }
}
