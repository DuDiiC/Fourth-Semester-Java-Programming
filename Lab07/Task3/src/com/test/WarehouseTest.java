package com.test;

import com.company.Warehouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WarehouseTest {

    private Warehouse warehouse;

    @BeforeEach
    void setUp() {
        warehouse = new Warehouse(3);
    }

    @Test
    void testConstructorThrows() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            warehouse = new Warehouse(-3);
        });
    }

    @Test
    void testAddProductThrows() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> warehouse.addProduct(-2, 3));

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> warehouse.addProduct(warehouse.getProductsNumber()+1, 3));

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                warehouse.addProduct(warehouse.getProductsNumber()-1, -2));
    }

    @Test
    void testAddProductWorking() {
        for(int i = 0; i < warehouse.getProductsNumber(); i++) {
            Assertions.assertEquals(0, warehouse.returnProduct(i));
        }

        warehouse.addProduct(2, 4);
        Assertions.assertEquals(4, warehouse.returnProduct(2));

        warehouse.addProduct(2, 7);
        Assertions.assertEquals(11, warehouse.returnProduct(2));

        warehouse.addProduct(0, 3);
        Assertions.assertEquals(3, warehouse.returnProduct(0));
    }

    @Test
    void testSpendProductThrows() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> warehouse.spendProduct(-3, 3));

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> warehouse.spendProduct(warehouse.getProductsNumber()+4, -3));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> warehouse.spendProduct(warehouse.getProductsNumber()-1, -3));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> warehouse.spendProduct(2, 2));
    }

    @Test
    void testSpendProductWorking() {
        for(int i = 0; i < warehouse.getProductsNumber(); i++) {
            warehouse.addProduct(i, i+4);
        }

        warehouse.spendProduct(0, 2);
        Assertions.assertEquals(2, warehouse.returnProduct(0));

        warehouse.spendProduct(2, 3);
        Assertions.assertEquals(3, warehouse.returnProduct(2));

        warehouse.spendProduct(2, 3);
        Assertions.assertEquals(0, warehouse.returnProduct(2));
    }

    @Test
    void testResetProductThrows() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> warehouse.resetProduct(-1));

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> warehouse.resetProduct(warehouse.getProductsNumber()+3));
    }

    @Test
    void testResetProductWorking() {
        for(int i = 0; i < warehouse.getProductsNumber(); i++) {
            warehouse.addProduct(i, i+7);
        }

        Assertions.assertEquals(8, warehouse.resetProduct(1));
        Assertions.assertEquals(0, warehouse.returnProduct(1));
        Assertions.assertNotEquals(0, warehouse.resetProduct(2));
    }

    @Test
    void testReturnProductThrows(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> warehouse.returnProduct(-1));

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> warehouse.returnProduct(warehouse.getProductsNumber()+4));
    }

    @Test
    void testReturnProductWorking(){
        for(int i = 0; i < warehouse.getProductsNumber(); i++) {
            Assertions.assertEquals(0, warehouse.returnProduct(i));
        }

        warehouse.addProduct(2, 3);
        Assertions.assertEquals(3, warehouse.returnProduct(2));
    }

    @Test
    void testReturnAllProductsNumberWorking() {
        Assertions.assertEquals(0, warehouse.returnAllProductsNumber());

        for(int i = 0; i < warehouse.getProductsNumber(); i++) {
            warehouse.addProduct(i, i+2);
        }

        Assertions.assertEquals(9, warehouse.returnAllProductsNumber());
    }
}
