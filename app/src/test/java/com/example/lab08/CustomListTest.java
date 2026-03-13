//package com.example.lab08;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//
//public class CustomListTest {
//
//    @Test
//    public void testHasCity() {
//        CustomList list = new CustomList();
//        City calgary = new City("Calgary", "AB");
//
//        // Before adding, it should be false
//        assertFalse(list.hasCity(calgary));
//
//        list.addCity(calgary);
//
//        // After adding, it should be true
//        assertTrue(list.hasCity(calgary));
//    }
//
//    @Test
//    public void testHasCityWithNewInstance() {
//        CustomList list = new CustomList();
//        list.addCity(new City("Edmonton", "AB"));
//
//        // Creating a new instance with the same data should still return true
//        // because we overrode equals() in the City class.
//        City edmontonDuplicate = new City("Edmonton", "AB");
//        assertTrue(list.hasCity(edmontonDuplicate));
//    }
//}