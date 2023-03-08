package com.project.turtle.core.products;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class ProductDAO {

        @Id
        @Column(name= "p_id")
        @Getter @Setter
        private int pId;

        @Column(name= "p_name",
                length = 100)
        @Getter @Setter
        private String pName;

        @Enumerated(EnumType.STRING)
        @Column(name= "p_type")
        @Getter @Setter
        private ProductType pType;

        @Column(name= "p_code",
                length = 50)
        @Getter @Setter
        private String pCode;

        @Column(name= "hsn_code",
                length = 100)
        @Getter @Setter
        private String hsnCode;

        @Column(name= "barcode_symbology",
                length = 50)
        @Getter @Setter
        private String barcodeSymbology;

        @Column(name= "category_id")
        @Getter @Setter
        private int categoryId;

        @Column(name= "unit_id")
        @Getter @Setter
        private int unitId;

        @Column(name= "p_image")
        @Getter @Setter
        private String pImage;

        @Column(name= "description")
        @Getter @Setter
        private String description;



}
