package com.project.turtle.core.products;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

import java.math.BigDecimal;
import java.util.Date;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_to_store")
public class ProductToStoreDAO {

    @Id
    @Column(name= "id")
    @Getter
    @Setter
    private long id;

    @Column(name= "product_id")
    @Getter @Setter
    private int productId;

    @Column(name= "store_id")
    @Getter @Setter
    private int storeId;

    @Column(name= "purchase_price")
    @Getter @Setter
    private BigDecimal purchasePrice;

    @Column(name= "sell_price")
    @Getter @Setter
    private BigDecimal sellPrice;

    @Column(name= "quantity_in_stock")
    @Getter @Setter
    private int quantityStock;

    @Column(name= "alert_quantity")
    @Getter @Setter
    private int alertQuantity;

    @Column(name= "sup_id")
    @Getter @Setter
    private int supId;

    @Column(name= "brand_id")
    @Getter @Setter
    private int brandId;

    @Column(name= "box_id")
    @Getter @Setter
    private int boxId;

    @Column(name= "taxrate_id")
    @Getter @Setter
    private int taxrateId;

    @Column(name= "tax_method",length = 55)
    @Getter @Setter
    private String taxMethod;

    @Column(name= "preference")
    @Getter @Setter
    private String preference;

    @Column(name= "e_date")
    @Getter @Setter
    private LocalDate eDate;

    @Column(name= "p_date")
    @Getter @Setter
    private LocalDate pDate;

    @Column(name= "status")
    @Getter @Setter
    private int status;

    @Column(name= "sort_order")
    @Getter @Setter
    private int sortOrder;

}
